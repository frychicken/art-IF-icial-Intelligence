import java.awt.*;
public class Loading extends Component {
	private static final long serialVersionUID = 1L;
	int x = 10;
	double f;
	double strin=1;
	public void paint(Graphics g) {
		g.drawString("loading...", 130,150);
		g.drawString(strin + "%", 140, 210);
		g.setColor(Color.BLACK);
		g.drawRect(105, 180, 90, 10);
		g.setColor(Color.BLUE);
		g.fillRect(105, 180, x, 10);
	}
	public void changec() {
		x++; 
		f = x;
		strin = (double)(f/90)*100; 
		strin = Math.ceil(strin);
	}
}
