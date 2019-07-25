package cn.sille.lettercombination;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 20:46
 * Description:
 */
public class KeyBoardFactory {

    /**
     * Base on the key board type， return the key board
     * @param keyBoardType
     * @return
     */
    public static KeyBoard getKeBoard(KeyBoardType keyBoardType){
        KeyBoard keyBorad = null;
        switch (keyBoardType){
            case NINE_PALACE_KEY_BOARD: keyBorad = new NinePalaceKeyBoard();break;
            default: keyBorad = new NinePalaceKeyBoard();break;
        }
        return keyBorad;
    }

}
