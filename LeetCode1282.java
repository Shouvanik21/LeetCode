import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!hm.containsKey(groupSizes[i])){
                hm.put(groupSizes[i],new ArrayList<>());
            }
            hm.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(Integer it :hm.keySet()){
            List<Integer> al=new ArrayList<>();
            al=hm.get(it);
            int i=0;
            while(i!=al.size()){
                List<Integer> temp=new ArrayList<>();
                while(temp.size()!=it){
                    temp.add(al.get(i));
                    i++;
                }
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }
}
