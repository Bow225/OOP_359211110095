package ooplab5;
import java.util.Scanner;

//  introduction to array in java

public class TestArray {
    public static void main (String[] args){
        //Array
        int number[];
        number = new int[5];
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        number[1] = 10;
        System.out.println(number[1]);
        number[4] = 20;
        number[3] = number[1] + number[4];
        System.out.println(number[3]);
        System.out.println(number[4]);

        for (int i=0;i<number.length;i++)
            System.out.println("number["+i+"]: "+number[i]);
    }//main


}//class
