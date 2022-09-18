package sagar.company;
import java.util.Scanner;
public class numberpattern {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        while(row<=n){
            int col=1;
            while(col<=row){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
