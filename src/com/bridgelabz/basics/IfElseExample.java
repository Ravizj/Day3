package com.bridgelabz.basics;

public class IfElseExample {

    // here 'int x' in the argument(parameter) of isEven() is a local variable
    static boolean isEven(int x) {
      if(x%2 == 0){
          return true;
      }else{
          return false;
      }
    }

    public static void main(String[] args) {
        boolean res = isEven(34);
        // selection statement
        // if-else
        if(res) {
            int x = 30;
            System.out.println(x);
            System.out.println("Even number");
        }
        else {
//            System.out.println(x);
            System.out.println("Odd number");
        }
//        System.out.println(x);

        System.out.println("main method ends");

    }
}
