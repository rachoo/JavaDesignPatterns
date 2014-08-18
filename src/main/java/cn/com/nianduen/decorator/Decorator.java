package cn.com.nianduen.decorator;

/**
 * Created by rachoochen on 8/18/14.
 */
public class Decorator implements Component{

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
