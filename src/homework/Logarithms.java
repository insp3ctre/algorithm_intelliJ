package homework;

public class Logarithms {

   public static int log(int a, int b) {
       int count = 0;
       while (b >= 1) {
           b = b / a;
           count++;
       }
       return count-1;
   }
}
