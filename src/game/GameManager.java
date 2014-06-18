package game;

import game.entity.EntityManager;
import game.network.NetworkHandler;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GameManager {
    
    public static int delta;
    
    public NetworkHandler network;
    public EntityManager e;
    
    public GameManager() {
        e = new EntityManager();
    }
    
    public void init(GameContainer container) {
        e.init(container.getInput());
    }
    
    public void update(GameContainer container, int newDelta) {
        e.update();
        delta = newDelta;
    }
    
    public void render(GameContainer container, Graphics g) {
        e.render(g);
    }
}