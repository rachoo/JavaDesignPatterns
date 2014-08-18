package cn.com.nianduen.singleton;

/**
 * Created by rachoochen on 8/14/14.
 */
public class Singleton2 {

    private Singleton2(){}

    private static class SingletonHolder{
        public static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }

}
