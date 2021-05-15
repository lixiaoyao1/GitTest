package com.wp;

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
