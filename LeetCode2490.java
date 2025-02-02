public class LeetCode2490{
    public boolean isCircularSentence(String sentence) {
        // First check: verify if the first and last characters of the entire string match
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)){
            return false;
        }            

        // Find the first space in the string
        int k = sentence.indexOf(" ");

        // Iterate through all spaces in the string
        while (k != -1) {
            // For each space found:
            // Check if the character before the space (last letter of current word)
            // matches the character after the space (first letter of next word)
            if (sentence.charAt(k - 1) != sentence.charAt(k + 1)) {
                return false;
            }

            // Find the next space in the string, starting from position after current space
            k = sentence.indexOf(" ", k+1);
        }
        
        // If we've made it through all checks, the sentence is circular
        return true;
    }
}