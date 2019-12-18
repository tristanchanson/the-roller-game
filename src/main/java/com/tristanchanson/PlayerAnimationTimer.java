package com.tristanchanson;

import javafx.animation.AnimationTimer;

public class PlayerAnimationTimer extends AnimationTimer {

    private final Player player;

    public PlayerAnimationTimer(Player player) {
        this.player = player;
    }

    @Override
    public void handle(long now) {
        player.move();

        if (player.getCenterX() + player.getRadius() >= App.WIDTH) {
            player.changeDirection();
        } else if (player.getCenterX() - player.getRadius() < 0) {
            player.changeDirection();
        }
    }

}
