import java.util.Scanner;

public class quadraticeq
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the coefficient of the quadratic equation (ax^2+bx+c=0)");
       System.out.print("Enter value for a: ");
       double a=input.nextDouble();

       System.out.print("Enter value for b: ");
       double b=input.nextDouble();

       System.out.print("Enter value for c: ");
       double c=input.nextDouble();

       input.close();
       double discriminant= b*b-4*a*c ;
       if(discriminant > 0)
       {
        // two distinct real roots
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Two distinct real roots:");
        System.out.println("Root 1=" + root1);
        System.out.println("Root 2=" + root2);
       }
        else if (discriminant == 0){    
           // two equal real roots
           double root = -b/(2*a);
           System.out.println("Two equal real roots:");
           System.out.println("Root = "+ root);
        
        }
        
       else
       {
        // complete roots
        double realpart = -b/(2*a);
        double imaginarypart = Math.sqrt(-discriminant)/(2*a);
        System.out.println("complex roots:");
        System.out.println("Root 1 = "+ realpart + "+" + imaginarypart + "i");
        System.out.println("Root 2 = "+ realpart+ "+" + imaginarypart + "i");
       }
    }
}



// RUN IN NOTEPAD USING COMMAND
