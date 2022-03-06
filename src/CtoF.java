import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        // #8
        double fTemp = 0;
        double cTemp = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a valid Celsius number to convert to Fahrenheit: ");
        while(!in.hasNextDouble()){
            System.out.println("Wrong input, please enter again!! ");
            in.next();
        }
        cTemp = in.nextDouble();
        fTemp = (1.8*cTemp ) + 32;
        System.out.println("Your temp is " + fTemp + " Degrees F");

    }

}


