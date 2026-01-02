package ch16;

import java.io.*;

class Chat implements Serializable {
  transient String currentID;

  String userName;

  // more code
}