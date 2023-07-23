import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int count=0,total_sum=0;
        for(int i=0;i<n;i++) {
            total_sum=a[i];
            if(total_sum<0){
                count++;
            }
            for(int j=i+1;j<n;j++) {
                total_sum+=a[j];
                if(total_sum<0)
                    count++;
            }
        }
        System.out.println(count);
        
    }
}
