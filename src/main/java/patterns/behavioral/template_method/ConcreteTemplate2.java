package patterns.behavioral.template_method;

import utils.ReflectUtil;

public class ConcreteTemplate2 extends AbstractTemplate {
    @Override
    public void firstStep() {
        ReflectUtil.printCurrentMethod();
    }

    @Override
    public void secondStep() {
        ReflectUtil.printCurrentMethod();
    }
}
