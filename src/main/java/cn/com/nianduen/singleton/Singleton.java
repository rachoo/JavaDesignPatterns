package cn.com.nianduen.singleton;

/**
 * Created by rachoochen on 8/14/14.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
