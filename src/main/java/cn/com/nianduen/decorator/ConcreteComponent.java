package cn.com.nianduen.decorator;

/**
 * Created by rachoochen on 8/18/14.
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("native operation");
    }

}
