import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
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
	static JTextField textfield; 
	static JTextField txtTextBox1; static JTextField txtTextBox2; static JTextField txtTextBox3; static JTextField txtTextBox4;
	static JTextField txtTextBox5; static JTextField txtTextBox6;
	static JTextField textfield2;
	static JCheckBox checkBox;
	static JCheckBox checkBox2;
	static JCheckBox checkBox3;
	static int ff=0;
	static int fff=0;
	static int owen = 0;
	static List<Integer> doggo = new LinkedList<Integer>();
	public String cat_() throws Exception{
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
		JLabel lblLabel1 = new JLabel("Color Obstacles (default: green) ");
		JLabel lblLabel2 = new JLabel("Color Object (default: red) ");
		JLabel lbllbl1 = new JLabel("R");
		JLabel lbllbl2 = new JLabel("G");
		JLabel lbllbl3 = new JLabel("B");
		JLabel lbllbl4 = new JLabel("R");
		JLabel lbllbl5 = new JLabel("G");
		JLabel lbllbl6 = new JLabel("B");
		txtTextBox1 = new JTextField("0");
		txtTextBox2 = new JTextField("255"); 
		txtTextBox3 = new JTextField("0");
		txtTextBox4 = new JTextField("255"); 
		txtTextBox5  = new JTextField("0");
		txtTextBox6 = new JTextField("0"); 
		JButton  button = new JButton("Okay"); 
		Dog_ loen = new Dog_(); 
		button.addActionListener(loen); 
		JPanel panel = new JPanel(); 
		checkBox = new JCheckBox("Debug mode");  	
		checkBox2 = new JCheckBox("Enable sound");  	
		checkBox3 = new JCheckBox("Auto-pilot");  
		panel.add(label);  
		panel.add(textfield); 
		panel.add(label2);
		panel.add(textfield2); 
		panel.add(checkBox);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(button); 
		panel.add(button2);
		panel.add(lblLabel1);
		panel.add(lblLabel2);
		panel.add(lbllbl1);
		panel.add(lbllbl2);
		panel.add(lbllbl3);
		panel.add(lbllbl4);
		panel.add(lbllbl5);
		panel.add(lbllbl6);
		panel.add(txtTextBox1); panel.add(txtTextBox2); panel.add(txtTextBox3); panel.add(txtTextBox4); panel.add(txtTextBox5);
		panel.add(txtTextBox6);
		panel.setLayout(null);
		frame.add(panel);  
		label.setBounds(7, 1, 400,30);
		textfield.setBounds(330, 7, 170,20);
		label2.setBounds(7, 30, 500,30);
		textfield2.setBounds(410, 34, 100,20);
		checkBox.setBounds(250,100,120,19);
		checkBox2.setBounds(250,120,120,19);
		checkBox3.setBounds(250,140,120,19);
		button.setBounds(270,160,70,25);
		button2.setBounds(270, 185, 65, 25);
		lblLabel1.setBounds(7, 60, 250,20);
		lblLabel2.setBounds(7, 80, 200,20);
		lbllbl1.setBounds(250,65,50,10);
		lbllbl4.setBounds(250,85,50,10);
		lbllbl2.setBounds(350,65,50,10);
		lbllbl5.setBounds(350,85,50,10);
		lbllbl3.setBounds(450,65,50,10);
		lbllbl6.setBounds(450,85,50,10);
		txtTextBox1.setBounds(270, 60, 40, 20);
		txtTextBox2.setBounds(370, 60, 40, 20);
		txtTextBox3.setBounds(470, 60, 40, 20);
		txtTextBox4.setBounds(270, 80, 40, 20);
		txtTextBox5.setBounds(370, 80, 40, 20);
		txtTextBox6.setBounds(470, 80, 40, 20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300); 
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lollol.png")));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);       
		synchronized (doggo) {
			while (doggo.isEmpty())
				try {
					doggo.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			String doge = doggo.get(0) +"." + doggo.get(1)+","+ff+"*"+doggo.get(2)+"!"+doggo.get(3)+"@"+doggo.get(4)+"#"+doggo.get(5)+"$"+doggo.get(6)+"%"+doggo.get(7)+"^"+fff+"&"+owen;
			ff =0;
			doggo.clear();
			frame.setVisible(false);
			return doge;
		}
	}

	public void actionPerformed(ActionEvent e) { 	
		String s = e.getActionCommand(); 
		if(checkBox.isSelected()) {
			ff =1;
		}
		if(checkBox2.isSelected()) {
			fff =1;
		}
		if(checkBox3.isSelected()) {
			owen =1;
		}
		if (s.equals("Okay") ) { 
			synchronized (doggo) {
				try { 
					doggo.add(Integer.parseInt(textfield.getText()));
					doggo.add(Integer.parseInt(textfield2.getText()));
					doggo.add(Integer.parseInt(txtTextBox1.getText()));
					doggo.add(Integer.parseInt(txtTextBox2.getText()));
					doggo.add(Integer.parseInt(txtTextBox3.getText()));
					doggo.add(Integer.parseInt(txtTextBox4.getText()));
					doggo.add(Integer.parseInt(txtTextBox5.getText()));
					doggo.add(Integer.parseInt(txtTextBox6.getText()));
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(frame, "Enter a number");
					doggo.add((Integer.parseInt(textfield.getText())));
					doggo.add((Integer.parseInt(textfield2.getText())));
					doggo.add(Integer.parseInt(txtTextBox1.getText()));
					doggo.add(Integer.parseInt(txtTextBox2.getText()));
					doggo.add(Integer.parseInt(txtTextBox3.getText()));
					doggo.add(Integer.parseInt(txtTextBox4.getText()));
					doggo.add(Integer.parseInt(txtTextBox5.getText()));
					doggo.add(Integer.parseInt(txtTextBox6.getText()));
				}
				doggo.notify();
			}
			frame.dispose();
		} 

	}
} 
