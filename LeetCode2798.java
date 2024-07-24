public class LeetCode2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int j=0;j<hours.length;j++){
            if(hours[j]>=target){
                c++;
            }
            
        }
        return c;
    }
}
