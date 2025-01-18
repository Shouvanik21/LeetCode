public class LeetCode875 {
    public static int findMax(int v[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            maxi=Math.max(maxi,v[i]);
        }
        return maxi;
    }

    public static int findTotalHours(int a[],int t){
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=Math.ceil((double)(a[i])/(double)(t));
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalHrs=findTotalHours(piles,mid);
            if(totalHrs<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}