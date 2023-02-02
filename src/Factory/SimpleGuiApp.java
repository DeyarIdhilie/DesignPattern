/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.awt.Rectangle;

public class SimpleGuiApp {

	public static void main(String[] args) throws Exception {
		
//		// Microsoft
		Gui gui = new MicrosoftGui();
		Window w = gui.createGui();
		w.setBounds(new Rectangle(100,200, 500, 500));
		w.show();
		
		Thread.sleep(2000);
		
		// Linux
		gui = new LinuxGui();
		w = gui.createGui();
		w.setBounds(new Rectangle(600,200, 500, 500));
		w.show();
		
		Thread.sleep(2000);
		
		// Apple
		gui = new MacGui();
		w = gui.createGui();
		w.setBounds(new Rectangle(1100,200, 500, 500));
		w.show();
	}
}
