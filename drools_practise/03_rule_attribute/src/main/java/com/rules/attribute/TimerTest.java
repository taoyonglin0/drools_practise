package com.rules.attribute;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.TimedRuleExecutionOption;

/**
 * 议程组测试类
 */
public class TimerTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("drools.dateformat","yyyy-MM-dd HH:mm:ss");
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //开启定时执行控制
        KieSessionConfiguration kieSessionConfiguration = kieServices.newKieSessionConfiguration();
        kieSessionConfiguration.setOption(TimedRuleExecutionOption.YES);
        KieBaseConfiguration kieBaseConfiguration = kieServices.newKieBaseConfiguration();
        KieBase timerTestKieBase = kieClasspathContainer.newKieBase("kbase_timer_test", kieBaseConfiguration);
        KieSession timerTestSession = timerTestKieBase.newKieSession(kieSessionConfiguration, null);


        int count = timerTestSession.fireAllRules();
        Thread.currentThread().sleep(100000);
        System.out.println(String.format("总共执行了%s条规则",count));
        timerTestSession.dispose();
    }
}
