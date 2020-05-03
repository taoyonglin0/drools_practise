package com.rules.attribute.pojo;

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
    private Integer age;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 学校名称
     */
    private String schoolName;

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
