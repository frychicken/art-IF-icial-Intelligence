import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*; 
class Dog_ extends JFrame implements ActionListener { 
	private static final long serialVersionUID = 1L;
	static JFrame frame;
	static JTextField textfield ; 
	static JTextField textfield2 ;
	static List<Integer> doggo = new LinkedList<Integer>();
	public static String cat_() throws Exception{
		final URI uri = new URI("https://github.com/frychicken/art-IF-icial-Intelligence/blob/master/README.md");
		frame = new JFrame("Setup");
		JButton button2 = new JButton();
		button2.setText("help");
		button2.setHorizontalAlignment(SwingConstants.LEFT);
		button2.setBorderPainted(false);
		button2.setOpaque(false);
		button2.setForeground(Color.BLUE);
		button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button2.setToolTipText("? - Display help");
		HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
		textAttrMap.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		button2.setFont(button2.getFont().deriveFont(Font.BOLD | Font.ITALIC));
		button2.setFont(button2.getFont().deriveFont(textAttrMap));
		button2.setBackground(Color.lightGray);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(uri);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		textfield = new JTextField("10", 16);
		textfield2 = new JTextField("1", 12); 
		JLabel  label = new JLabel("Enter how many lab(s) you want (default: 10)"); 
		JLabel label2 = new JLabel("Enter how many obstacle(s) you want (default: 1, max:3)"); 
		JButton  button = new JButton("Okay"); 
		Dog_ loen = new Dog_(); 
		button.addActionListener(loen); 
		JPanel panel = new JPanel(); 
		panel.add(label);  
		panel.add(textfield); 
		panel.add(label2);
		panel.add(textfield2); 
		panel.add(button); 
		panel.add(button2);
		frame.add(panel);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 150); 
		frame.setResizable(false);
		frame.setVisible(true); 
		synchronized (doggo) {
			while (doggo.isEmpty())
				try {
					doggo.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			String doge = doggo.get(0).toString() +"." + doggo.get(1).toString();
			doggo.clear();
			frame.setVisible(false);
			return doge;
		}
	}
	public void actionPerformed(ActionEvent e) { 	
		String s = e.getActionCommand(); 
		if (s.equals("Okay") ) { 
			synchronized (doggo) {
				try {  doggo.add(Integer.parseInt(textfield.getText())); doggo.add(Integer.parseInt(textfield2.getText()));} catch (Exception ee) {
					JOptionPane.showMessageDialog(frame, "Enter a number");
					doggo.add((Integer.parseInt(textfield.getText())));
					doggo.add((Integer.parseInt(textfield2.getText())));
				}
				doggo.notify();
			}
			frame.dispose();
		} 

	}
} 
