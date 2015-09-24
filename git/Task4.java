import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
     
     System.out.println((Stepenb(x,6)+(Stepenb(y,7)-37))/(4/3 + ((5*x)/2)-74)+((Stepenb(y,2)/2))-x*y);
     
    }
    
    public static int Stepenb(int x,int a){
       int result = x;
        for (int i = 1; i<a; i++ ){
            result *=x;
       }
        return result;
    }
 }
