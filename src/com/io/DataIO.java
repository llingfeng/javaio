package com.io;

import java.io.*;

/**
 * Created by admin on 2016/12/4.
 */
public class DataIO {

    public static void main(String args[]) throws IOException{
        File file = new File("demo//a.txt");
//        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //对流的扩展，更加方便读取int,float,字符串等数据类型
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file,false));
        dos.writeUTF("你好，我是机器人");
    }
}
