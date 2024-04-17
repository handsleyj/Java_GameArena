/**
 * Models a superclass from which Game Objects can be dervived/extended
 */
public class GameObjects {
    private double xPosition;			// The X coordinate of this Game Object
    private double yPosition;			// The Y coordinate of this Game Object
    private int layer;					// The layer of this Game Object is on.
	private String colour;				// The colour of this Game Object
    
										// Permissable colours are:
										// BLACK, BLUE, CYAN, DARKGREY, GREY,
										// GREEN, LIGHTGREY, MAGENTA, ORANGE,
										// PINK, RED, WHITE, YELLOW or #RRGGBB 

	/**
	 * Constructor. Acts as way of implementinng sub-class objects
	 * @param c The colour of the Game Object to be initialised
	 * @param l The layer of the Game Object to be initialised
	 */
	public GameObjects(String c, int l) {
		this.xPosition = 0;
		this.yPosition = 0;
		this.layer = l;
		this.colour = c;
	}

	/**
	 * Constructor. Acts as way of implementinng sub-class objects
	 * @param x The x-coodrinate of the Game Object to be initialised
	 * @param y The y-coordinate of the Game Object to be initialised
	 * @param l The layer of the Game object to be initialised
	 * @param c The colour of the Game Object to be initialised
	 */
    public GameObjects(double x, double y, int l, String c) {
        this.xPosition = x;
        this.yPosition = y;
        this.layer = l;
        this.colour = c;
    }

	/**
	 * Constructor. Acts as way of implementinng sub-class objects
	 * @param x The x-coordinate of the Game Object to be initialised
	 * @param y The y-coordinate of the Game Object to be initialised
	 * @param c The colour of the Game Object to be initialised
	 */
    public GameObjects(double x, double y, String c) {
        this.xPosition = x;
        this.yPosition = y;
        this.layer = 0;
        this.colour = c;
    }

    /**
	 * Obtains the current position of this Game Object.
	 * @return the X coordinate of this Game Object within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Game Object.
	 * @return the Y coordinate of this Game Object within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Game Object to the given co-ordinates
	 * @param x the new x co-ordinate of this Game Object
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Game Object to the given co-ordinates
	 * @param y the new y co-ordinate of this Game Object
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Adds an input number to the x-coordinate of the Game Object
	 * @param x the amount to be added to the x co-ordinate
	 */
	public void addToXPosition(double x) {
		this.xPosition += x;
	}

	/**
	 * Adds an input number to the y co-ordinate of the Game Object
	 * @param y the amount to be added to the y co-ordinate
	 */
	public void addToYPosition(double y) {
		this.yPosition -= y;
	}

    /**
	 * Obtains the layer of this Game Object.
	 * @return the layer of this Game Object.
	 */
	public int getLayer()
	{
		return layer;
	}

	/**
	 * Sets the layer of this Game Object.
	 * @param l the new layer of this Game Object. Higher layer numbers are drawn on top of low layer numbers.
	 */
	public void setLayer(int l)
	{
		layer = l;
	}

	/**
	 * Obtains the colour of this Game Object.
	 * @return a textual description of the colour of this Game Object.
	 */
	public String getColour()
	{
		return colour;
	}

	/**
	 * Sets the colour of this Game Object.
	 * @param c the new colour of this Game Object, as a String value. Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW or #RRGGBB.
	 */
	public void setColour(String c)
	{
		colour = c;
	}
}
