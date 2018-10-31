import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import javax.swing.JOptionPane;
class Uaow {
	public static void main(String[] args) throws IOException { 
			@SuppressWarnings("resource")
			BufferedReader br2 = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/version.txt")); 
			String st2; 
			StringBuilder fromweb = new StringBuilder();
			while ((st2 = br2.readLine()) != null) { 
				fromweb.append(st2);
			}
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
					File file = new File(System.getProperty("user.dir")+"/OAW.jar"); 
					try {
						file.delete();
					} catch (Exception e) {
						System.out.println("cannot find file");
						e.printStackTrace();
					}
					try {
						URL website = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/JarFile/AOW.jar");
						ReadableByteChannel ok = Channels.newChannel(website.openStream());
						FileOutputStream okay = new FileOutputStream(System.getProperty("user.dir")+"/OAW.jar");
						okay.getChannel().transferFrom(ok, 0, Long.MAX_VALUE);
						okay.close();
						ok.close();
						BufferedWriter bw = null;
						FileWriter fw = null;
						try {
							fw = new FileWriter(System.getProperty("user.dir")+"/version.txt");
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
					} catch (Exception e) {
						System.out.println("Update failed");
						e.printStackTrace();
					}
				}
				JOptionPane.showConfirmDialog((Component) null, "Update completed",
						"Update", JOptionPane.CLOSED_OPTION);
		
		}

	}
