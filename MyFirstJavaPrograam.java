import java.util.Scanner;

class MyFirstJavaPrograam {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
    
int i1;
int i2;

double d1 = 21.62;
double d2 = 12.57;
double totalDouble = d1 - d2;
float f1 = 6.70F;
float f2 = 2.17F;
float totalFloat = f1 + f2;
char c = 'A';
boolean bl=true;



System.out.println("Please Input First Integer Number");
i1 = input.nextInt();
System.out.println("Please Input Second Integer Number");
i2= input.nextInt();
System.out.println("______________________________________________");
int totalInterger = i1 +i2;
System.out.println("Total Inputed Integer number " + totalInterger);
System.out.println("______________________________________________");


System.out.println("/n");
System.out.println("Total Integer Number is: "+totalInterger);
System.out.println("Total Integer Number is: "+totalDouble);
System.out.println("Total Float Number is: "+totalFloat);
System.out.println("Character is: "+c);
System.out.println("Boolean Value is: "+bl);


input.close();
    }

}

   






