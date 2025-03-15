public class LeetCode2180 {
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                sum+=temp;
                temp=temp/10;
            }
            if(sum%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
