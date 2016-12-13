package com.demo;

import org.junit.Test;

/**
 * Created by admin on 2016/12/9.
 */
public class Test1 implements ITest{

    @Override
    public void song() {
        System.out.println("唱歌test1");
    }

    public void read(){
        System.out.println("读书test1");
    }
}
