public class Main {

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
//        cipher.testCaesar();
        WordPlay wordPlay = new WordPlay();
//        wordPlay.testVowels();
//        wordPlay.testReplaceVowels();
//        wordPlay.testEmphasize();
//        wordPlay.testEncryptTwo();
//        wordPlay.testCaesar();
        wordPlay.encryptTwoKeys("First Legion", 23, 17);
    }
}
