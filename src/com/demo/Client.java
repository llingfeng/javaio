package com.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/12/11.
 */
public class Client {
    static List<ITest> iTests = new ArrayList<>();
    public static void main(String[] args){
        Test2 test = new Test2();
        iTests.add(test);
        for (ITest iTest : iTests) {
            iTest.song();
        }
    }
}
