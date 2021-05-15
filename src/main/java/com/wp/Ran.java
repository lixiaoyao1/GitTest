package com.wp;

/**
 * 已经追踪过的文件，不需要add就可以commit
 *
 */
public class Ran {
    public static void main(String[] args) {
        String str = "100.50.05,0.0";
        String[] strs = str.split("\\.");

        for(String s : strs){
            System.out.println(s);
        }

        int num = Integer.valueOf("00100");
        System.out.println(num);
    }
}
