import java.util.Scanner;

public class AreaofTriangle {

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        // taking height as input in cm

        float height= sc.nextFloat();

        // taking base as input 

        float base = sc.nextFloat();

        //  area in cm
        float  Area= (float)0.5*base*height;

        System.out.println("Area in cm is :" + Area+"cm");
// area in inches 
        double inInches = Area*2.54;
       System.out.println("Area in inches :" + inInches+"inch");
    }
    
}
