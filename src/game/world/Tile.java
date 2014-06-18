package game.world;

import game.resource.ImageLibrary;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public enum Tile {
    
    GRASS(ImageLibrary.TILE_GRASS);
    
    public Image img;
    
    Tile(ImageLibrary i) {
        img = i.get();
    }
    
    public void render(Graphics g, int x, int y) {
        g.drawImage(img,x,y);
    }
}
