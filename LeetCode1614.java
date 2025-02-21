public class LeetCode1614{
    public int maxDepth(String s) {
        int cnt=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            maxi=Math.max(cnt,maxi);
            if(s.charAt(i)==')'){
                cnt--;
            }
        }
        return maxi;
    }
}