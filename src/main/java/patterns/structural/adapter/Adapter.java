package patterns.structural.adapter;

import utils.ReflectUtil;

public class Adapter extends Adaptee implements Target {

    @Override
    public void doOper2() {
        ReflectUtil.printCurrentMethod();
    }

}
