package com.rules.hello;

import com.rules.hello.pojo.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesHello {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession helloWorldSession = kieClasspathContainer.newKieSession("test_hello_world");


        /*Person person = new Person();
        person.setAge("16");
        person.setName("18");
        helloWorldSession.insert(person);*/


        Person person2 = new Person();
        person2.setAge("30");
        person2.setName("张三");
        helloWorldSession.insert(person2);

        int count = helloWorldSession.fireAllRules();
        System.out.println(String.format("总共执行了%s条规则",count));


        helloWorldSession.insert(person2);
        helloWorldSession.dispose();
    }
}