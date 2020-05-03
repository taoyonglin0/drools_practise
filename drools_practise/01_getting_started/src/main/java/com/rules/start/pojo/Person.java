package com.rules.start.pojo;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Person {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private String age;

    public Person() {}

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
