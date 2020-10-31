package com.company;

public class ex5 {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            String message = getDetails(key); System.out.println( message );
        }
        public String getDetails(String key) {
            try {
                if(key == null) {
                    throw new NullPointerException( "null key in getDetails" );
                }
            } catch (NullPointerException e){
                System.out.println(e);
                System.exit(0);
            }
            return "data for "+key;
        }
    }

    public static void main(String[] args){
        ThrowsDemo t = new ThrowsDemo();
        t.printMessage(null);
    }
}
