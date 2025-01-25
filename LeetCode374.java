public class LeetCode374{
    public int guessNumber(int n) {
        int left=0,right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            int num=guess(mid);
            if(num==0){
                return mid;
            }
            else if(num==-1){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}