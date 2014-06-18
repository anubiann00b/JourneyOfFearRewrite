package game.entity;

import game.entity.sprite.EntitySprite;
import org.newdawn.slick.Graphics;

public abstract class Entity {
    
    public static int EAST = 0;
    public static int SOUTH = 1;
    public static int WEST = 2;
    public static int NORTH = 3;
    
    public int x;
    public int y;
    public int dir;
    public EntitySprite sprite;
    
    public Entity(int nx, int ny) {
        x = nx;
        y = ny;
    }
    
    public abstract void update();
    
    public void render(Graphics g) {
        sprite.render(g,dir,x,y);
    }
}
