package com.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by admin on 2016/12/3.
 */
public class IOUtilTestMain {

    public static void main(String[] args) throws IOException{
        IOUtil.printHex("demo//a.txt");
        System.out.println();
        IOUtil.printHexByteByte("demo//a.txt");
        File fileA = new File("demo//a.txt");
        File fileB = new File("demo//b.txt");
        File fileC = new File("demo//c.txt");
        File fileD = new File("demo//d.txt");
        File fileE = new File("demo//e.txt");
        File fileF = new File("demo//f.txt");
        File fileG = new File("demo//g.txt");
        IOUtil.copyFile(fileA,fileB);
        IOUtil.copyFileByBuffer(fileB,fileC);
        IOUtil.copyFileByByte(fileC,fileD);
        IOUtil.copyByChar(fileD,fileE);
        IOUtil.copyFileByChar2(fileE,fileF);
        IOUtil.copyFileByString(fileF,fileG);
    }
}
