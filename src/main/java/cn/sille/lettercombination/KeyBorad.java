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
public abstract class KeyBorad {

    private void verifyInput(Map<String, String> keyBoard, String key){
        Assert.notNull(key, "key can not be null");
        if(!keyBoard.containsKey(key)){
            throw new IllegalArgumentException("please input correct value");
        }
    }

    protected String retPressValue(Map<String, String> keyBoard, String key, boolean capslock) {
        verifyInput(keyBoard, key);
        return capslock ? String.valueOf(key).toUpperCase() : String.valueOf(key).toLowerCase();
    }

    protected String retPressShiftValue(Map<String, String> keyBoard, String key, boolean capslock) {
        verifyInput(keyBoard, key);
        return capslock ? keyBoard.get(String.valueOf(key)).toUpperCase() : keyBoard.get(String.valueOf(key)).toLowerCase();
    }

    public abstract List<String> retResult(String[] input, boolean shift, boolean capslock);
}
