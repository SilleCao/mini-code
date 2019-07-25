package cn.sille.lettercombination;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 20:46
 * Description:
 */
@Slf4j
public class LetterCombination {

    public List<String> letterInput(String[] inputArr, boolean shift, boolean capslock){
        System.out.print("Input: ");
        for (String s : inputArr) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        List<String> retStrList = KeyBoardFactory.getKeBoard(KeyBoardType.NINE_PALACE_KEY_BOARD)
                .retResult(inputArr, shift, capslock);
        System.out.print("Output: ");
        for (String s : retStrList) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        return retStrList;
    }

}
