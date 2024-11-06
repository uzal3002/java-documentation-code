// print sum of odd numbers from m-n

package hellojava;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        System.out.println("Enter First Number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        //number1.close();
        
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        input.close();
        
        int sum = 0;
        for(int i = num1; i <= num2; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Result: " + sum);
    }
}

