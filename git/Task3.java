import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int x = cs.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + x + " = " + i * x);
        }
    }
}
