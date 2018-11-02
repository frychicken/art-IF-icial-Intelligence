import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import javax.swing.JOptionPane;
class Uaow {
	public void up() throws IOException { 
					File file[] = new File[8];
					file[0] = new File(getClass().getResource("Dog_.class").toString().substring(getClass().getResource("Dog_.class").toString().indexOf(":")+1));
                	file[2] = new File(getClass().getResource("Execut.class").toString().substring(getClass().getResource("Execut.class").toString().indexOf(":")+1));
					file[3] = new File(getClass().getResource("Nani.class").toString().substring(getClass().getResource("Nani.class").toString().indexOf(":")+1));
					file[4] = new File(getClass().getResource("Soundfx.class").toString().substring(getClass().getResource("Soundfx.class").toString().indexOf(":")+1));
					file[5] = new File(getClass().getResource("Loading.class").toString().substring(getClass().getResource("Loading.class").toString().indexOf(":")+1));
					file[1] = new File(getClass().getResource("Frychicken.class").toString().substring(getClass().getResource("Frychicken.class").toString().indexOf(":")+1));
					file[6] = new File(getClass().getResource("Execut$Method_T.class").toString().substring(getClass().getResource("Execut$Method_T.class").toString().indexOf(":")+1));
					file[7] = new File(getClass().getResource("Dog_$1.class").toString().substring(getClass().getResource("Dog_$1.class").toString().indexOf(":")+1));

					for(int a =0; a<8; a++) {
					try {
						file[a].delete();
					} catch (Exception e) {
						JOptionPane.showConfirmDialog((Component) null, "Cannot find file"+file[a],
								"Update", JOptionPane.CLOSED_OPTION);
						System.out.println("cannot find file");
						e.printStackTrace();
					 }
					}
					URL website[] = new URL[8];
						website[0] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Dog_.class");
						website[1] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Nani.class");
						website[2] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Execut.class");
						website[3] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Soundfx.class");
						website[4] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Loading.class");
						website[5] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Frychicken.class");
						website[6] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Execut$Method_T.class");
						website[7] = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/bin/Dog_$1.class");

						String cheee = getClass().getResource("").toString();
						 cheee = cheee.substring(cheee.indexOf(":")+1);
			          String af[] = new String[8];
			          af[0] = "Dog_.class";
			          af[1] = "Nani.class";
			          af[2] = "Execut.class";
			          af[3] = "Soundfx.class";
			          af[4] = "Loading.class";
			          af[5] = "Frychicken.class";
			          af[7] = "Dog_$1.class";
			          af[6] = "Execut$Method_T.class";
					for(int a=0; a<8; a++) {
					try {
						ReadableByteChannel ok = Channels.newChannel(website[a].openStream());
						FileOutputStream okay = new FileOutputStream(cheee+af[a]);
						okay.getChannel().transferFrom(ok, 0, Long.MAX_VALUE);
						okay.close();
						ok.close();
					} catch (Exception e) {
						JOptionPane.showConfirmDialog((Component) null, "Update failed",
								"Update", JOptionPane.CLOSED_OPTION);
						System.out.println("Update failed");
						e.printStackTrace();
					}
					}
				
				JOptionPane.showConfirmDialog((Component) null, "Update completed",
						"Update", JOptionPane.CLOSED_OPTION);
				}
}
	
