public class LeetCode2125 {
    public int numberOfBeams(String[] bank) {
        int prev=0,count=0;
        for(String temp:bank){
            int cur=0;
            //counting how many security systems are there in a row
            for(int i=0;i<temp.length();i++){
                if(temp.charAt(i)=='1'){
                    cur++;
                }
            }

            //if there is any security system then this loop executes
            if(cur>0){
                count+=(prev*cur);
                prev=cur;
            }
        }

        return count;
    }
}
