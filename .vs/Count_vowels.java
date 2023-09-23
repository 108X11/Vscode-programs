public class Count_vowels {

  public static void main(String[] args) {

    String word = "Hello world";
    // convert string into lowercase
    word = word.toLowerCase();

    int CountVowel = 0;

    for (int i = 0; i < word.length(); i++) {
      char character = word.charAt(i);
      if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
        CountVowel++;
      }
    }
    System.out.println("The number of vowels is: " + CountVowel);
  }
}