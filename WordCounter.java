import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> counts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }
    public void printWordCounts() {
        System.out.println("word usage counter");
        for (String word : counts.keySet()) {
            System.out.println(word + ": " + counts.get(word));
        }
    }
    public void printCountsNotInMap(HashMap<String, String> map) {
        System.out.println("Word counts (words not in responseMap):");
        for (String word : counts.keySet()) {
            if (!map.containsKey(word)) {
                System.out.println(word + ": " + counts.get(word));
            }
        }
    }
}
