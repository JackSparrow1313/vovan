import java.util.Scanner;
    public class Task2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x1 = 0,x2 = 0,d = 0;
            int a  = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            d = b*b - 4*a*c;
            if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2.0*a); 
            x2 = (-b - Math.sqrt(d)) / (2.0*a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
            } 
            else if (d == 0){
            x1 = (-b) / (2.0*a);
            System.out.println("x = " + x1); 
            } 
            else {
            System.out.println("x = none"); 
        }
    }
}