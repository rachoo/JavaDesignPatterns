package cn.com.nianduen.absfactory;

/**
 * Created by rachoochen on 8/19/14.
 */
public abstract class AbsHumanFactory {

    public abstract Human createHuman(Class<? extends Human> c);

}
