package com.demo;

import java.util.Arrays;

/**
 * Created by admin on 2016/12/9.
 */
public class Main {
    public static void main(String[] args) {
//        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(ints));
//        for(int i=0;i<ints.length;i++){
//            int num = (int) (Math.random() * ints.length);
//            int temp = 0;
//            temp = ints[i];
//            ints[i] = ints[num];
//            ints[num] = temp;
//        }
//        System.out.println(Arrays.toString(ints));
        StringBuffer sb = new StringBuffer("java");
        replaceBuffer(sb);
        System.out.println(sb);
        byte i = 127;
        i = (byte) (i+2);
        System.out.println(i);
        double x = 3.0;
        double y = 0.0;
        System.out.println(x/y);
    }

    public static void replaceBuffer(StringBuffer sb){
        sb.append("a");
        sb = new StringBuffer("123");
    }

}
