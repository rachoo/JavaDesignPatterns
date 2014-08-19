package cn.com.nianduen.strategy;

/**
 * Created by rachoochen on 8/19/14.
 */
public class Environment {

    private Istrategy istrategy = null;

    public Environment(Istrategy istrategy) {
        this.istrategy = istrategy;
    }

    public void doMethod(){
        this.istrategy.operation();
    }

}
