import java.util.Stack;

public class LeetCode1598 {
    public int minOperations(String[] logs) {
        Stack<String> ans= new Stack<>();

        for(String log:logs){
            if(log.equals("../")){
                if(!ans.isEmpty()){
                    ans.pop();
                }
            }
            else if(!log.equals("./")){
                ans.push(log);
            }
        }

        return ans.size();
    }
}
