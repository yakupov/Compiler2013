public class Test
{
   int tst = 555;
   int xxx = 1;
   int yyy = tst + 1;
   private int zzz = yyy + xxx + 123;
   
   public static int Main(String s)
   { 
      int a = 5;
      int xxx = 2;
      //int[,][] testInt = new int[1,2][3];
      //System.Console.WriteLine("Hello, World!");
      a += xxx + 6;
      xxx = yyy;
      return a + xxx;
   }
   
}