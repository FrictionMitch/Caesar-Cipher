import edu.duke.FileResource;

public class WordPlay {

    public boolean isVowel(char ch) {
        String vowels = "aeiou";
        char[] chars = vowels.toCharArray();
        for (char letter : chars) {
            if (letter == Character.toUpperCase(ch) || letter == Character.toLowerCase(ch)){
                return true;
            }
        }
        return false;
    }

    public void testVowels() {
        System.out.println(isVowel('e'));
    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for(int i=0; i < sb.length();i++) {
            char chP = sb.charAt(i);
            if(isVowel(chP)) {
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }

    public void testReplaceVowels() {
        System.out.println(replaceVowels("Mike BrIsson is the greatest", '*'));
    }

    public String emphasize(String phrase, char ch) {
        StringBuilder stringBuilder = new StringBuilder(phrase);
        for(int i = 0; i < stringBuilder.length(); i++) {
            char newChar = stringBuilder.charAt(i);
            if(Character.toUpperCase(newChar) == ch || Character.toLowerCase(newChar) == ch) {
                if(i % 2 == 0) {
                    stringBuilder.setCharAt(i, '*');
                } else {
                    stringBuilder.setCharAt(i, '+');
                }
            }
        }

        return stringBuilder.toString();
    }

    public void testEmphasize() {
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }

    public String encryptTwo(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = alphabet.toLowerCase();
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        String lowerShiftedAlphabet = lowerAlphabet.substring(key) + lowerAlphabet.substring(0, key);
        for(int i = 0; i < encrypted.length(); i++) {
            char currentChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currentChar);
            int lowerIndex = lowerAlphabet.indexOf(currentChar);

            if(index != -1) {

                char newChar = shiftedAlphabet.charAt(index);
                encrypted.setCharAt(i, newChar);
            }

            if(lowerIndex != -1) {
                char newChar = lowerShiftedAlphabet.charAt(lowerIndex);
                encrypted.setCharAt(i, newChar);
            }
        }

//        System.out.println(alphabet);
        return encrypted.toString();
    }

    public void testEncryptTwo(){
//        System.out.println("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!");
        System.out.println(encryptTwo("FIRST LEGION ATTACK EAST FLANK!", 23));
        System.out.println(encryptTwo("First Legion Attack East Flank!", 23));
    }

    public void testCaesar() {
//        FileResource fr = new FileResource();
//        String message = fr.asString();
        String message = "First Legion";
        int key = 17;
        String encrypted = encryptTwo(message, key);
        System.out.println("The key is " + key + " " + encrypted);
    }

    public String encryptTwoKeys(String input, int key1, int key2) {

        StringBuilder encrypted = new StringBuilder(input);
        // Keep track of key1 or key2
        int currentKey = 0;

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = alphabet.toLowerCase();
        String shiftedAlphabet = alphabet.substring(currentKey) + alphabet.substring(0, currentKey);
        String lowerShifted = lowerAlphabet.substring(currentKey) + alphabet.substring(0, currentKey);
        for(int i = 0; i < encrypted.length(); i++) {
            char currentChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currentChar);
            int lowerIndex = lowerAlphabet.indexOf(currentChar);
            if(index != -1 && i % 2 == 0) {
                currentKey = key2;
                char newChar = shiftedAlphabet.charAt(index);
                encrypted.setCharAt(i, newChar);
            }
            if(index != -1 && i % 2 != 0) {
                currentKey = key1;
            }

            if(lowerIndex != -1 && i % 2 == 0) {
                currentKey = key2;
            }

            if(lowerIndex != -1 && i % 2 != 0) {
                currentKey = key1;
            }

        }

        return input;
    }

}
