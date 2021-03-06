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
    public boolean stopped;
    
    public EntitySprite(int animFrames, int newSpeed, Image[]... dirs) {
        images = new Image[4][animFrames];
        System.arraycopy(dirs,0,images,0,4);
        frames = dirs[0].length;
        speed = newSpeed;
        counter = speed;
        stopped = false;
    }
    
    public void render(Graphics g, int dir, int x, int y) {
        
        if (!stopped)
            counter -= GameManager.delta;
        
        if (counter <= 0) {
            counter = speed;
            
            if (frame == frames-1)
                frame = 0;
            else
                frame++;
        }
        g.drawImage(images[dir][frame],x,y);
    }

    public void stop() {
        stopped = true;
    }

    public void start() {
        stopped = false;
    }
}
