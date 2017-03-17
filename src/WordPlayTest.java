import junit.framework.TestCase;
import org.junit.Test;

public class WordPlayTest extends TestCase {

    @Test
    public void testIsVowel() throws Exception {
        WordPlay wordPlay = new WordPlay();
        char ch = 'a';
        assertTrue(wordPlay.isVowel(ch));
        ch = 'M';
        assertFalse(wordPlay.isVowel(ch));
        ch = 'A';
        assertTrue(wordPlay.isVowel(ch));
        ch = 'i';
        assertTrue(wordPlay.isVowel(ch));

    }

    @Test
    public void testReplaceVowels() throws Exception {

        WordPlay wordPlay = new WordPlay();
        char wildCard = '*';
        assertEquals(wordPlay.replaceVowels("Mike BrIsson is the greatest", wildCard), "M*k* Br*ss*n *s th* gr**t*st");
    }

    @Test
    public void testEmphasize() throws Exception {
        WordPlay wordPlay = new WordPlay();
        assertEquals(wordPlay.emphasize("Mary Bella Abracadabra", 'a'), "M+ry Bell+ +br*c*d*br+");
    }

    public void testEncryptTwo() throws Exception {

    }

    @Test
    public void testEncryptTwoKeys() throws Exception {
        WordPlay wordPlay = new WordPlay();
        assertEquals(wordPlay.encryptTwoKeys("First Legion", 23, 17), "Czojq Ivdzle");
    }
}