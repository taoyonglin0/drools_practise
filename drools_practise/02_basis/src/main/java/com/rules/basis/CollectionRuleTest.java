package com.rules.basis;

import com.rules.basis.pojo.School;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionRuleTest {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession collectionsSession = kieClasspathContainer.newKieSession("collections");
        School school = new School();
        ArrayList<String> classNameList = new ArrayList<String>();
        classNameList.add("一班");
        classNameList.add("二班");
        classNameList.add("三班");
        school.setClassNameList(classNameList);
        school.setName("测试学校一");


        School school2 = new School();
        ArrayList<String> classNameList2 = new ArrayList<String>();
        classNameList2.add("一班");
        classNameList2.add("大二班");
        classNameList2.add("三班");
        school2.setClassNameList(classNameList2);
        school2.setName("测试学校二");

        Map<String,School> map = new HashMap<String,School>();
        map.put("测试学校一",school);
        map.put("测试学校二",school2);
        collectionsSession.insert(map);

        Map<String,School> map2 = new HashMap<String,School>();
        map2.put("测试学校二",school2);
        collectionsSession.insert(map2);

        collectionsSession.insert(school);
        collectionsSession.insert(school2);


        int count = collectionsSession.fireAllRules();
        System.out.println(String.format("总共执行了%s条规则",count));
        collectionsSession.dispose();
    }
}
