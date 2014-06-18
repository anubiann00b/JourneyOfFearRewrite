package game.entity.sprite;

import game.GameManager;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class EntitySprite {
    
    public Image[][] images;
    public int speed;
    public int frame;
    public int counter;
    public int frames;
    
    public EntitySprite(int animFrames, int newSpeed, Image[]... dirs) {
        images = new Image[4][animFrames];
        System.arraycopy(dirs,0,images,0,4);
        frames = dirs[0].length;
        speed = newSpeed;
    }
    
    public void render(Graphics g, int dir, int x, int y) {
        counter -= GameManager.delta;
        
        if (counter <= 0) {
            counter = speed;
            frame = frame < frames ? frames+1 : 0;
        }
        
        g.drawImage(images[dir][frame],x,y);
    }
}
