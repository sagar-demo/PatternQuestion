package sagar.company;
import java.util.Scanner;
public class negorpos {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        if(a>0){
//            System.out.println("A is greater");
//        }
//        if(a<0){
//            System.out.println("A is negative");
//        }
//        if(a==0){
//            System.out.println("A is zero");
//        }
     int n=s.nextInt();
     int i=2;

     while(i<=n){
         if(i%n==0) {
             System.out.println("Even");
         }else{
             System.out.println("Odd");
         }

         i=i+1;
     }
        System.out.println();
    }
}
