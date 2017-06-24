package com.easedroid.java.type;

/**
 * Created by jingbin on 2017/6/24.
 */
public class Type {

    public static void main(String[] args) {
        int i = 128;  //00000000 00000000 00000000 10000000
        byte b = (byte) i;
        //10000000  --->  计算机存储补码，最高位1表示符号位，10000000是最小负数的补码表示形式，我们把补码计算步骤倒过来就即可。10000000减1得01111111然后取反10000000
        //因为负数的补码是其绝对值取反，即10000000为最小负数的绝对值，而10000000的十进制表示是128，所以最小负数是-128
        System.out.print(b);
    }
}
