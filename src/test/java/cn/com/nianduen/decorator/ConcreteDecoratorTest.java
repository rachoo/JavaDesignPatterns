package cn.com.nianduen.decorator;

import org.junit.Test;

import java.io.FileInputStream;

import static org.junit.Assert.*;

public class ConcreteDecoratorTest {

    @Test
    public void testOperation() throws Exception {
        Decorator decorator = new ConcreteDecorator(new ConcreteComponent());
        decorator.operation();
    }
}