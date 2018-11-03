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
	Color object = Color.RED;
	Color obstacle = Color.GREEN;
	private boolean debugg = true;
	private boolean sound = true;
	private ArrayList<Integer> xOb = new ArrayList<Integer>();
	private  ArrayList<Integer> yOb = new ArrayList<Integer>();
	int userin = 1;
	int lalala;
	int alala;
	public Execut(int userin, Color object, Color obstacle, int i, int b) {
		this.object = object;
		this.obstacle = obstacle;
		lalala = i;
		alala = b;
		this.userin = userin;
	}
	public void assin(boolean debugg, boolean sound) {
		this.debugg = debugg;
		this.sound = sound;
		for (int i =0; i < userin; i++) {
			if (i ==0 || i ==2) {
				xOb.add(RanX());
			}else {
				double rand = Math.random();
				if (rand >= 0.5)
					xOb.add(xOb.get(0) + 237);
				else xOb.add(xOb.get(0)-237);
			}
			if (i==0||i==1)
				yOb.add(RanY());
			else {
				double rand = Math.random();
				if (rand >= 0.5)
					yOb.add(yOb.get(0) + 237);
				else yOb.add(yOb.get(0) - 237);
			}
		}
		Collections.sort(yOb);
		Collections.reverse(yOb);
		if (debugg) {
			for (int i= 0; i< userin; i++){
				System.out.println("x" + (i+1) + " " +xOb.get(i));
				System.out.println("y" + (i+1) +" " +yOb.get(i));
			}
		}
	}

	public int RanX() {
		Random randomness = new Random();
		int rand = randomness.nextInt(300)+30;
		return rand;
	}
	public int RanY() {
		Random randomness = new Random();
		int rand = randomness.nextInt(400)+30;
		return rand;
	}
	class Method_T extends Component {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g){

			for (int i =0; i < userin; i++) {
				g.setColor(obstacle);
				g.fillRect(xOb.get(i),yOb.get(i),150,150);
				if ((y >= yOb.get(i) && y<= yOb.get(i) +150) && (x+123 >= xOb.get(i)  && x+123 <= xOb.get(i)+150) && debugg) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
				}
				else if ((y >= yOb.get(i)  && y<= yOb.get(i) +150) && (x >= xOb.get(i)  && x <= xOb.get(i)+150) && debugg) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
				}
			}
			if (debugg) {
				g.setColor(Color.black);
				g.fillOval(x, y, 10, 10);
				g.setColor(Color.black);
				g.fillOval(x+123, y, 10, 10);
				g.setColor(Color.red);
				g.drawString(msg, 300, 750);
				int c = 700;
				int cc = 700;
				for (int i =0; i<userin; i++) {
					g.drawString("x"+(i+1)+": "+xOb.get(i), 500, c+=20);
					g.drawString("y"+(i+1)+": "+yOb.get(i), 430, cc+=20);
					g.drawString("lab(s) run: "+lalala, 60, 720);
					g.drawString("Obstacle(s): "+userin, 60, 700);
					g.drawString("lab(s): "+alala, 60, 680);	
				}
			}
			g.setColor(object);
			g.fillRect(x + 40, y +40, 50, 50);
		}
	}
	public void run() {
		frame = new JFrame("AO Simulator" + " @Debug mode: "+debugg + ", sound: "+ sound); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		contentt = new Method_T();
		frame.getContentPane().add(BorderLayout.CENTER, contentt);  
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lollol.png")));
		frame.setResizable(false);
		frame.setSize(600, 800); 
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
		runpls();
	}
	private boolean right = false;
	private boolean left = false;
	private boolean up = true;
	private boolean down = false;
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
				if (i==3){
				if (yOb.get(userin-2)-yOb.get(userin-1)-150<= 35 &&( (xOb.get(userin-2) < xOb.get(userin-1) && xOb.get(userin-3) > xOb.get(userin-1))||(xOb.get(userin-3) < xOb.get(userin-1) && xOb.get(userin -2) > xOb.get(userin-1)))){
				 down= true;
				 }
				}
				int fff = 0;
				if(down){
				 y+=3;
				 fff++;
				 if (fff==50){
				 right =!right;
				 left =!left;
				 fff=0;
				 up=true;
				 }
				}
				if (left) {
					msg = "LEFT";
					x-=3;
					if (y <= yOb.get(i) +150 && (x+123) < xOb.get(i)  ) { up = true; }
					else up = false;
					if (sound) {
					Soundfx soundfx = new Soundfx();
					soundfx.sound();
					}
				}
				if(right) {
					msg = "RIGHT";
					x+=3;
					if (y <= yOb.get(i) +150 && x > xOb.get(i)  ) { up = true; }
					else up = false;
					if (sound) {
					Soundfx soundfx = new Soundfx();
					soundfx.sound();
					}
				}
				if(up) {
					y--;
					left = false;
					right = false;
				}
				if (y+40+50 <= 0) {
					if (sound) {
					Soundfx soundfx = new Soundfx();
					soundfx.sound();
					}
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


