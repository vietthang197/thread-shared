package com.thanglv.threadshared.config;

/**
 * @author thanglv on 6/28/2021
 * @project thread-shared
 */
public class Ball {
    private long timeCreated;

    private static volatile Ball ball;

    public Ball(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public static Ball getInstance() {
        if (ball == null) {
            synchronized (Ball.class) {
                if (ball == null)
                    return new Ball(System.currentTimeMillis());
            }
        }
        return ball;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "timeCreated=" + timeCreated +
                '}';
    }
}
