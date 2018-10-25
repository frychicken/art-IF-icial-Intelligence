import javax.swing.*; 
import java.awt.*;
import java.util.*;

public class Execut  extends Component {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Method_T contentt;
	String msg = "UP";
	private int x = 200;
	private int y = 600;
	private ArrayList<Integer> xOb = new ArrayList<Integer>();
	private  ArrayList<Integer> yOb = new ArrayList<Integer>();
	int userin = 1;
	public Execut(int userin) {
		this.userin = userin;
	}
	public void assin() {
		for (int i =0; i < userin; i++) {
			if (i ==0 || i ==2) {
				xOb.add(RanX());
			}else {
				xOb.add(xOb.get(0) + 237);
			}
			yOb.add(RanY());
		}
		Collections.sort(yOb);
		Collections.reverse(yOb);
	}

	public int RanX() {
		Random randomness = new Random();
		int rand = randomness.nextInt(300)+1;
		return rand;
	}
	public int RanY() {
		Random randomness = new Random();
		int rand = randomness.nextInt(400)+1;
		return rand;
	}
	class Method_T extends Component {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g){

			for (int i =0; i < userin; i++) {
				g.setColor(Color.green);
				g.fillRect(xOb.get(i),yOb.get(i),150,150);
				if ((y >= yOb.get(i) && y<= yOb.get(i) +150) && (x+123 >= xOb.get(i)  && x+123 <= xOb.get(i)+150)) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
				}
				else if ((y >= yOb.get(i)  && y<= yOb.get(i) +150) && (x >= xOb.get(i)  && x <= xOb.get(i)+150)) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
				}
			}
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
			for (int i =0; i < userin; i ++) {
				if ((y >= yOb.get(i) && y<= yOb.get(i) +150) && (x+123 >= xOb.get(i)  && x+123 <= xOb.get(i)+150)) {
					left = true;
					right = false;
				}
				else if ((y >= yOb.get(i)  && y<= yOb.get(i) +150) && (x >= xOb.get(i)  && x <= xOb.get(i)+150)) {
					left = false;
					right = true;
				}
				if (left) {
					msg = "LEFT";
					x-=3;
					if (y <= yOb.get(i) +150 && (x+123) < xOb.get(i)  ) { up = true; }
					else up = false;
				}
				if(right) {
					msg = "RIGHT";
					x+=3;
					if (y <= yOb.get(i) +150 && x > xOb.get(i)  ) { up = true; }
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
				right = false;
				left = false;
			}
		}
	}
}
