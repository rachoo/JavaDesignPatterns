package cn.com.nianduen.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnumStrategyTest {

    @Test
    public void test() throws Exception {

        System.out.println(EnumStrategy.ADD.exec(2, 10));
        System.out.println(EnumStrategy.ADD.getValue());
        System.out.println(EnumStrategy.SUB.exec(100, 1000));
        System.out.println(EnumStrategy.SUB.getValue());

    }

}