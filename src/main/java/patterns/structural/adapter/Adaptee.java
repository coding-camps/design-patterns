package patterns.structural.adapter;

import utils.ReflectUtil;

public class Adaptee {
    public void doOper1() {
        ReflectUtil.printCurrentMethod();
    }
}