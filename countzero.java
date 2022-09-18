package sagar.company;

import java.util.Scanner;
import java.util.*;
public class countzero {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int b=s.nextInt();

        System.out.println(zeroCount(b));

    }
    public static int zeroCount(int num)
    {
        if(num == 0)
            return 0;

        if(num %10 ==0)
            return 1 + zeroCount(num / 10);
        else
            return zeroCount(num/10);
    }
}
