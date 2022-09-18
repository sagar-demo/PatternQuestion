package sagar.company;
import java.util.*;
public class increasingorder {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int row=1,count=1;
        while(row<=n){
            int col=1;
            while(col<=n){
                System.out.print(count);
                count=count+1;
                col=col+1;
            }
            System.out.println(" ");
            row=row+1;
        }
    }
}
