package game.entity.player;

import game.GameManager;
import game.entity.Entity;
import game.entity.sprite.EntitySprite;
import game.resource.ImageLibrary;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player extends Entity {
    
    public Input input;
    
    public Player(int nx, int ny) {
        super(nx,ny);
        sprite = new EntitySprite(4,166,
            ImageLibrary.PLAYER_RIGHT.getAsSheet(),
            ImageLibrary.PLAYER_UP.getAsSheet(),
            ImageLibrary.PLAYER_LEFT.getAsSheet(),
            ImageLibrary.PLAYER_DOWN.getAsSheet()
        );
    }
    
    @Override
    public void update() {
        boolean[] pr = new boolean[4];
        boolean[] hl = new boolean[4];
        
        pr[0] = input.isKeyPressed(Options.MOVE_RIGHT.key());
        pr[1] = input.isKeyPressed(Options.MOVE_UP.key());
        pr[2] = input.isKeyPressed(Options.MOVE_LEFT.key());
        pr[3] = input.isKeyPressed(Options.MOVE_DOWN.key());
        
        hl[0] = input.isKeyDown(Options.MOVE_RIGHT.key());
        hl[1] = input.isKeyDown(Options.MOVE_UP.key());
        hl[2] = input.isKeyDown(Options.MOVE_LEFT.key());
        hl[3] = input.isKeyDown(Options.MOVE_DOWN.key());
        
        for (int i=0;i<2;i++) {
            if ((hl[i] || pr[i]) && (hl[i+2] || pr[i+2])) {
                hl[i] = false;
                hl[i+2] = false;
            }
        }
        
        int dx = 0;
        int dy = 0;
        
        for (int i=0;i<4;i++) {
            if (pr[i])
                dir = i;
            else
                if (i==dir)
                    sprite.stop();
            if (hl[i]) {
                if (i==dir)
                    sprite.start();
                dx += i%2==0 ? 1-i : 0;
                dy += i%2==1 ? i-2 : 0;
                if (!hl[(i+1)%4] && !hl[(i+2)%4] && !hl[(i+3)%4])
                    dir = i;
            } else if (i==dir)
                sprite.frame = 1;
        }
        
        int steps = (int) (GameManager.delta*0.5);
        int actualSteps = steps;
        
        x += actualSteps*dx;
        y += actualSteps*dy;
    }

    @Override
    public void render(Graphics g) {
        super.render(g);
    }
}
