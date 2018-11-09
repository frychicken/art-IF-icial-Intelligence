import java.awt.BorderLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckUpdate {
	private boolean stillqm = true;
 @SuppressWarnings("resource")
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
		
	 String cheee = null; 
	 try {
	 cheee = getClass().getResource("version.txt").toString();
	 cheee = cheee.substring(cheee.indexOf(":")+1);
	 } catch (Exception e) {
		 System.out.println("Error checking update: Missing dependencie(s)");
		 todis = "Error checking update: Missing dependencie(s)";
			try {
				drc.changec(todis);
				drc.repaint();
				Thread.sleep(1000);
			} catch (Exception er) {
				er.printStackTrace();
			}
			frame.setVisible(false);  
			stillqm = false;
			return;
	 }
	 File checkifex = new File(cheee);
		if(checkifex.exists() && !checkifex.isDirectory()) {
			BufferedReader br2 = new BufferedReader(new FileReader(cheee)); 
			String st2; 
			StringBuilder fromweb = new StringBuilder();
			while ((st2 = br2.readLine()) != null) { 
				fromweb.append(st2);
			}
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
			int d = Integer.valueOf(fromweb.toString());
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
		else {
			 todis = "Cannot check for update";
				try {
					drc.changec(todis);
					drc.repaint();
				} catch (Exception er) {
					er.printStackTrace();
				}
			JOptionPane.showConfirmDialog((Component) null, "Cannot check for update\n Reason: version = null",
					"Update", JOptionPane.CLOSED_OPTION);
			frame.setVisible(false);  
			stillqm = false;
		}
 }
}
}
