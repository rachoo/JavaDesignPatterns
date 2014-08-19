package cn.com.nianduen.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentTest {

    @Test
    public void testDoMethod() throws Exception {

        Environment environment = new Environment(new MethodA());
        Environment environment1 = new Environment(new MethodB());
        Environment environment2 = new Environment(new MethodC());

        environment.doMethod();
        environment1.doMethod();
        environment2.doMethod();

    }
}