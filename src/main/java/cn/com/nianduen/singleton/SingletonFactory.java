package cn.com.nianduen.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by rachoochen on 8/19/14.
 */
public class SingletonFactory {

    private static SingletonTarget singleton;

    static {
        try {
            Class c = Class.forName(SingletonTarget.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (SingletonTarget) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonTarget getInstance(){
        return singleton;
    }

}
