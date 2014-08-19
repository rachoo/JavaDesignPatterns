package cn.com.nianduen.absfactory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HumanFactoryTest {

    @Test
    public void testCreateHuman() throws Exception {

        AbsHumanFactory humanFactory = new HumanFactory();
        Human african = humanFactory.createHuman(African.class);
        Human asians = humanFactory.createHuman(Asians.class);
        Human europeans = humanFactory.createHuman(Europeans.class);

        List<Human> list = new ArrayList();
        list.add(african);
        list.add(asians);
        list.add(europeans);

        for (Human human : list){
            human.getColor();
            human.talk();
        }

    }

}