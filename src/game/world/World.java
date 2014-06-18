package game.world;

import org.newdawn.slick.Graphics;

public class World {
    
    public Tile[][] tiles;
    
    public World(int w, int h) {
        tiles = new Tile[w][h];
        for (int i=0;i<w;i++)
            for (int j=0;j<h;j++)
                tiles[i][j] = Tile.GRASS;
    }
    
    public void render(Graphics g) {
        for (int i=0;i<tiles.length;i++)
            for (int j=0;j<tiles[0].length;j++)
                tiles[i][j].render(g,i*64,j*64);
    }
}
