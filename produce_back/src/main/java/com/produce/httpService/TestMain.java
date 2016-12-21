package com.produce.httpService;

/**
 * Created by ki_boy on 2016/12/21.
 */
public class TestMain {

    public static void main(String[] args) {
        System.loadLibrary("CplusImplement");// 不需要加入.dll后缀
        JavaInvodeCPlus javaInvodeCPlus = new JavaInvodeCPlus();
        System.out.println(javaInvodeCPlus.returnHelloWorldToUpcase("QQQQQQQ"));
    }

}
