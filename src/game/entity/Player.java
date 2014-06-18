package game.entity;

import game.entity.sprite.EntitySprite;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

public class Player extends Entity {
    
    public Input i;
    
    public Player(int nx, int ny) {
        super(nx,ny);
        sprite = new EntitySprite(4,166,
            new Image[] {},
            new Image[] {},
            new Image[] {},
            new Image[] {}
        );
    }
    
    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
        
    }
}
