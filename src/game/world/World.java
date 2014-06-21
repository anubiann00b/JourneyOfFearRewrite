package game.world;

import game.Game;
import org.newdawn.slick.Graphics;

public class World {
    
    public Tile[][] tiles;
    public int width;
    public int height;
    
    public World(int w, int h) {
        width = w;
        height = h;
        tiles = new Tile[w][h];
        for (int i=0;i<w;i++)
            for (int j=0;j<h;j++)
                tiles[i][j] = Tile.GRASS;
    }
    
    public void render(Graphics g, int cx, int cy) {
        for(int i=cx/64;i<Math.min(width,(cx+Game.VIEW_SIZE_X)/64+1);i++) {
            for(int j=cy/64;j<Math.min(height,(cy+Game.VIEW_SIZE_Y)/64+1);j++) {
                 tiles[i][j].render(g,i*64,j*64);
            }
        }
    }
}
