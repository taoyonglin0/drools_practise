package com.rules.attribute;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 议程组测试类
 */
public class AgendaGroupTest {

    public static void main(String[] args) throws InterruptedException {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession agendaGroupSession = kieClasspathContainer.newKieSession("agenda-group_test");
        //让AgendaGroup分组为ag1的获取焦点
        //agendaGroupSession.getAgenda().getAgendaGroup("ag1").setFocus();
        //agendaGroupSession.getAgenda().getAgendaGroup("agenda01").setFocus();
        //agendaGroupSession.getAgenda().getAgendaGroup("agenda02").setFocus();
        //agendaGroupSession.getAgenda().getAgendaGroup("agenda03").setFocus();
        //TODO agenda-focus 默认为true，如何通过代码取消议程分组的关注focus


        int count = agendaGroupSession.fireAllRules();
        Thread.currentThread().sleep(10000);
        System.out.println(String.format("总共执行了%s条规则",count));
        agendaGroupSession.dispose();
    }
}
