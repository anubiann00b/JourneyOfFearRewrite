package game.entity.player;

import org.newdawn.slick.Input;

public enum Options {
    
    MOVE_UP(Input.KEY_W),
    MOVE_DOWN(Input.KEY_S),
    MOVE_LEFT(Input.KEY_A),
    MOVE_RIGHT(Input.KEY_D);
    
    private int key;
    public int key() { return key; }
    
    Options(int key) {
        this.key = key;
    }
}
