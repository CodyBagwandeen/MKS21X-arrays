public class ArrayDemo{

  int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
  public static void printArray(int[]ary){
    String s = "";
    for( int x = 0; x < ary.length; x++) {
      s += ary[x];
    }
    System.out.print(s);
  }


System.out.println(printArray( anArray))
}
