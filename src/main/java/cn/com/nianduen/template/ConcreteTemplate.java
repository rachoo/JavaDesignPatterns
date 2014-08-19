package cn.com.nianduen.template;

/**
 * Created by rachoochen on 8/19/14.
 */
public class ConcreteTemplate extends AbstractTemplate{

    @Override
    protected void abstractMethod() {
        System.out.println("override abstract method");
    }

    @Override
    protected void hook() {
        super.hook();
        System.out.println("override hook");
    }

}
