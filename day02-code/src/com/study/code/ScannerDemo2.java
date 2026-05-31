package com.study.code;

import java.util.Scanner;

public class ScannerDemo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一些单词（用空格隔开）：");

        // 只要后面还有非空单词，就一直循环
        //hasNext会一直运行，终端停止运行方法ctrl + z
        //此处输入空格，next会一直停在那里
        while (sc.hasNextLine()) {
            String word = sc.next(); // 真正把单词拿走
            System.out.println("读取到的单词是: " + word);

            // 如果输入了 "exit"，就主动结束循环
            if (word.equals("exit")) break;
        }

        sc.close();
    }
}