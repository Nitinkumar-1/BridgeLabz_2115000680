public class WordReplace {
    public static void main(String[] args) {
        String sentence = "Hello world, welcome to the world of Java.";
        String oldWord = "world";
        String newWord = "universe";
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println(updatedSentence);
    }   public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
