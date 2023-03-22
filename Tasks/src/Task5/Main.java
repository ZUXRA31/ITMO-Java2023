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
        String check = "";
        for(int i = word.length() - 1; i >= 0;i--){
            check += word.charAt(i);
        }
        return check.equalsIgnoreCase(word);
    }
    public static String getCensoredText(String text){
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }


    public static int getCountEntryInWord(String text, String word){
        return (text.length() - text.toLowerCase().replaceAll(word.toLowerCase(), "").length()) / word.length();
    }

    public static String getInvertedText(String text){
        String result = "";
        String[] words = text.split(" ");
        for (String word : words) {
            for (int b = word.length() - 1; b >= 0; b--) {
                result += word.charAt(b);
            }
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {

    }
}