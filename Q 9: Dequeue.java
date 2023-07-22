import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> set=new HashSet();
            int n = in.nextInt();
            int m = in.nextInt();
            int arr[]=new int[n];
            int uniq=0;
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                deque.add(arr[i]);
                if(deque.size()>m) {
                    int removed=deque.removeFirst();
                    if(!deque.contains(removed)) {
                        set.remove(removed);
                    }
                }  
                set.add(arr[i]);
                if(set.size()>uniq) {
                    uniq=set.size();
                }
            }
            System.out.println(uniq);
        }
    }
