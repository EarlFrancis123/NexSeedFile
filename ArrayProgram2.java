import java.util.Scanner;
public class ArrayProgram2 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int count;
        String[]  persons = new String[5];
        int [] age = new int[5];

        for (count = 0; count < persons.length; count++)
        {
            System.out.println("Please enter Name");
            if(count !=0){
                input.nextLine();
            }
            persons[count] = input.nextLine();

            System.out.println("Please enter age");
            age[count] = input.nextInt();

        }
        input.close();
        System.out.println("\n");
        System.out.println("ALL Names");
        System.out.println("_____________");

        for (count = 0; count < persons.length; count++) {
        System.out.println("My Name is " + persons[count] + "and iam "+ age[count]+"Years Old ");
        }
        
     
}
}
