package com.thanglv.threadshared.config;

/**
 * @author thanglv on 6/28/2021
 * @project thread-shared
 */
public class BallFactory2 {
    private static Ball ball;

    public BallFactory2() {
    }

    public synchronized static Ball getInstance() {
        if (ball == null) {
            return new Ball(System.currentTimeMillis());
        }
        return ball;
    }
}
