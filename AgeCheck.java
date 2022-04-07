import java.util.Scanner;
public class AgeCheck {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Please Input a you age");
        age=input.nextInt();


        if(age <= 17 ){
                System.out.println("________________ ");
                System.out.println("You belong to minor");
                System.out.println("_________________");
                

        }
        else if(age >=18 || age <= 59){
                System.out.println("________________ ");
                System.out.println("You belong to Adult ");
                System.out.println("________________ ");
               
        }else if (age>=60) {
                System.out.println("________________ ");
                System.out.println("You belong to Senior Citizen");
                System.out.println("________________ ");
                
          } else{
                System.out.println("________________ ");
                System.out.println("Please input valid number");  
                System.out.println("________________ ");
               
   }
input.close();
}
}
