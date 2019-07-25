package cn.sille.lettercombination;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 22:45
 * Description:
 */
@Slf4j
public class LetterCombinationTest {

    @Test
    public void returnEmptyOne() {
        LetterCombination letterCombination = new LetterCombination();
        assertTrue(letterCombination.letterInput(new String[]{"0"}, true, false).isEmpty());

        assertTrue(letterCombination.letterInput(new String[]{"1", "0"}, true, false).isEmpty());

        assertTrue(letterCombination.letterInput(new String[]{"*"}, true, false).isEmpty());

        assertTrue(letterCombination.letterInput(new String[]{"#"}, true, false).isEmpty());
    }

    @Test
    public void returnNormal() {
        LetterCombination letterCombination = new LetterCombination();
        //shift true
        //capslock false
        log.info("shift: {}, capslock: {}", true, false);
        assertTrue(letterCombination.letterInput(new String[]{"2"}, true, false).size() == 3);
        assertTrue(letterCombination.letterInput(new String[]{"9"}, true, false).size() == 4);
        assertTrue(letterCombination.letterInput(new String[]{"2", "3"}, true, false).size() == 9);
        assertTrue(letterCombination.letterInput(new String[]{"9", "9"}, true, false).size() == 16);

        //shift true
        //capslock true
        log.info("shift: {}, capslock: {}", true, true);
        assertTrue(letterCombination.letterInput(new String[]{"2"}, true, true).size() == 3);
        assertTrue(letterCombination.letterInput(new String[]{"9"}, true, true).size() == 4);
        assertTrue(letterCombination.letterInput(new String[]{"2", "3"}, true, true).size() == 9);
        assertTrue(letterCombination.letterInput(new String[]{"9", "9"}, true, true).size() == 16);


        //shift false
        //capslock false
        log.info("shift: {}, capslock: {}", false, false);
        assertTrue(letterCombination.letterInput(new String[]{"2"}, false, false).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"9"}, false, false).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"2", "3"}, false, false).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"9", "9"}, false, false).size() == 1);


        //shift false
        //capslock true
        log.info("shift: {}, capslock: {}", false, true);
        assertTrue(letterCombination.letterInput(new String[]{"2"}, false, true).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"9"}, false, true).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"2", "3"}, false, true).size() == 1);
        assertTrue(letterCombination.letterInput(new String[]{"9", "9"}, false, true).size() == 1);

    }
}