public class ArrayDemo{

  static int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

  public static void printArray(int[]ary){
    String s = "";
    for( int x = 0; x < ary.length; x++) {
      s += ary[x];
      if ( x < ary.length -1)
      s += ", ";
    }
    System.out.print( "[" + s + "]");
  }




public static void main(String[] args) {
  printArray(anArray);
}
}
