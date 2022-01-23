package patterns.behavioral.command;

import utils.ReflectUtil;

public class Receiver {
    public Receiver() {
    }

    public void action() {
        ReflectUtil.printCurrentMethod();
    }
}

