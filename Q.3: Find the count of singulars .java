import java.util.HashMap;
import java.util.*;
public class SingularSocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int total_count=countSingularSocks(arr);
        System.out.println("Count of singular socks = "+total_count);
    }
    public static int countSingularSocks(int[] arr) {
        HashMap<Integer,Integer> sockscount=new HashMap<>();
        for(int sockId: arr) {
            sockscount.put(sockId,sockscount.getOrDefault(sockId,0)+1);
        }
        int singularsockscount=0;
        for(int count:sockscount.values()) {
            if(count%2!=0) {
                singularsockscount++;
            }
        }
        return singularsockscount;
    }
}
