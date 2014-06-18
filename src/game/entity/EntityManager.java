package game.entity;

import java.util.ArrayList;
import java.util.List;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class EntityManager {
    
    public List<Entity> entities;
    public Player player;
    public List<Enemy> enemies;
    
    public EntityManager() {
        entities = new ArrayList<>();
        enemies = new ArrayList<>();
    }
    
    public void init(Input input) {
        player = new Player(0,0);
    }
    
    public void update() {
        player.update();
        for (Enemy e : enemies)
            e.update();
    }
    
    public void render(Graphics g) {
        player.render(g);
        for (Enemy e : enemies)
            e.render(g);
    }
    
    public void addEnemy(Enemy e) {
        entities.add(e);
        enemies.add(e);
    }
}
