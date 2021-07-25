package com.lank.decorator;

import java.io.*;

/**
 * @author lank
 * @since 2021/7/22 23:17
 */
public class Decorator {

    public static void main(String[] args) throws IOException {

        // FileInputStream 是一个读取文件流的子类
        InputStream in = new FileInputStream("/user/test.txt");
        in.read();
        // 是一个支持带缓存功能的数据读取类
        InputStream bin = new BufferedInputStream(in);
        bin.read();
        InputStream dataInputStream = new DataInputStream(bin);
        dataInputStream.read();


    }
}
