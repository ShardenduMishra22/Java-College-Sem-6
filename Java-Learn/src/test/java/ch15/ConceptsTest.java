package ch15;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ConceptsTest {

  @Test
  @Disabled("This test doesn't pass or fail. I was using it to see if I could generate exceptions")
  void testConnect() throws IOException {
    SocketAddress remote1 = new InetSocketAddress("127.0.0.1", 4242);

//    SocketChannel.open(remote1);
    ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
    serverSocketChannel.bind(remote1);

    SocketAddress remote2 = new InetSocketAddress("127.0.0.1", 4242);
    SocketChannel.open(remote2);

    Socket socket = new Socket("localhost", 4242);
  }

  @Test
  void testChannelPortNumbers() throws IOException {
    SocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 3602);
    ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
    serverSocketChannel.bind(serverAddress);

    SocketChannel client1 = SocketChannel.open(serverAddress);
    System.out.println("client1.getRemoteAddress() = " + client1.getRemoteAddress());
    SocketChannel client2 = SocketChannel.open(serverAddress);
    System.out.println("client2.getRemoteAddress() = " + client2.getRemoteAddress());
  }

  @Test
  void testBlockingVsNonBlocking() throws IOException {
    int serverPort = 3600;
    ServerSocketChannel server = ServerSocketChannel.open();
    server.bind(new InetSocketAddress("localhost", serverPort));
    System.out.println("server.isBlocking() = " + server.isBlocking());

    SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", serverPort));
    System.out.println("socketChannel.isBlocking() = " + socketChannel.isBlocking());

    socketChannel.configureBlocking(true);
    System.out.println("socketChannel.isBlocking() = " + socketChannel.isBlocking());

    socketChannel.configureBlocking(false);
    System.out.println("socketChannel.isBlocking() = " + socketChannel.isBlocking());
  }

  @Test
  void testInputStreamsWithNonBlockingChannel() throws IOException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    CountDownLatch latch = new CountDownLatch(1);
    int serverPort = 3601;
    ServerSocketChannel server = ServerSocketChannel.open();
    server.bind(new InetSocketAddress("localhost", serverPort));
    executorService.submit(() -> {
      try {
        while (true) {

          SocketChannel client = server.accept();
          Writer writer = Channels.newWriter(client, StandardCharsets.UTF_8);
          writer.write("hey there");
          writer.flush();
          System.out.println("done");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });


    SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", serverPort));
    socketChannel.configureBlocking(false);
//    InputStream inputStream = Channels.newInputStream(socketChannel);
//    // throws an exception
//    inputStream.read();

    executorService.submit(() -> {
      Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
      try {
        while (socketChannel.isOpen()) {
          System.out.println(reader.read());
          latch.countDown();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });

    latch.await();


  }
}