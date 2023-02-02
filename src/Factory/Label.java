/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * This class provides the support for the label widget.
 *  
 * @author Chandan R. Rupakheti (chandan.rupakheti@rose-hulman.edu)
 */
public abstract class Label extends AbstractComponent {
	public static final int H_SPACE = 3;

	private String text;

	public Label(String text) {
		this(text, null);
	}

	public Label(String text, Rectangle bound) {
		this(null, text, bound);
	}

	public Label(IComponent parent, String text, Rectangle bound) {
		super(parent, bound);
		
		this.text = text;
		
		if(this.text == null)
			this.text = "";
	}
	
	/**
	 * Gets the text in the label.
	 */
	public String getText() {
		return this.text;
	}
	
	/**
	 * Sets the text in the label. 
	 * Calling this method results in the call to {@link #fireUpdate()}, 
	 * which informs the component hierarchy to re-draw itself.
	 */
	public void setText(String text) {
		this.text = text;
		this.fireUpdate();
	}
	
	public abstract void drawComponent(Graphics2D g);
	
}
