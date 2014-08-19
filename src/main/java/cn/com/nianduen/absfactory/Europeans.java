package cn.com.nianduen.absfactory;

/**
 * Created by rachoochen on 8/19/14.
 */
public class Europeans implements Human{

    @Override
    public void getColor() {
        System.out.println("i am white");
    }

    @Override
    public void talk() {
        System.out.println("i speak English");
    }

}
