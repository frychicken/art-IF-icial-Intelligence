import javax.swing.*; 
import java.awt.*;
import java.util.*;

public class Execut extends Component {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Method_T contentt;
	String msg = "UP";
	private int x = 200;
	private int y = 600;
	private int xOb = RanX() ;
	private int yOb = RanY() ;
	public int RanX() {
		Random randomness = new Random();
		int rand = randomness.nextInt(300)+1;
		return rand;
	}
	public int RanY() {
		Random randomness = new Random();
		int rand = randomness.nextInt(300)+1;
		return rand;
	}
	class Method_T extends Component {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g){
			g.setColor(Color.green);
			g.fillRect(xOb,yOb,150,150);
			g.setColor(Color.black);
			g.fillOval(x, y, 10, 10);
			g.setColor(Color.black);
			g.fillOval(x+123, y, 10, 10);
			g.setColor(Color.red);
			g.fillRect(x + 40, y +40, 50, 50);
			g.drawString(msg, 300, 750);
		}
	}
	public void run() {
		frame = new JFrame("D 2 + D"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		contentt = new Method_T();
		frame.getContentPane().add(BorderLayout.CENTER, contentt);  
		frame.setVisible(true); 
		frame.setResizable(false);
		frame.setSize(600, 800); 
		runpls();
	}
	private boolean right = false;
	private boolean left = false;
	private boolean up = true;

	public void runpls() {
		while(true) {
			if ((y >= yOb && y<= yOb+150) && (x+123 >= xOb && x+123 <= xOb +150) && (x+123) > ((xOb+150)/2)) {
				left = true;
				right = false;
			}
			if ((y >= yOb && y<= yOb+150) && (x >= xOb && x <= xOb +150) && x > ((xOb+150)/2)) {
				left = false;
				right = true;
			}
			if (left) {
				msg = "LEFT";
				x-=2;
				if (y <= yOb+150 && (x+123) < xOb ) { up = true; }
				else up = false;
			}
			if(right) {
				msg = "RIGHT";
				x+=2;
				if (y <= yOb+150 && x > xOb ) { up = true; }
				else up = false;
			}
			if(up) {
				y--;
				left = false;
				right = false;
			}
			if (y+40+50 <= 0) {
				frame.setVisible(false); 
				return;
			}
			try {
				Thread.sleep(3); 
			}
			catch (Exception nothing) {
				nothing.printStackTrace();
			} 
			frame.repaint(); 
		}
	}
}
