package cn.com.nianduen.singleton;

import org.junit.Test;

public class Singleton2Test {

    @Test
    public void testGetInstance() throws Exception {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}