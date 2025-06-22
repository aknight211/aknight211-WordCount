
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        String[] words = in.split(" ");
        int count = 0;

        for (String word : words) {
            if (!word.equals("")) {
                count++;
            }
        }
        return count;
    }
}
