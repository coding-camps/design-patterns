package patterns.behavioral.template_method;

import utils.ReflectUtil;

public abstract class AbstractTemplate {
    public abstract void firstStep();

    public abstract void secondStep();

    public void doSthBy2Steps() {
        System.out.print("================= begin\n => ");
        ReflectUtil.printCurrentMethod();
        firstStep();
        secondStep();
        System.out.println("========== end");
    }
}
