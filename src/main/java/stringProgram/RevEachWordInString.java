package stringProgram;

public class RevEachWordInString {
    public static void main(String[] args) {
        String str = "Hello good morning jyoti gaikwad";
        String[] words = str.split(" ");
        StringBuilder finalResult = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            finalResult.append(revWord.reverse().toString()).append(" ");
        }

        System.out.println("Reversed words: " + finalResult.toString().trim());
    }
}
