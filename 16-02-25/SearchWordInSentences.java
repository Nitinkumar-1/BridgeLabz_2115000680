public class SearchWordInSentences {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a powerful programming language.",
            "I love solving algorithmic problems.",
            "Data structures and algorithms are important."
        };

        String word = "Java";
        System.out.println(findSentence(sentences, word)); // Output: Java is a powerful programming language.
    }
}
