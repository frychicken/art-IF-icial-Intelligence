import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JOptionPane;

public class CheckUpdate {
 public void checkup() throws IOException {
	 File checkifex = new File(System.getProperty("user.dir")+"/version.txt");
		if(checkifex.exists() && !checkifex.isDirectory()) {
			@SuppressWarnings("resource")
			BufferedReader br2 = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/version.txt")); 
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
				if (JOptionPane.showConfirmDialog((Component) null, "New version is available Do you want to update?",
						"Confirm", JOptionPane.YES_NO_OPTION) ==0) {
					Runtime r= Runtime.getRuntime();
					r.exec("java -jar UpdaterAOW.jar");
					System.exit(0);
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
