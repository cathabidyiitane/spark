package com.arraytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Created by gouyy on 2017-12-13.
 */
public class ArrayListTest {
    // 数组去重一
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "c", "d", "e", "e", "e", "a"};
        List<String> result = new ArrayList<String>();
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < result.size(); j++) {
                if (array[i].equals(result.get(j))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.add(array[i]);
            }
        }
        String[] arrayResult = (String[]) result.toArray(new String[result.size()]);
        System.out.println(Arrays.toString(arrayResult));
    }
}
