package Task5;

public class Main {
    public static String getLongWord(String text){
        String[] words = text.split(" ");
        String result = "";
        for(int i = 0; i< words.length; i++){
            if(words[i].length() > result.length()) {
                result = words[i];
            }
        }
        return result;
    }
    public static boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }
    public static String getCensoredText(String text, String censureWord){
        return text.replaceAll(censureWord, "[вырезано цензурой]");
    }


    public static int getCountEntryInWord(String text, String word){
        return (text.length() - text.toLowerCase().replaceAll(word.toLowerCase(), "").length()) / word.length();
    }

    public static String getInvertedText(String text){
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            result += new StringBuilder(word).reverse().toString();
        }
        return result;
    }

    public static void main(String[] args) {

    }
}