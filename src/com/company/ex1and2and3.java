package com.company;
import java.util.Scanner;
public class ex1and2and3 {
    public static class Exception1 {
        public void exceptionDemo() {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter an integer");
                String intString=scanner.next();
                int i=Integer.parseInt(intString);
                System.out.println(2/i);
            }
            /*catch (Exception e){
                System.out.println("ERROR");
            }*/
            catch (ArithmeticException e){
                System.out.println("Attempted division by zero");
            }
            catch (NumberFormatException e){
                System.out.println("Wrong format");
            }
        }
    }
    public static void main(String[] args){
        Exception1 ex1 = new Exception1();
        ex1.exceptionDemo();
    }
}
