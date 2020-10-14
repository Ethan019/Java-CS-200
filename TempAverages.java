import java.util.*;


public class TempAverages {

  public static void main(String args[]){
  double a, b, c, d, e, f, g;
   double even, odd;

    Scanner scan = new Scanner (System.in);
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();
    d = scan.nextDouble();
    e = scan.nextDouble();
    f = scan.nextDouble();
    g = scan.nextDouble();

    even = (b+d+f)/3;
    odd =  (a+c+e+g)/4;

    System.out.println((even)+" "+(odd));

  }
}
