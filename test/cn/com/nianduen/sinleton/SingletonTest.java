package cn.com.nianduen.sinleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetSingleton() throws Exception {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }

}