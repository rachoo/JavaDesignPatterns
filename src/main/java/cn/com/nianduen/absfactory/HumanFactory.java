package cn.com.nianduen.absfactory;

/**
 * Created by rachoochen on 8/19/14.
 */
public class HumanFactory extends AbsHumanFactory {

    @Override
    public Human createHuman(Class<? extends Human> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }

}
