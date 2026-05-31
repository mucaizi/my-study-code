package com.study.code;

import java.util.Scanner;

public class NumberSplitter {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }

        System.out.println("拆分结果（从个位开始）：");
        while (number != 0){
            System.out.println(number%10);
            number = number/10;
        }
    }
}
