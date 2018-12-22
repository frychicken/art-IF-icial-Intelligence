import java.awt.BorderLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckUpdate {
	private boolean stillqm = true;
 public void checkup() throws Exception {
	 String todis = "Checking for updates";
		JFrame frame = new JFrame("Checking update"); 
		DrawCheck drc= new DrawCheck(frame);
		frame.getContentPane().add(BorderLayout.CENTER, drc); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);
		frame.setSize(300, 300); 	
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);  
		while (stillqm) {
		try {
			drc.changec(todis);
			drc.repaint();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 int cheee = drc.getVersion(); 
			System.out.println("Checking for updates");
			BufferedReader br = null;
			StringBuilder fromcom = new StringBuilder();
			try {
				URL url = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/CurrentVersion.txt");
				br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((line = br.readLine()) != null) {
					fromcom.append(line);
				}
			}catch (Exception e) {
				 todis = "Error: Cannot connect to server!";
					try {
						drc.changec(todis);
						drc.repaint();
						Thread.sleep(1000);
					} catch (Exception er) {
						er.printStackTrace();
					}
				System.out.println("Error: Cannot connect to server!");
				frame.setVisible(false);  
				stillqm = false;
				return ;
			} finally {
				if (br != null) {
					br.close();
				}
			} 
			int c =Integer.valueOf(fromcom.toString());
			int d = cheee;
			if (c > d) {
				 todis = "New version is available";
					try {
						drc.changec(todis);
						drc.repaint();
						Thread.sleep(1000);
					} catch (Exception er) {
						er.printStackTrace();
					}
				if (JOptionPane.showConfirmDialog((Component) null, "New version is available Do you want to update?\n new version:" +c+" your version: "+d,
						"Confirm", JOptionPane.YES_NO_OPTION) ==0) {
					 todis = "Almost done! Updating...";
						try {
							drc.changec(todis);
							drc.repaint();
							Thread.sleep(1000);
						} catch (Exception er) {
							er.printStackTrace();
						}
					Runtime r= Runtime.getRuntime();
					r.exec("java -jar UpdaterAOW.jar");
	                Uaow uaow = new Uaow();
	                uaow.up();
	                frame.setVisible(false);  
	                stillqm = false;
				}
				else {
					frame.setVisible(false);  
					stillqm = false;
					return;
				}
				
			}
			else {System.out.println("No new updates");
			JOptionPane.showConfirmDialog((Component) null, "No new updates",
					"Update", JOptionPane.CLOSED_OPTION);
					frame.setVisible(false);
			stillqm = false;
			}
				
       }

 }
}
