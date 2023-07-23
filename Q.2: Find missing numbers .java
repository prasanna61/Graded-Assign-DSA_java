import java.util.*;
public class MissingNumbers {
    public static List<Integer> findMissingNums(int[] a,int min,int max) {
        List<Integer> missingNums=new ArrayList<>();
        HashSet<Integer> numset=new HashSet<>();
        for(int num: a) {
            numset.add(num);
        }
        for(int i=min;i<=max;i++) {
            if(!numset.contains(i)) {
                missingNums.add(i);
            }
        }
        return missingNums;
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int min=1,max=6;
        List<Integer> missing_nums=findMissingNums(arr,min,max);
        System.out.println("Missing Numbers : ");
        for (int num: missing_nums) {
            System.out.print(num+" ,");
        }
    }
}
