package com.tekcreek.javacourse.enums;

/**
 * Enum types -
 * A special data type that enables for a variable to be a set of predefined
 * constants.
 * e.g.
 * enum Day {
 *     SUNDAY, MONDAY, ....
 * }
 */

//interface State {
//    int STOPPED = 0;
//    int STARTING = 1;
//    int STARTED = 2;
//}
//
//class Machine {
//
//    private int state = State.STOPPED;
//
//    public void setState(int state) {
//        // validation.
//        this.state = state;
//    }
//
//    public int getState() {
//        return this.state;
//    }
//
//}

enum State {
    STOPPED,
    STARTING,
    STARTED;
}

class Machine {

    private State state = State.STOPPED;

    public void setState(State state) {
        // validation.
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

}

public class EnumEx1 {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.setState(State.STARTING);
        System.out.println( m1.getState() ); // STARTING
    }
}








