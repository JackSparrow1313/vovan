import java.util.Scanner;
public class JavaApplication {
    public static void main(String[] args) {
        double s, n, x;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        s = x = 1; 

        for (int i = 0; i < n; i++){
            x += 2;
            if(i % 2 == 0){
                s -= 1 / (x * x);
            }
            else {
                s += 1 / (x * x);
            }
        }
        System.out.print(s);
    }
}  
