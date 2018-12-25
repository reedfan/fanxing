package com.ustc.reed.fanxinglei;

public class Test {

    public static void main(String[] args) {

        Box<Integer> box = new Box<Integer>();
        box.setT(1);

        Box<String> str = new Box<String>();
        str.setT("reed");

        System.out.println(box.getT());

        System.out.println(str.getT());


    }



}
