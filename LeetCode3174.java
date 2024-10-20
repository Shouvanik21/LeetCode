public class LeetCode3174 {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                int j=i-1;
                while(j>=0 && Character.isDigit(sb.charAt(j))){
                    j--;
                }
                sb.delete(j,i+1);
                i=0;
            }
        }
        return sb.toString();
    }
}
