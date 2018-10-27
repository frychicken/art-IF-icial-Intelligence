import javax.swing.*;
import java.awt.*;
public class Obstacle {
	public static void main(String[] args) throws Exception {
		Loading loadd = new Loading();
		JFrame frame = new JFrame("Loading"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add(BorderLayout.CENTER, loadd);  
		frame.setVisible(true); 
		frame.setResizable(false);
		frame.setSize(300, 300); 
		String f = "Avoiding objects simulator by @frychicken";
		for (int i =0; i<f.length(); i++) {
			String c = f.substring(i, i+1);
			System.out.print(c);
			try {
				loadd.changec();
				loadd.repaint();
				Thread.sleep(90); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		frame.setVisible(false);
		System.out.println();
		Nani nina = new Nani();
		nina.Nihaoma();
		System.out.println("All Done!");
		System.exit(0);
	}
}

