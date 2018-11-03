import java.awt.*;
import javax.swing.JFrame;
public class Loading extends Component {
	private static final long serialVersionUID = 1L;
	int x = 10;
	double f;
	double strin=1;
	String display;
	String msg[] = new String[3];
	public Loading(JFrame frame) {
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lollol.png")));
	}
	public void paint(Graphics g) {
		g.drawString("loading...", 130,150);
		g.drawString((int)strin + "%", 140, 210);
		g.setColor(Color.BLACK);
		g.drawRect(105, 180, 90, 10);
		g.setColor(Color.BLUE);
		g.fillRect(105, 180, x, 10);
		drawdouknow(g);
	}
	public void changec() {
		x++; 
		f = x;
		strin = (double)(f/90)*100; 
		strin = Math.ceil(strin);
	}
	int i;
	double f2 = Math.random();
	public void drawdouknow(Graphics f) {
		msg[0] = "You can click \"help\" in the setup menu to get help";
		msg[1] = "Sometimes, the program does something not expected";
		if (f2>0.5)
			i =0;
		else 
			i = 1;

		display = msg[i];

		f.setFont(new Font("default", Font.ITALIC, 10));
		f.setColor(Color.BLACK);
		f.drawString(display, 20,120);

	}
}
