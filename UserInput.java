import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        //Step 1: Make a scanner object
        // <type> name = value 
        Scanner input = new Scanner(System.in);
        
        //Step 2: Make a variable to hold input
        double highTemp = 0;
        
        // Step 3: get input (Usually prompt user first)
        
        System.out.print("What is the high temp today? > "); 
        highTemp = input.nextDouble();
        System.out.print("\n" + highTemp);
        
        // New Example: 
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println();
        System.out.println("What is the right amount of cats to own? ");
        int numCats = input.nextInt();
        input.nextLine(); //Flush Buffer after getting int
        System.out.println("Enter your favorite taco filling ");
        String tacoFilling = input.nextLine();
        System.out.println("True or False: Millie and Winston are the cutest cats");
        boolean catCutest = input.nextBoolean();
    }
}