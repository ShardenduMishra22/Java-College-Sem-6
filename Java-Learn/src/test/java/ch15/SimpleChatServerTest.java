package ch15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Needs a SimpleChatServer running (is not a real unit test class, more like an integration test)
@Disabled
class SimpleChatServerTest {
  @Test
  void testSend() throws IOException {
    Socket socket = connect();
    assertTrue(send(socket, "Hi"));
    socket.close();
  }

  @Test
  // this will work if run when there are no other clients connected
  // this will likely hang if other clients are already connected (e.g. running testReceive)
  void testSendAndReceive() throws IOException, InterruptedException {
    Socket socket = connect();
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.submit(() -> Assertions.assertEquals("Hi", receive(socket)));
    assertTrue(send(socket, "Hi"));
    Thread.sleep(10_000);
    socket.close();
  }

  @Test
  // NOT a real unit test - run this to have a client sat waiting for a response. You can get this to
  // pass by sending "Hi" to the server with another client, e.g. by calling testSend.
  void testReceive() throws IOException {
    Socket socket = connect();
    Assertions.assertEquals("Hi", receive(socket));
    socket.close();
  }

  public boolean send(Socket socket, String payload) throws IOException {
    PrintWriter writer = new PrintWriter(socket.getOutputStream());

    writer.println(payload);
    writer.flush();
    return true;
  }

  public String receive(Socket socket) {
    try (InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
         BufferedReader reader = new BufferedReader(streamReader)) {
      String message = reader.readLine();
      System.out.println("read " + message);
      return message;

    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  private Socket connect() throws IOException {
    Socket socket = new Socket("127.0.0.1", 5000);
    System.out.println(socket.getLocalPort() + " connected");
    return socket;
  }

}