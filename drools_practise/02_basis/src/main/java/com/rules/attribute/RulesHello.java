package com.rules.attribute;

import com.rules.attribute.pojo.Customer;
import com.rules.attribute.pojo.Order;
import com.rules.attribute.pojo.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;

public class RulesHello {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        KieSession basisTest = kieClasspathContainer.newKieSession("drools_basis_test");

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("顾客1");
        customer.setGender("male");
        basisTest.insert(customer);

/*        Customer customer2 = new Customer();
        customer2.setAge(20);
        customer2.setName("顾客1");
        customer2.setGender("male");*/

        Order order = new Order();
        order.setCustomer(customer);
        order.setPrice(new BigDecimal(10000.00));

        basisTest.insert(order);



        Person person = new Person();
        person.setAge(45);
        basisTest.insert(person);


        int count = basisTest.fireAllRules();
        System.out.println(String.format("总共执行了%s条规则",count));
        basisTest.dispose();
    }
}