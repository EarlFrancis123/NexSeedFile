import java.util.Scanner;

class InputProgram {
    public static void main(String[] args) {
    
        int menu1, menu2, menu3, q1,q2,q3;
        double price1 = 0, price2 = 0, price3 = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Baby Back Ribs (P300.00)");
        System.out.println("Pizza (P340.00)"); 
        System.out.println("Buffalo Wings (P200.00)");
        System.out.println("Buttered Shrimp (P350.00)");
        System.out.println("Tuslo Buwa (P360.00)");
        
      
           System.out.println("Enter menu: ");
             menu1 = sc.nextInt();
            if(menu1 <= 5){
                   System.out.println("Quantity: ");
                  q1 = sc.nextInt();
              
                  if(menu1 == 1){
                  price1 = 300 * q1;
                }
              else if(menu1 == 2){
                  price1 = 340 * q1;
              }
               else if(menu1 == 2){
                  price1 = 200 * q1;
              }
               else if(menu1 == 2){
                  price1 = 350 * q1;
              }
               else if(menu1 == 2){
                  price1 = 360 * q1;
              }
              else{
    
              }
            
            }
        
         System.out.println("Enter menu 2: ");
             menu2 = sc.nextInt();
            if(menu1 <= 5){
                   System.out.println("Quantity: ");
                  q2 = sc.nextInt();
             
                  if(menu2 == 1){
                  price2 = 300 * q2;
                }
              else if(menu1 == 2){
                  price2 = 340 * q2;
              }
               else if(menu1 == 2){
                  price2 = 200 * q2;
              }
               else if(menu1 == 2){
                  price2 = 350 * q2;
              }
               else if(menu1 == 2){
                  price2 = 360 * q2;
              }
              else{
              }
            
            }
        
         System.out.println("Enter menu 3: ");
             menu3 = sc.nextInt();
            if(menu3 <= 5){
                   System.out.println("Quantity: ");
                  q3 = sc.nextInt();
             
                  if(menu3 == 1){
                  price3 = 300 * q3;
                }
              else if(menu3 == 2){
                  price3 = 340 * q3;
              }
               else if(menu3 == 2){
                  price3 = 200 * q3;
              }
               else if(menu3 == 2){
                  price3 = 350 * q3;
              }
               else if(menu3 == 2){
                  price3 = 360 * q3;
              }
              else{
              }
            
            }
        
        double total = price1+price2+price3;
        
        System.out.println("Payable" +total);	
        
           System.out.println("Money");	
          int money = sc.nextInt();
        
            System.out.println("Change" + (total-money));	
        
        
        
        
      }
    }
    