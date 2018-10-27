import java.awt.Component;
import javax.swing.JOptionPane;
public class Frychicken {
	public int ChickenNotFood() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Done! Are your sure you want to exit?",
				"Confirm", JOptionPane.YES_NO_OPTION);
	}
	public int ChickenIsNotFood() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Wrong answer!!",
				"You type something wrong", JOptionPane.ERROR_MESSAGE);
	}
    public int FriedChicken() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Do you want to enable debug mode?",
				"Debug option", JOptionPane.YES_NO_OPTION);
	}
}
