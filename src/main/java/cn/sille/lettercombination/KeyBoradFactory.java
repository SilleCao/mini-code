package cn.sille.lettercombination;

import org.springframework.util.Assert;

import java.util.Map;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 20:46
 * Description:
 */
public class KeyBoradFactory {

    public static KeyBorad getKeBoard(KeyBoradType keyBoardType){
        KeyBorad keyBorad = null;
        switch (keyBoardType){
            case NINE_PALACE_KEY_BOARD: keyBorad = new NinePalaceKeyBoard();break;
            default: keyBorad = new NinePalaceKeyBoard();break;
        }
        return keyBorad;
    }

}
