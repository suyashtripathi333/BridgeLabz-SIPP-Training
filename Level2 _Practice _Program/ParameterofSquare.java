import java.util.Scanner;

public class ParameterofSquare{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        //  input for side od sqaure
        int side = sc.nextInt();

        // Calculating parameters
        int parameter= side *4;

        System.out.println("the triangle whose side is :"+side+" and its parameter "+parameter);

    }

}