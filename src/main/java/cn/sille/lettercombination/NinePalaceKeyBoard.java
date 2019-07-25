package cn.sille.lettercombination;

import org.springframework.util.Assert;

import java.util.*;

/**
 * @author: Sille_Cao
 * Date:2019/7/24 21:07
 * Description:
 */
public class NinePalaceKeyBoard extends KeyBoard {

    private static final Map<String, String> KEY_BOARD_MAP = new HashMap<>();

    //define nine-palace key board
    static {
        KEY_BOARD_MAP.put("0", "");
        KEY_BOARD_MAP.put("1", "");
        KEY_BOARD_MAP.put("2", "A,B,C");
        KEY_BOARD_MAP.put("3", "D,E,F");
        KEY_BOARD_MAP.put("4", "G,H,I");
        KEY_BOARD_MAP.put("5", "J,K,L");
        KEY_BOARD_MAP.put("6", "M,N,O");
        KEY_BOARD_MAP.put("7", "P,Q,R,S");
        KEY_BOARD_MAP.put("8", "T,U,V");
        KEY_BOARD_MAP.put("9", "W,X,Y,Z");
        KEY_BOARD_MAP.put("*", "");
        KEY_BOARD_MAP.put("#", "");
    }

    @Override
    public List<String> retResult(String[] input, boolean shift, boolean capslock) {
        Assert.notEmpty(input, "input can not be null");

        List<String> valueList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if(!input[i].equals("")){
                String retStr = "";
                if(shift){
                    retStr = retPressShiftValue(KEY_BOARD_MAP, input[i], capslock);
                }else{
                    retStr = retPressValue(KEY_BOARD_MAP, input[i], capslock);
                }
                if(!retStr.equals("")){
                    valueList.add(retStr);
                }
            }
        }

        String[] retResultArr = null;
        if(!valueList.isEmpty()){
            retResultArr = valueList.get(0).split(",");
            for (int i = 1; i < valueList.size(); i++) {
                String[] tempKeyArr = valueList.get(i).split(",");
                retResultArr = combinArr(retResultArr, tempKeyArr);
            }
        }
        return retResultArr != null ? Arrays.asList(retResultArr) : new ArrayList<>();
    }

    private String[] combinArr(String[] arrA, String[] arrB){
        String[] retArr = new String[arrA.length * arrB.length];
        int n = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int y = 0; y < arrB.length; y++) {
                retArr[n++] = arrA[i] + arrB[y];
            }
        }
        return retArr;
    }
}

