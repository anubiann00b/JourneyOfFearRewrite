package game.world;

public class WorldGenerator {

    public static World genWorld(int sx, int sy) {
        return new World((int)(2*Math.random()*sx),(int)(2*Math.random()*sy));
    }
}
