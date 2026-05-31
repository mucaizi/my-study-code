package com.study.code;
import java.util.Scanner;

public class TypeCheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入若干个整数（输入字母或其他字符结束）：");

        while (sc.hasNextInt()) { // 侦察兵先看看：下一个是整数吗？
            int num = sc.nextInt(); // 如果是，就放心大胆地拿走
            System.out.println("你输入的整数是: " + num);
        }

        System.out.println("检测到非整数输入，程序结束。");
        sc.close();
    }
}
