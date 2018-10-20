import java.awt.Component;
import javax.swing.JOptionPane;
public class Frychicken {
  public int ChickenNotFood() throws Exception {
	  int i = isChickenFood("Are your sure you want to exit?");
	  return i;
  }
  public static int isChickenFood(String theMessage) {
	    int result = JOptionPane.showConfirmDialog((Component) null, theMessage,
	        "Are you sure?", JOptionPane.OK_CANCEL_OPTION);
	    return result;
	  }
}
