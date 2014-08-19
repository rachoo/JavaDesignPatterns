package cn.com.nianduen.absfactory;

/**
 * Created by rachoochen on 8/19/14.
 */
public class Asians implements Human{

    @Override
    public void getColor() {
        System.out.println("I am yellow");
    }

    @Override
    public void talk() {
        System.out.println("i speak Chinese");
    }

}
