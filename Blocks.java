import java.math.*;

/**
 * Models an array of blocks to be destroyed by the player to gain points
 * @author Jesse Handsley
 */
public class Blocks {
    private Rectangle[] blocks;
    private Rectangle block;

    //an array of the colours each block could take
    private String colours[] = {"GREEN", "ORANGE", "RED"};
    
    private double width;
    private double height;

    private int blocksPerRow;
    private double space; 

    /**
     * Constructor. Creates a set of blocks to be destroyed by the ball
     * The number of blocks created, spacing between them, and their respective sizes is calculated in this method
     * @param arena The environment for the blocks to be placed in 
     * @param player The controller object for the player is used to determine the dimensions of blocks, in pixels
     */
    public Blocks(GameArena arena, Controller player) {
        //defines the width and height of each individual rectangle (block)
        width = player.getControllerWidth() * 9/10;
        height = player.getControllerHeight();

        //determines the number of rectangles per row by dividing the width of the arena by 50
        this.blocksPerRow = (int)Math.floor((arena.getArenaWidth() / 50) - 1);

        blocks = new Rectangle[2*blocksPerRow];

        //determines the separation distance between blocks (and between the edge blocks and the edge of the arena)
        this.space = ((arena.getArenaWidth() / blocksPerRow) - width);

        //defines the placement for the first and second rows of blocks
        double row1 = arena.getArenaHeight() / 3;
        double row2 = row1 + (2 * height);

        //initialises blocks and places them into an array for easy access
        for (int i = 0, j = 0; (i < blocksPerRow) || (j < blocksPerRow);) {
            if (i < blocksPerRow) {
                block = new Rectangle((space + (i * (width + space))), row1, width, height, colours[0]);
                blocks[i] = block;
                arena.addRectangle(block);
            }
            else if (j < blocksPerRow) {
                block = new Rectangle((space + (j * (width + space))), row2, width, height, colours[0]);
                blocks[i] = block;
                arena.addRectangle(block);
                j++;
            }
            i++;
        }
    }
}
