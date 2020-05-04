package com.rules.attribute;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;

public class DateFormatTest {

    public static void main(String[] args) {
        //必须在kieSession创建之前进行属性设置
        System.setProperty("drools.dateformat","yyyy-MM-dd HH:mm:ss");
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieClasspathContainer.newKieSession("date_format_test");
        int count = kieSession.fireAllRules();
        System.out.println(String.format("[总共执行了%s条规则]",count));
        kieSession.dispose();
    }
}
