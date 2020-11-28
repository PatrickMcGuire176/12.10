package com.company;

public class Main {

    public static void main(String[] args){
	   try{
	       OutOfMemoryTest outOfMemoryTest = new OutOfMemoryTest();
       } catch (OutOfMemoryError e){
	       e.printStackTrace();
	       System.out.println("Whoops!");
       } catch (Exception e) {

       }
    }
}
