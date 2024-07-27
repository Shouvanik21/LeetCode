public class LeetCode2433 {
    public static int[] findArray(int[] pref) {
        int n=pref.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                temp[i]=pref[i];
            }
            else{
                temp[i]=(pref[i-1]^pref[i]);
            }
        }
        
        return temp;
    }
}
