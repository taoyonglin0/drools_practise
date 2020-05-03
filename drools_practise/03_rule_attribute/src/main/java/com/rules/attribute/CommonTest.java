package com.rules.attribute;

import com.rules.attribute.pojo.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class CommonTest {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession commonTestSession = kieClasspathContainer.newKieSession("common_test");
        Person person = new Person();
        person.setAge(30);
        person.setName("张三");
        person.setClassName("一班");
        commonTestSession.insert(person);


        int count = commonTestSession.fireAllRules();
        System.out.println(String.format("【最终结果】总共执行了%s条规则",count));
        commonTestSession.dispose();
    }
}
