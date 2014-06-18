package game.state;

import game.GameManager;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class StatePlaying extends BasicGameState {
    
    private int id;
    public GameManager gameManager;
    
    public StatePlaying(int id) {
        this.id = id;
        gameManager = new GameManager();
    }
    
    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        gameManager.init(container);
    }
    
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        gameManager.update(container,delta);
    }
    
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        gameManager.render(container,g);
    }
    
    @Override
    public int getID() {
        return id;
    }
}
