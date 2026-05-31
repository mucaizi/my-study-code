package com.study.code;

import java.util.HashSet;

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        Person p3 = new Person("李四", 25);

        // 比较 equals
        System.out.println("p1 == p2: " + (p1 == p2));           // false，地址不同
        System.out.println("p1.equals(p2): " + p1.equals(p2));   // true，内容相同
        System.out.println("p1.equals(p3): " + p1.equals(p3));   // false，内容不同

        System.out.println("-------------------");

        // 演示 hashCode
        System.out.println("p1.hashCode(): " + p1.hashCode());   // 相同内容，hashCode 相同
        System.out.println("p2.hashCode(): " + p2.hashCode());   // 相同内容，hashCode 相同
        System.out.println("p3.hashCode(): " + p3.hashCode());   // 不同内容，hashCode 不同

        System.out.println("-------------------");

        // 演示在 HashSet 中的表现（验证重写 hashCode 的必要性）
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2); // 如果不重写 hashCode，这里会重复添加！
        set.add(p3);

        System.out.println("HashSet 中的元素个数: " + set.size()); // 输出 2（p1 和 p2 被视为同一个）
        System.out.println("HashSet 内容: " + set);
    }
}
