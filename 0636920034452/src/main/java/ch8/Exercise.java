package ch8;

public class Exercise {

  public interface Foo { }
  public class Bar implements Foo { }

  public interface Vinn { }
  public abstract class Vout implements Vinn { }


  public abstract class Muffie implements Whuffie { }
  public class Fluffie extends Muffie { }
  public interface Whuffie { }


  public class Zoop { }
  public class Boop extends Zoop { }
  public class Goop extends Boop { }


  public class Gamma extends Delta implements Epsilon { }
  public interface Epsilon { }
  public interface Beta { }
  public class Alpha extends Gamma implements Beta { }
  public class Delta { }
}

