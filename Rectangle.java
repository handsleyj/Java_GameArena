/**
 * Models a simple, solid rectangle. 
 * This class represents a Rectangle object. When combined with the GameArena class,
 * instances of the Rectangle class can be displayed on the screen.
 */
public class Rectangle extends GameObjects
{
	// The following instance variables define the
	// information needed to represent a Rectangle
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double width;				// The width of this Rectangle
	private double height;				// The height of this Rectangle

	/**
	 * Constructor. Creates a Rectangle with the given parameters.
	 * @param x The x co-ordinate position of top left corner of the Rectangle (in pixels)
	 * @param y The y co-ordinate position of top left corner of the Rectangle (in pixels)
	 * @param w The width of the Rectangle (in pixels)
	 * @param h The height of the Rectangle (in pixels)
	 * @param col The colour of the Rectangle (Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW or #RRGGBB)
	 */
	public Rectangle(double x, double y, double w, double h, String col)
	{
		super(x, y, col);
		this.width = w;
		this.height = h;
	}	
									
	/**
	 * Constructor. Creates a Rectangle with the given parameters.
	 * @param x The x co-ordinate position of top left corner of the Rectangle (in pixels)
	 * @param y The y co-ordinate position of top left corner of the Rectangle (in pixels)
	 * @param w The width of the Rectangle (in pixels)
	 * @param h The height of the Rectangle (in pixels)
	 * @param col The colour of the Rectangle (Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW or #RRGGBB)
	 * @param layer The layer this Rectangle is to be drawn on. Objects with a higher layer number are always drawn on top of those with lower layer numbers.
	 */
	public Rectangle(double x, double y, double w, double h, String col, int layer)
	{
		super(x, y, layer, col);
		this.width = w;
		this.height = h;
	}	
			
	/**
	 * Obtains the width of this Rectangle.
	 * @return the width of this Rectangle,in pixels.
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * Sets the width of this Rectangle to the given value
	 * @param w the new width of this Rectangle, in pixels.
	 */
	public void setWidth(double w)
	{
		width = w;
	}

	/**
	 * Obtains the height of this Rectangle.
	 * @return the height of this Rectangle,in pixels.
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * Sets the height of this Rectangle to the given value
	 * @param h the new height of this Rectangle, in pixels.
	 */
	public void setHeight(double h)
	{
		height = h;
	}

	/**
	 * Moves this Rectangle by the given amount.
	 * 
	 * @param dx the distance to move on the x axis (in pixels)
	 * @param dy the distance to move on the y axis (in pixels)
	 */
	public void move(double dx, double dy)
	{
		addToXPosition(dx);
		addToYPosition(dy);
	}

	/**
	 * Determines if this Rectangle is overlapping the given rectangle.
	 * 
	 * @param r the rectangle to test for collision
	 * @return true of this rectangle is overlapping the rectangle r, false otherwise.
	 */
	public boolean collides(Rectangle r)
	{
		return (getXPosition() + getWidth() > r.getXPosition() && getXPosition() < r.getXPosition() + r.getWidth()) && (getYPosition() + getHeight()> r.getYPosition() && getYPosition() < r.getYPosition() + r.getHeight());
	}
}
