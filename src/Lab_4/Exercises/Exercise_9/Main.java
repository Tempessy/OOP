package Lab_4.Exercises.Exercise_9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String choice1 = "N";
        do{
            System.out.println("Would you like to convert from:\n1.Fahrenheit to celcius\n2.Celcius to fahrenheit");
            int choice2 = input.nextInt();
            TempConversion t1 = new TempConversion();
            if(choice2 == 1){
                System.out.println("Enter the temperature in Fahrenheit: ");
                t1.fahrenheit = input.nextDouble();
                System.out.println(t1.celcius());
            }
            else if(choice2 ==2){
                System.out.println("Enter the temperature in Celcius: ");
                t1.celcius = input.nextDouble();
                System.out.println(t1.fahrenheit());
            }
            else{
                System.out.println("Invalid choice! Please pick 1 or 2.");
            }



            System.out.println("Would you like to convert temperatures again?(Y/N)");
            choice1 = input.next();
        }while(choice1.equalsIgnoreCase("Y"));
    }
}
