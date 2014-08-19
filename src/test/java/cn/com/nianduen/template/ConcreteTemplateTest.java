package cn.com.nianduen.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcreteTemplateTest {

    @Test
    public void test() throws Exception {

        ConcreteTemplate template = new ConcreteTemplate();
        template.templateMethod();

    }

}