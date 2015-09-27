import java.util.Scanner;

public class Kolodec2{
 
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double d, g, t; //d = depth; t = time
        
        g = 9.81;    
        t = -1;
        
        while (t < 0){
            System.out.print("Drop time = ");
            t = in.nextDouble();
            if (t < 0){
                System.out.println("Time = 0");
            }
        }
        d = g * t * t / 2.0;                        

        System.out.println("Depth of well = " + d + " meters");
        
    }
}
  
