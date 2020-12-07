public class Tester {
  public static void main(String[] args) {
    IntegerSequence hello = new Range(5,10);
    //System.out.println(hello.start);
    //System.out.println(hello.end);
    //System.out.println(hello.current);
    System.out.println(hello.length());
    System.out.println(hello.hasNext());
    IntegerSequence sizeOne = new Range(1,1);
    System.out.println(sizeOne.length());
    System.out.println(sizeOne.hasNext());
    /*
    for (int i = 1; i <= 7; i++) {
      System.out.println(hello.next());
    }
    */
    for (int i = 1; i <= 6; i++) {
      System.out.println(hello.next());
    }
    hello.reset();
    for (int i = 1; i <= 6; i++) {
      System.out.println(hello.next());
    }
    IntegerSequence r = new Range(10,15);
    while(r.hasNext()){
      System.out.print(r.next());
      if( r.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
  }
}
