public class LeetCode648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String tokens[]=sentence.split(" ");
        StringBuilder res =new StringBuilder();

        for(int i=0;i<tokens.length;i++){
            String temp=tokens[i];
            boolean found=false;
            for(int j=0;j<temp.length();j++){
                if(dict.contains(temp.substring(0,j+1))){
                    res.append(temp.substring(0,j+1));
                    found=true;
                    break;
                }
            }
            if(found!=true){
                res.append(temp);
            }
            if(i!=tokens.length-1){
                res.append(" ");
            }
        }

        return res.toString();
    }
}
