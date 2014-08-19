package cn.com.nianduen.template;

/**
 * Created by rachoochen on 8/19/14.
 */
public abstract class AbstractTemplate {

    public void templateMethod(){

        abstractMethod();
        hook();
        concreteMethod();

    }

    protected abstract void abstractMethod();

    protected void hook(){
        System.out.println("hook in abs");
    }

    private final void concreteMethod(){
        System.out.println("my main work");
    }

}
