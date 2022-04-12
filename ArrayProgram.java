import java.util.Scanner;
public class ArrayProgram {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int count;
        String[]  persons = new String[5];
        input.close();
        for (count = 0; count < persons.length; count++)
        {
            System.out.println("Please enter Name");
            persons[count] = input.nextLine();
        }
        System.out.println("\n");
        System.out.println("ALL Names");
        System.out.println("_____________");


        for (count = 0; count < persons.length; count++) {
            System.out.println("Name is " + persons[count]);
            
        }

       
    }
    
}
