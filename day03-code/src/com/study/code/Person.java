package com.study.code;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写 equals 方法
    @Override
    public boolean equals(Object obj) {
        // 1. 判断是不是同一个对象（比地址）
        if (this == obj) {
            return true;
        }

        // 2. 判断是否为 null 或者类型不匹配
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. 强制类型转换
        Person other = (Person) obj;

        // 4. 逐个比较属性
        return age == other.age && Objects.equals(name, other.name);
    }

    // 重写 hashCode 方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // getter 和 setter（可选）
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

