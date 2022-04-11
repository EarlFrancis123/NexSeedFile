import java.util.Scanner;

public class MultipleMethods {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        MathOperator mathOperator = new MathOperator();
        int num1 = 2;
        int num2 = 3;
        int total1,total2;


        
        total1 = mathOperator.addTwoNumbers(num1, num2);
        total2 = MathOperator.subtractTwoNumbers(num1, num2);

        System.out.println(total1);
        System.out.println(total2);
        input.close();
    }

}
