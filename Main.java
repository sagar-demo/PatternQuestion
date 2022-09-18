import java.util.*;
//package sagar.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int maxlength=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum=0;
            for(int j=0;j<n;j++){
                curr_sum+=arr[i];
                if(curr_sum==0){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        System.out.println(maxlength);

    }
}
