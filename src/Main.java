import java.util.Stack;


public class Main {
    public static void main(String[] args) {
//        String S = "Hello World";
//        char[] words = S.toCharArray();
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < words.length; i++) {
//            st.push(words[i]);
//        }
//        while(!st.empty()){
//            System.out.print(st.pop());
//        }
        Stack<Integer> st = new Stack<>();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
             a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            st.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = st.pop();
            System.out.print(a[i]);
        }



    }
}
