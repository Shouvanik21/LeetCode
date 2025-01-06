public class LeetCode20 {
    public boolean isValid(String s) {
        char[] chars=s.toCharArray();
        Stack<Character> st  = new Stack<Character>();
        for(char ele:chars){
            if(ele=='(' || ele=='{' || ele=='['){
                st.push(ele);
                continue;
            }
            else if(st.isEmpty()){
                return false;
            }

            char top=st.pop();

            if(top=='(' && ele!=')'){
                return false;
            }
            if(top=='{' && ele!='}'){
                return false;
            }
            if(top=='[' && ele!=']'){
                return false;
            }
        }
        return(st.isEmpty()==true);
    }
}