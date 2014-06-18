package game.resource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ResourceLoader {
    
    public static Image initializeImage(String filepath) throws SlickException {
        Image image = new Image("resources/art/" + filepath);
        image.setFilter(Image.FILTER_NEAREST);
        image = image.getScaledCopy(4);
        return image;
    }
}
