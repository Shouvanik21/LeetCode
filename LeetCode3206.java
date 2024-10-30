public class LeetCode3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0,n=colors.length;
        for(int i=0;i<n;i++){
            if(colors[i]!=colors[(i+1)%n] && colors[(i+1)%n]!=colors[(i+2)%n]){
                cnt++;
            }
        }
        return cnt;
    }
}
