package cn.com.nianduen.strategy;

/**
 * Created by rachoochen on 8/19/14.
 */
public class MethodA implements Istrategy{
    @Override
    public void operation() {
        System.out.println("method a");
    }
}
