import java.util.Arrays;
import java.util.Scanner;
public class Cumm_Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arrNum=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++) {
            arrNum[i]=sc.nextInt();
        }
        try {
            calculateCummMultiple(arrNum);
            System.out.println("arrnum = "+Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("An error occured: "+e.getMessage());
        }
    }
    public static void calculateCummMultiple(int[] arr) throws Exception {
        if(arr==null || arr.length==0) {
            throw new Exception("Input array is null or empty.");
        }
        //int cummMult=1;
        for(int i=1;i<arr.length;i++) {
           arr[i]=arr[i-1] * arr[i];
            }
        }

    }
