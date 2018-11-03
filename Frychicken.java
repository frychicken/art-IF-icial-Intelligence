import java.awt.Component;
import javax.swing.JOptionPane;
public class Frychicken {
	public int ChickenNotFood() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Done! Are your sure you want to exit?",
				"Confirm", JOptionPane.YES_NO_OPTION);
	}
	public int ChickenIsNotFood() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Don't you know how to read?\n \tMAX: 3 (THREE)",
				"Hmmm? Na ni?", JOptionPane.CLOSED_OPTION);
	}
}
