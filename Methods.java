import java.util.jar.Attributes.Name;

import BankingSystem.BankingMain;

public class Methods {
    public static void main(String [] args){
        int sum;
        displayName("Tajanlangit");
        
        sum = returnNumber(1, 5);
        addTwoNumbers(1, 5);
        System.out.println(sum);
    
     
    }


    
        public static void displayName(String name){
            System.out.println("My name is" + name);
        }
        public static void addTwoNumbers(int num1, int num2 ){
            System.out.println(num1 + num2);
        }
        public static int returnNumber(int num1, int num2 ){
            
            return num1 + num2;
        }

        
}

