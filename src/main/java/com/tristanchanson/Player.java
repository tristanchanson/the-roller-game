package com.tristanchanson;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player extends Circle {

    private int speed = 4;

    public Player() {
        this.setRadius(40);
        this.setCenterX(100);
        this.setCenterY(200);
        this.setFill(Color.BLUE);

        this.setFocusTraversable(true);
        this.requestFocus();
        this.setOnKeyPressed(new PlayerKeyHandler(this));

        new PlayerAnimationTimer(this).start();
    }

    public void move() {
        this.setCenterX(this.getCenterX() + speed);
    }

    public void changeDirection() {
        this.speed *= -1;
    }

}
