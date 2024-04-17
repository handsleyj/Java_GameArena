/**
 * Models a ball to bounce around the game environment
 * @author Jesse Handsley
 */
public class Breaker {
    private double posX;
    private double posY;
    private double diameter; 

    private Ball b;

    /**
     * Constructor. Initialises a ball and adds it to the game environment
     * @param arena The environment which the ball will be placed into
     * @param player The player controller Game Object. Used to determine the ball's starting position and diameter, in pixels
     */
    public Breaker(GameArena arena, Controller player) {
        posX = player.getPosX();
        posY = player.getPosY() - 50;
        diameter = player.getControllerWidth() * 1/4;
        b = new Ball(posX, posY, diameter, "WHITE");
        arena.addBall(b);
    } 
}
