import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        //int num1, num2, num3;
        double num1, num2, avg;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        avg = (num1 + num2) / 2;

        System.out.println("The average of these values is : " + avg);
    }
}