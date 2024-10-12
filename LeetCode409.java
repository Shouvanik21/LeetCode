public class LeetCode409 {
    public int longestPalindrome(String s) {
        //it keeps the track of elements having odd frequency
        HashSet<Character> set = new HashSet<>();

        //initialising the length of the palindrome string
        int length=0;

        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                //if character is not present in set remove it and increase length by 2
                set.remove(ch);
                length+=2;
            }
            else{
                //if character is not present in set add it
                set.add(ch);
            }
        }

        if(set.isEmpty()!=true){
            //set is having characters that have a odd no of frequency
            //it means adding just one of them will make the string palindrome
            length+=1;
        }

        return length;
    }
}
