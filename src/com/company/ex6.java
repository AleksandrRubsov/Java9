package com.company;
import java.util.Scanner;
public class ex6 {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            String key = myScanner.next();
            printDetails( key );
        }
        public void printDetails(String key) {
            try { String message = getDetails(key);
                System.out.println( message );
            }catch ( Exception e){
                System.out.println(e);
            }
        }
        private String getDetails(String key) throws Exception{
            if(key == "") {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key; }
    }
    public static void main(String[] args){
       ThrowsDemo t=new ThrowsDemo();
       t.getKey();
    }
}
