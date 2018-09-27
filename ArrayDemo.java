public class ArrayDemo{

  static int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

  static int[][] multiC = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},};

  public static void printArray(int[]ary){
    String s = "";
    for( int x = 0; x < ary.length; x++) {
      s += ary[x];
      if ( x < ary.length -1)
      s += ", ";
    }
    System.out.print( "[" + s + "]");
  }

  public static void printArray(int[][]ary){
    String s = "";
    for ( int r = 0; r < ary.length ; r++) {
      for ( int c = 0; c < ary[r].length; c++ ) {
        s += ary[r][c];
        if ( c < ary[r].length -1)
        s += ", ";
        if ( c == ary[r].length -1)
        s+= "\n";
      }
    }
    System.out.print("[" + s + "]");
  }









public static void main(String[] args) {
  printArray(anArray);
  System.out.print(" \n");
  printArray(multiC);
}
}
