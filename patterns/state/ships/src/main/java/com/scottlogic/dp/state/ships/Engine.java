package com.scottlogic.dp.state.ships;

import java.util.Random;

public class Engine {
    private EngineState state = EngineState.OFF;

    public EngineState getEngineState() {
        return state;
    }

    public void start() {
        if (new Random().nextDouble() <= 0.25) {
            state = EngineState.BROKEN;
            System.out.println("Uh oh, looks like we might have broken the engine");
        }
        else {
            if (state == EngineState.OFF) {
                state = EngineState.ON;
                System.out.println("Engine started");
            } else {
                System.out.println("Engine already going");
            }
        }
    }

    public void stop() {
        if (state == EngineState.ON) {
            state = EngineState.OFF;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine already stopped");
        }
    }
}
