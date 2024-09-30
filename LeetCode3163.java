public class LeetCode3163 {
    public String compressedString(String word) {
        StringBuilder compressed = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            char c = word.charAt(i);
            int count = 1;
            while (i + count < word.length() && word.charAt(i + count) == c && count < 9) {
                count++;
            }
            compressed.append(count).append(c);
            i += count;
        }
        return compressed.toString();
    }
}
