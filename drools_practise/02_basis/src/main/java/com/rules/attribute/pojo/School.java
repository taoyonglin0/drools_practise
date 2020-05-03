package com.rules.attribute.pojo;

import lombok.ToString;

import java.util.List;

@ToString
public class School {

    /**
     * 班级名称
     */
    private List<String> classNameList;
    /**
     * 班级人数
     */
    private Integer classCount;

    /**
     * 学校名称
     */
    private String name;

    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
    }

    public void setClassNameList(List<String> classNameList) {
        this.classNameList = classNameList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassCount() {
        return classCount;
    }

    public List<String> getClassNameList() {
        return classNameList;
    }

    public String getName() {
        return name;
    }
}
