import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(Balanced(input));
            //Complete the code
		}
    }
        public static boolean Balanced(String S) {
            Stack<Character> st =new Stack<>();
            boolean flag=true;
            for(char ch: S.toCharArray()) {
                if(ch=='('||ch=='{'||ch=='[') {
                    st.push(ch);
                }
                else {
                    if((ch==')'||ch=='}'||ch==']')&&!st.isEmpty()) {
                        st.pop();
                    } else {
                        flag=false;
                    } 
                }
            }
            if(S.length()==0) {
                return true;
            }
            if(flag==true&&st.size()==0) {
                return true;
            }
            else{
                return false;
            }
        }
		
	}
