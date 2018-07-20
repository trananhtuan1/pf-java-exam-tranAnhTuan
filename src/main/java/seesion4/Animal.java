package seesion4;

import behavior.CanFly;
import behavior.CanRun;
import behavior.CanSwim;

public class Animal implements CanFly, CanRun, CanSwim {

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean run() {
        return true;
    }
}
