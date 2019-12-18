package com.tristanchanson;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class PlayerKeyHandler implements EventHandler<KeyEvent> {

    private final Player player;

    public PlayerKeyHandler(Player player) {
        this.player = player;
    }

    @Override
    public void handle(KeyEvent event) {

        switch (event.getCode()) {
            case SPACE:
                player.changeDirection();
                break;
            case SHIFT:
                switchColor();
                break;
            default:
                // Nothing
        }

    }

    private void switchColor() {
        if (player.getFill() == Color.BLUE) {
            player.setFill(Color.RED);
        } else {
            player.setFill(Color.BLUE);
        }
    }
}
