public class Test
{
   int tst = 555;
   int xxx = 1;
   int yyy = tst + 1;
   private int zzz = yyy + xxx + 123;
   
   public static boolean Main(String s)
   { 
      int a = 5;
      int xxx = 2;
      int[,][] testInt = new int[1,2][3];
      testInt[0,0][2] = 781;
      //System.Console.WriteLine("Hello, World!");
      a += xxx + 6;
      xxx = yyy;
      //return a + xxx;
      int b = 0;
      int v = testInt[2 * b][b * b - (b + b)][b + 2];
      return v == 781;
      //return (((a - 7) * yyy) > tst) == (tst < 1);
      //return xxx * (((a -7) * yyy));
   }
   
}