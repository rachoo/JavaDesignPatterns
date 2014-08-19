package cn.com.nianduen.strategy;

/**
 * A enum used strategy pattern
 * Created by rachoochen on 8/19/14.
 */
public enum EnumStrategy {
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a - b;
        }
    };

    private String value;

    EnumStrategy(String value) {
        this.value = value;
    }

    public abstract int exec(int a,int b);

    public String getValue() {
        return value;
    }

}
