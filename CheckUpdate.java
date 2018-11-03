import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;

public class CheckUpdate {
 public void checkup() throws Exception {
	 String cheee = null; 
	 try {
	 cheee = getClass().getResource("version.txt").toString();
	 cheee = cheee.substring(cheee.indexOf(":")+1);
	 } catch (Exception e) {
		 System.out.println("Error checking update: Missing dependencie(s)");
			JOptionPane.showConfirmDialog((Component) null, "Error checking update: Missing dependencie(s)",
					"Update", JOptionPane.CLOSED_OPTION);
			return;
	 }
	 File checkifex = new File(cheee);
		if(checkifex.exists() && !checkifex.isDirectory()) {
			@SuppressWarnings("resource")
			BufferedReader br2 = new BufferedReader(new FileReader(cheee)); 
			String st2; 
			StringBuilder fromweb = new StringBuilder();
			while ((st2 = br2.readLine()) != null) { 
				fromweb.append(st2);
			}
			System.out.println("Checking for updates");
			JOptionPane.showConfirmDialog((Component) null, "Checking for updates",
					"Update", JOptionPane.CLOSED_OPTION);
			BufferedReader br = null;
			StringBuilder fromcom = new StringBuilder();
			try {
				URL url = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/CurrentVersion.txt");
				br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((line = br.readLine()) != null) {
					fromcom.append(line);
				}
			} finally {
				if (br != null) {
					br.close();
				}
			}
			int c =Integer.valueOf(fromcom.toString());
			int d = Integer.valueOf(fromweb.toString());
			if (c > d) {
				if (JOptionPane.showConfirmDialog((Component) null, "New version is available Do you want to update?\n new version:" +c+" your version: "+d,
						"Confirm", JOptionPane.YES_NO_OPTION) ==0) {
					BufferedWriter bw = null;
					FileWriter fw = null;
					try {
						fw = new FileWriter(cheee);
						bw = new BufferedWriter(fw);
						bw.write(fromcom.toString());
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (bw != null)
								bw.close();
							if (fw != null)
								fw.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
					Runtime r= Runtime.getRuntime();
					r.exec("java -jar UpdaterAOW.jar");
	                Uaow uaow = new Uaow();
	                uaow.up();
				}
				else return;
				
			}
			else {System.out.println("No new updates");
			JOptionPane.showConfirmDialog((Component) null, "No new updates",
					"Update", JOptionPane.CLOSED_OPTION);
			}
				
       }
		else {
			JOptionPane.showConfirmDialog((Component) null, "Cannot check for update\n Reason: version = null",
					"Update", JOptionPane.CLOSED_OPTION);
		}
 }
}

