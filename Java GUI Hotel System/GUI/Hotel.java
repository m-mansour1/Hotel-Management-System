import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Hotel  extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	
	
	public Hotel() {

		Border border= BorderFactory.createRaisedSoftBevelBorder();

		
		this.setLayout(null);
		this.setTitle("The Four");
		this.setSize(800,720);
		this.setLocation(300,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		this.setBackground(new Color(255, 255, 255));
		

		JPanel panel= new JPanel();
		panel.setBounds(0, 0, 800, 800);
		panel.setBackground(new Color(32, 35, 46));
		panel.setLayout(null);
		this.add(panel);
		//Bodoni MT
		JLabel label1 = new JLabel();
		label1.setText(" T  H  E     F  O  U  R ");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setForeground(new Color(207, 190, 107));
		label1.setFont(new Font("Bodoni MT", Font.BOLD, 40));
		label1.setIconTextGap(20);
		label1.setBounds(210, 40, 400,40 );
    	panel.add(label1);
		
		JPanel line1 = new JPanel();
		line1.setBounds(120,60,90,1);
		line1.setBackground(new Color(207, 190, 107));
		line1.setLayout(null);
		panel.add(line1);
		
		JPanel line2 = new JPanel();
		line2.setBounds(565,60,90,1);
		line2.setBackground(new Color(207, 190, 107));
		line2.setLayout(null);
		panel.add(line2);
		
		//Eras Light ITC
		JLabel label2 = new JLabel();
		label2.setText(" Your Second Home.");
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.TOP);
		label2.setForeground(new Color(207, 190, 107));
		label2.setFont(new Font("Rage Italic", Font.PLAIN, 20));
		label2.setIconTextGap(20);
		label2.setBounds(310, 40, 460,110 );
    	panel.add(label2);
		
		
    	
    	button1= new JButton();
    	button1.setBounds(240,250,300,60);
		button1.setBackground(new Color(207, 190, 107));
		button1.setText(" GUEST ");
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setFocusable(false);
		button1.setFont(new Font("Century Gothic", Font.BOLD,30));
		button1.setForeground(new Color(32, 35, 46));
		button1.setBorder(border);
		button1.addActionListener(this);
    	panel.add(button1);
		
		
    	

    	button2= new JButton();
    	button2.setBounds(240,340,300,60);
		button2.setBackground(new Color(207, 190, 107));
		button2.setText(" STAFF ");
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setFocusable(false);
		button2.setFont(new Font("Century Gothic", Font.BOLD,30));
		button2.setForeground(new Color(32, 35, 46));
		button2.setBorder(border);
		button2.addActionListener(this);
    	panel.add(button2);
		
    	
    	ImageIcon img = new ImageIcon("C:\\Users\\HES\\Desktop\\hotell.png");
    	ImageIcon gold = new ImageIcon("C:\\Users\\HES\\Desktop\\crc-removebg-preview.png");
    
    	JLabel pic= new JLabel();
    	pic.setBounds(40,480,900,320);
    	pic.setIcon(img);
    	pic.setBackground(new Color(32, 35, 46));
    	pic.setOpaque(true);
    	
    	panel.add(pic);
	
     	JLabel pic2= new JLabel();
    	pic2.setBounds(140,90,700,480);
    	pic2.setIcon(gold);
    	pic2.setBackground(new Color(32, 35, 46));
    	pic2.setOpaque(true);
    	
    	panel.add(pic2);
		
    	
    	
		this.setVisible(true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button2) {
			new StaffLogin();
			
		}
		if (e.getSource()==button1) {
			new GuestMenu();
			
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Hotel();
	}

}
