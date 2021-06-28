package com.thanglv.threadshared.config;

/**
 * @author thanglv on 6/28/2021
 * @project thread-shared
 */
public class BallFactory {

    public BallFactory() {
    }

    public static Ball getInstance() {
        return BallSingletonHelper.ball;
    }

    private static class BallSingletonHelper {
        private static final Ball ball = new Ball(System.currentTimeMillis());
    }
}
