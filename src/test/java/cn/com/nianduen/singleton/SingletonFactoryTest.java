package cn.com.nianduen.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonFactoryTest {

    @Test
    public void testGetInstance() throws Exception {

        SingletonTarget target1 = SingletonFactory.getInstance();
        SingletonTarget target2 = SingletonFactory.getInstance();
        System.out.println(target1);
        System.out.println(target2);

    }
}