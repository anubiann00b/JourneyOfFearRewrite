package game.entity;

import game.entity.sprite.EntitySprite;
import game.resource.ImageLibrary;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player extends Entity {
    
    public Input i;
    
    public Player(int nx, int ny) {
        super(nx,ny);
        sprite = new EntitySprite(4,166,
            ImageLibrary.PLAYER_RIGHT.getAsSheet(),
            ImageLibrary.PLAYER_DOWN.getAsSheet(),
            ImageLibrary.PLAYER_LEFT.getAsSheet(),
            ImageLibrary.PLAYER_UP.getAsSheet()
        );
    }
    
    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
        super.render(g);
    }
}
