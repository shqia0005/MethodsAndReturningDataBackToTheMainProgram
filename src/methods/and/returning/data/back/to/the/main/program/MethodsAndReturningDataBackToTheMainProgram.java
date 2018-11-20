/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methods.and.returning.data.back.to.the.main.program;
import java.util.Scanner;
/**
 *
 * @author shqia0005
 */
public class MethodsAndReturningDataBackToTheMainProgram {
    public static void Addition()
    {
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
       
    }
    public static void Subtraction()
    {
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        
        double difference = num1 - num2 ;
        System.out.println("The difference of two numbers is: " + difference);
    }
    public static void Multiplication()
    {
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        
        double product = num1 * num2;
        System.out.println("The product of two numbers is: " + product);
    }
    public static void Division()
    {
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        
        double quotient = num1 / num2;
        System.out.println("The quotient of two numbers is: " + quotient);
    }
    public static void EXIT ()
    {
        System.out.println("Finish!");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
       do{
        System.out.println("----Please select a mathematical calculation----");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.EXIT");
        
        choice = input.nextInt();
        
        switch(choice){
            case(1):
                Addition();
            case(2):
                Subtraction();
            case(3):
                Multiplication();
            case(4):
                Division();
            case(5):
                EXIT();
        }
       }while(choice == 5);
        
        
    }
    
}
