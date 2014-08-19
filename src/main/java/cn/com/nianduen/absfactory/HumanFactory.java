package cn.com.nianduen.absfactory;

/**
 * Created by rachoochen on 8/19/14.
 */
public class HumanFactory extends AbsHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
