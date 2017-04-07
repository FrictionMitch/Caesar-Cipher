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
            if(Character.toUpperCase(newChar) == Character.toUpperCase(ch)) {
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
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+
                alphabet.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
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
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        System.out.println(encrypt("First Legion Attack East Flank!", 23));
    }

    public void testCaesar() {
//        FileResource fr = new FileResource();
//        String message = fr.asString();
        String message = "Top ncmy qkff vi vguv vbg ycpx";
        int key = 6;
        String encrypted = encrypt(message.toUpperCase(), key);
        System.out.println("The key is " + key + " " + encrypted);
    }

    public String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder newEncryption = new StringBuilder(input);
        String encryptKey1 = encryptTwo(input, key1);
        String encryptKey2 = encryptTwo(input, key2);
        for(int i = 0; i < newEncryption.length(); i++) {
            char key1Char = encryptKey1.charAt(i);
            char key2Char = encryptKey2.charAt(i);
            if(i % 2 == 0) {
                newEncryption.setCharAt(i, key1Char);
            } else {
                newEncryption.setCharAt(i, key2Char);
            }

//            int index = alphabet.indexOf(currentChar);
//            int lowerIndex = lowerAlphabet.indexOf(currentChar);
//            int index = newEncryption.charAt(i);
//            if(index != -1) {
//                if (index % 2 == 0) {
//                    System.out.println(index);
//                    newEncryption.setCharAt(i, encryptKey1.charAt(i));
//                } else {
//                    System.out.println(index);
//                    newEncryption.setCharAt(i, encryptKey2.charAt(i));
//                }
//            }
        }
        return newEncryption.toString();

    }

}
