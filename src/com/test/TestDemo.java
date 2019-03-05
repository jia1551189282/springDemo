package com.test;

import com.controller.UserController;
import com.domain.Person;
import com.domain.Person1;
import com.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) context.getBean("person");
        person.setName("依然");
        System.out.println(person);

        Person person1 = (Person) context.getBean("person1");
        person1.setName("明明");
        System.out.println(person1);
        Person person2 = (Person) context.getBean("person2");
        person2.setEmail("susu@qq.com");
        System.out.println(person2);

        Person1 person4 = (Person1) context.getBean("person3");
        Person1 person5 = (Person1) context.getBean("person3");
        System.out.println(person4);
        System.out.println(person5);
        Person1 person6 = (Person1) context.getBean("person4");
        Person1 person7 = (Person1) context.getBean("person4");
        System.out.println(person6);
        System.out.println(person7);
    }
    @Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

        User user1 = (User) context.getBean("user1");
        System.out.println(user1);

        User user2 = (User) context.getBean("user2");
        System.out.println(user2);

        User user3 = (User) context.getBean("user3");
        System.out.println(user3);

    }
    @Test
    public  void  testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user4 = (User) context.getBean("user4");
        System.out.println(user4);

        User user5 = (User) context.getBean("user5");
        System.out.println(user5);

        User user6 = (User) context.getBean("user6");
        System.out.println(user6);

        User user7 = (User) context.getBean("user7");
        System.out.println(user7);

        User user8 = (User) context.getBean("user8");
        System.out.println(user8);
    }
    @Test
    public  void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserController userController = context.getBean(UserController.class);
        userController.test();
    }
}
