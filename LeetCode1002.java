import java.util.ArrayList;
import java.util.List;

public class LeetCode1002 {
    public List<String> commonChars(String[] words) {
        List<Character> res= new ArrayList<>();

        //looping through the characters from 'a' to 'z'
        for(char ch='a';ch<='z';ch++){
            int min_count=Integer.MAX_VALUE;

            //count frequency of ch in each word
            for(String word:words){
                int cnt=0;
                for(char c: word.toCharArray()){
                    if(c==ch){
                        cnt++;
                    }
                }
                min_count=Math.min(min_count,cnt);
            }

            //if ch is present adding them to res min_count times
            for(int i=0;i<min_count;i++){
                res.add(ch);
            }
        }

        //converting arraylist of char type to arraylist of string type
        List<String> ans= new ArrayList<>();
        for(Character ch1:res){
            ans.add(ch1.toString());
        }

        return ans;
    }
}
