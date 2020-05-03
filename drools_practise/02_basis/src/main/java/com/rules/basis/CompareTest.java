package com.rules.basis;

import com.rules.basis.pojo.Person;
import com.rules.basis.pojo.School;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;

/**
 * 比较符测试类
 */
public class CompareTest {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession droolsBasisTest = kieClasspathContainer.newKieSession("contains");

        /*Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(10);
        person1.setClassName("一班");

        Person person2 = new Person();
        person2.setName("李四");
        person2.setAge(20);
        person2.setClassName("大二班");

        School school = new School();
        ArrayList<String> classNameList = new ArrayList<String>();
        classNameList.add("一班");
        classNameList.add("二班");
        classNameList.add("三班");
        school.setClassNameList(classNameList);
        droolsBasisTest.insert(person2);
        droolsBasisTest.insert(person1);
        droolsBasisTest.insert(school);*/

        //测试字符串类型Contains
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(10);
        person1.setClassName("一班");
        person1.setSchoolName("测试学校一");

        Person person2 = new Person();
        person2.setName("李四");
        person2.setAge(20);
        person2.setClassName("大二班");
        person2.setSchoolName("测试学校二");

        School school = new School();
        ArrayList<String> classNameList = new ArrayList<String>();
        classNameList.add("一班");
        classNameList.add("二班");
        classNameList.add("三班");
        school.setClassNameList(classNameList);
        school.setName("测试学校一");

        droolsBasisTest.insert(person2);
        droolsBasisTest.insert(person1);
        droolsBasisTest.insert(school);
        int count = droolsBasisTest.fireAllRules();
        System.out.println(String.format("总共执行了%s条规则",count));
        droolsBasisTest.dispose();
    }
}
