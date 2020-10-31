package com.company;
import java.util.Scanner;
public class ex7and8 {
    public static class ThrowsDemo {
        public void getKey() {
            while(true) {
                try {
                    Scanner myScanner = new Scanner(System.in);
                    System.out.print("Enter Key ");
                    String key = myScanner.nextLine();
                    printDetails(key);
                    System.exit(0);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println( message ); }
        private String getDetails(String key) throws Exception {
            if(key.equals("")) {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key;
        }
    }
    public static void main(String[] args ){
      ThrowsDemo t=new ThrowsDemo();
       t.getKey();
    }
}
