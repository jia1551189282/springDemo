package com.domain;
/*静态工厂创建person
 */
public class PersonFactory {

    public static Person createPerson(){
        return  new Person();
    }
}
