import edu.duke.FileResource;

public class CaesarCipher {

    public String encrypt(String input, int key) {

        StringBuilder encrypted = new StringBuilder(input.toUpperCase());

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = alphabet.toLowerCase();
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        String lowerShiftedAlphavet = lowerAlphabet.substring(key) + lowerAlphabet.substring(0, key);
//        System.out.println(shiftedAlphabet);

        for(int i = 0; i < encrypted.length(); i++) {
            char currentChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currentChar);
            int lowerIndex = lowerAlphabet.indexOf(currentChar);
//            int indexLower = alphabet.toLowerCase().indexOf(currentChar);
            if(index != -1 || lowerIndex !=1) {

                char newChar = shiftedAlphabet.charAt(index);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }

    public void testCaesar() {
        int key = 15;
//        FileResource fr = new FileResource();
//        String message = fr.asString();
        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26 - key);
        System.out.println(decrypted);
    }
}
