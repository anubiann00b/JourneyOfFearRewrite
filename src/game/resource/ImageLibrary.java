package game.resource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public enum ImageLibrary {
    
    // Players.
    PLAYER_RIGHT("player/right.png"),
    PLAYER_UP("player/up.png"),
    PLAYER_LEFT("player/left.png"),
    PLAYER_DOWN("player/down.png"),
    
    // Attacks.
    ATTACK_SWORD_SLASH("attacks/sword_slash.png"),
    
    // Tiles.
    TILE_GRASS("tiles/grass.png");
    
    private String filepath;
    private Image image;
    
    ImageLibrary(String filepath) {
        this.filepath = filepath;
    }
    
    public Image get() {
        if (image == null) {
            try {
                image = ResourceLoader.initializeImage(filepath);
            } catch (SlickException e) {
                throw new RuntimeException("Error loading resource: " + filepath);
            }
        }
        return image.copy();
    }
    
    public Image[] getAsSheet() {
        get();
        
        int size = image.getHeight();
        int frames = image.getWidth()/size;
        
        Image[] imgs = new Image[frames];
        
        for (int i=0;i<frames;i++)
            imgs[i] = image.getSubImage(i*size,0,size,size);
        
        return imgs;
    }
}
