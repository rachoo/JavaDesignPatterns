package cn.com.nianduen.singleton;

/**
 * Created by rachoochen on 8/19/14.
 */
public class SingletonTarget {

    private SingletonTarget(){}

    public void doMethod(){
        System.out.println("hello world, i am create by singleton factory");
    }

}
