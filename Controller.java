/**
 * Models the player controller
 * Contains functionalities for the player to control the object
 */
public class Controller {
    private double posX;
    private double posY;
    private double width;
    private double height;
    
    private Rectangle player;

    /**
     * Constructor. Creates a rectangle for the player to control
     * @param arena The environment for the controller to be placed in
     */
    public Controller(GameArena arena) { 
        posX = (arena.getArenaWidth() * 1/2);
        posY = (arena.getArenaHeight() * 9/10);
        width = (arena.getArenaWidth() * 1/10);
        height = 20;
        player = new Rectangle(posX, posY, width, height, "BLUE");
        arena.addRectangle(player);
    }

    /**
     * Obtains the controller rectangle
     * @return the controller rectangle
     */
    public Rectangle getRectangle() {
        return player;
    }

    /**
     * Obtains the controller rectangle x-coordinate
     * @return the controller rectangle x-coodrdinate, in pixels
     */
    public double getPosX() {
        return posX;
    }

    /**
     * Obtains the controller rectangle y-coordinate
     * @return the controller rectangle y-coodrdinate, in pixels
     */
    public double getPosY() {
        return posY;
    }

    /**
     * Obtains the controller rectangle width
     * @return the controller rectangle width, in pixels
     */
    public double getControllerWidth() {
        return width;
    }

    /**
     * Obtains the controller rectangle height
     * @return the controller rectangle height, in pixels
     */
    public double getControllerHeight() {
        return height;
    }

    /**
     * Decrements the controller rectangle's x-coordinate
     * 'Moves' the rectangle to the left
     */
    public void moveLeft() {
        this.posX -= (1 + (getControllerWidth() * 0.1));
        player.setXPosition(posX);
    }
    
    /**
     * Increments the controller rectangle's x-coordinate
     * 'Moves' the rectangle to the right
     */
    public void moveRight() {
        this.posX += (1 + (getControllerWidth() * 0.1));
        player.setXPosition(posX);
    }

    
/*    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
            this.moveLeft();
            break;
            case 'd':
            this.moveRight();
            this.getRectangle().setXPosition(this.getPosX());
            break;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37:
            this.moveLeft();
            this.getRectangle().setXPosition(this.getPosX());
            break;
            case 40:
            this.moveRight();
            this.getRectangle().setXPosition(this.getPosX());
            break;
        }
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("-------");
        System.out.println("Released key char: " + e.getKeyChar());
        System.out.println("Released key code: " + e.getKeyCode());
    }
*/
}