package cn.com.nianduen.decorator;

/**
 * Created by rachoochen on 8/18/14.
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    private void extraBehavior(){
        System.out.println("extraBehavior!");
    }

    public void operation(){
        super.operation();
        extraBehavior();
    }

}
