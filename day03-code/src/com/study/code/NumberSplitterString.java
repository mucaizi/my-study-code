package com.study.code;

import java.util.Scanner;

public class NumberSplitterString {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // 1. 将整数转换为字符串
        String numStr = String.valueOf(number);

        // 2. 从左到右遍历字符串的每一个字符
        for (int i = 0; i < numStr.length(); i++) {
            // 3. 提取出对应位置的字符，并转换回数字
            int digit = Character.getNumericValue(numStr.charAt(i));
            System.out.println(digit);
        }
    }
}
