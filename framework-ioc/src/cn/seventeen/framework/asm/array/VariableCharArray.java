package cn.seventeen.framework.asm.array;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class VariableCharArray implements VariableArray, Cloneable, Serializable {
    private static final long serialVersionUID = 8683452581122892190L;


    public char[] array;

    public VariableCharArray() {
        array = new char[0];
    }

    public VariableCharArray(int initialLength) {
        array = new char[initialLength];
    }

    public void append(char character) throws Exception {
        if (array == null)
            throw new Exception("变长char数组为null...");

        char newArray[] = new char[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = character;
        array = newArray;
    }

    public void append(char... characters) throws Exception {
        if (array == null)
            throw new Exception("变长char数组为null...");

        char newArray[] = new char[array.length + characters.length];
        int index = 0;
        for (char c : array) {
            newArray[index] = c;
        }
        for (char c : characters) {
            newArray[index] = c;
        }
        array = newArray;
    }

}
