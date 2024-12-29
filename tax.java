import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income < 300000) {
            tax = 0;
        } 
        else if(income>= 300000 && income < 100000){
            tax = (int)(income * 0.2);

        }
        else{
            tax = (int)(income * 0.3);

        }
        System.out.println("your txa is :" + tax);
        int finalAmount = income - tax ;
        System.out.println("Your Final Amount in Hand is :" + finalAmount);
        sc.close();
    }
}
