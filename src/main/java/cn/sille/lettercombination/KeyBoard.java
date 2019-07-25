package cn.sille.lettercombination;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 20:46
 * Description:
 */
public abstract class KeyBoard {

    /**
     * verify key or not in the keyBoard
     * @param keyBoard
     * @param key
     */
    private void verifyInput(Map<String, String> keyBoard, String key){
        Assert.notNull(key, "key can not be null");
        if(!keyBoard.containsKey(key)){
            throw new IllegalArgumentException("please input correct value");
        }
    }

    /**
     * Return key value
     * @param keyBoard
     * @param key
     * @param capslock
     * @return
     */
    protected String retPressValue(Map<String, String> keyBoard, String key, boolean capslock) {
        verifyInput(keyBoard, key);
        return capslock ? String.valueOf(key).toUpperCase() : String.valueOf(key).toLowerCase();
    }

    /**
     * Return the shift value of the key
     * @param keyBoard
     * @param key
     * @param capslock
     * @return
     */
    protected String retPressShiftValue(Map<String, String> keyBoard, String key, boolean capslock) {
        verifyInput(keyBoard, key);
        return capslock ? keyBoard.get(String.valueOf(key)).toUpperCase() : keyBoard.get(String.valueOf(key)).toLowerCase();
    }

    /**
     * retrun result base on input & shift & capslock
     * @param input
     * @param shift
     * @param capslock
     * @return
     */
    public abstract List<String> retResult(String[] input, boolean shift, boolean capslock);
}
