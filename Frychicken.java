import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	public int isstored() throws Exception {
		return JOptionPane.showConfirmDialog((Component) null, "Log file is stored at \n"+System.getProperty("user.dir")+"/log.txt",
				"Log file", JOptionPane.CLOSED_OPTION);
	}
	static int cie =0;
	static int cef =0;
	public void writeLog(String wrr) {
		String cheee;
		File checkifex = new File(System.getProperty("user.dir")+"/log.txt");
		 try {
			 cheee = getClass().getResource("log.txt").toString();
			 cheee = cheee.substring(cheee.indexOf(":")+1);
			 checkifex = new File(cheee);
			if(checkifex.exists() && !checkifex.isDirectory()) {
				BufferedWriter bw = null;
				FileWriter fw = null;
				try {
					fw = new FileWriter(cheee, true);
					bw = new BufferedWriter(fw);
					if (cie==0) {
				    DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
					LocalDateTime atm = LocalDateTime.now();  
					bw.write("===== Time execute: "+time.format(atm)+" ======\n");
					cie++;
					}
				    bw.write(wrr+"\n");
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
	      }
		 } catch(Exception e) {
			
			 if (cef ==0) {
				try {
					checkifex.createNewFile();
					 System.out.println("Log file is stored at: "+System.getProperty("user.dir")+"/log.txt");
					 try {
						isstored();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				cef++;
			 }
				cheee = System.getProperty("user.dir")+"/log.txt";
				BufferedWriter bw = null;
				FileWriter fw = null;
				try {
					fw = new FileWriter(cheee, true);
					bw = new BufferedWriter(fw);
					if (cie==0) {
				    DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
					LocalDateTime atm = LocalDateTime.now();  
					bw.write("===== Time execute: "+time.format(atm)+" ======\n");
					cie++;
					}
				    bw.write(wrr+"\n");
				} catch (IOException e2) {
					e2.printStackTrace();
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

		 }
	}
}
