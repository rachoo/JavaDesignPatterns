package cn.com.nianduen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void testGetString() throws Exception {
        String str = Demo.getString();
        System.out.println(str);
    }
}