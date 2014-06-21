package game;

import static game.Game.VIEW_SIZE_X;
import static game.Game.VIEW_SIZE_Y;
import game.entity.EntityManager;
import game.network.NetworkHandler;
import game.util.MathHelper;
import game.world.World;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GameManager {
    
    public static int delta;
    
    public NetworkHandler network;
    public EntityManager e;
    public World map;
    
    public int cx;
    public int cy;
    
    public GameManager() {
        e = new EntityManager();
        map = new World(20,16);
    }
    
    public void init(GameContainer container) {
        e.init(container.getInput());
        
    }
    
    public void update(GameContainer container, int newDelta) {
        e.update();
        delta = newDelta;
        
        cx = (int)MathHelper.median(0,map.width*64-VIEW_SIZE_X,e.player.x-VIEW_SIZE_X/2);
        cy = (int)MathHelper.median(0,map.height*64-VIEW_SIZE_Y,e.player.y-VIEW_SIZE_Y/2);
    }
    
    public void render(GameContainer container, Graphics g) {
        g.translate(-cx,-cy);
        map.render(g,cx,cy);
        e.render(g);
    }
}
