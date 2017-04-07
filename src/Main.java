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
//        System.out.println(wordPlay.encryptTwoKeys("First Legion", 23, 17));
//        System.out.println(wordPlay.encryptTwo("Can you imagine life WITHOUT the internet AND computers in your pocket?", 15));
//        System.out.println(wordPlay.encryptTwoKeys("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!", 19, 7));
        for(int i=0; i<26; i++){
//                System.out.println(wordPlay.encryptTwoKeys("Xyi idmeiegv fj slv vvwveigy rru kirgymek jrglpkc mj klv smxkvwk jxiiekkl sw klv uigeixdiex. Deec jrglpkc qvqsiiw lrzv sivr vvgfkemqiu sskl ek lrzzvvjmkc eeh rrxzseec cimicw jfv xyizv iogvpciegv zr vvwveigy, iuytekmfr, rru jiizzgv. Lzkypp mmjmspv, qlpkmumjgztcmeeic tisaitxj rvv sizrx tsehlgkiu, wgsewfvvh fp meimfyj wyehzrx rkvrtmvw.",
//                        i, 0));

            for(int j=0; j<26; j++) {
                System.out.println(wordPlay.encryptTwoKeys("Uybi Gfqgykii Jgziegv Uigeixdiex Smiizzin", 9, 22));
            }
        }
    }
}
