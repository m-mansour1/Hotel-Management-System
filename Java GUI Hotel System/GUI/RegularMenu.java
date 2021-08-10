import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RegularMenu extends JFrame implements ActionListener{
JButton button1;
JButton button2;
JButton back;
RegularMenu(){
		

		Border border= BorderFactory.createRaisedSoftBevelBorder();

		
		this.setLayout(null);
		this.setTitle("The Four");
		this.setSize(600,620);
		this.setLocation(400,80);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		this.setResizable(false);
		this.setBackground(new Color(255, 255, 255));
		

		JPanel panel= new JPanel();
		panel.setBounds(0, 0, 600, 620);
		panel.setBackground(new Color(32, 35, 46));
		panel.setLayout(null);
	//	this.add(panel);
		//Bodoni MT
		JLabel label1 = new JLabel();
		label1.setText(" T  H  E     F  O  U  R ");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setForeground(new Color(207, 190, 107));
		label1.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		label1.setIconTextGap(20);
		label1.setBounds(160, 40, 400,40 );
    	panel.add(label1);
		
		JPanel line1 = new JPanel();
		line1.setBounds(70,60,90,1);
		line1.setBackground(new Color(207, 190, 107));
		line1.setLayout(null);
		panel.add(line1);
		
		JPanel line2 = new JPanel();
		line2.setBounds(420,60,90,1);
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
		label2.setBounds(210, 40, 460,110 );
    	panel.add(label2);
		
    	
    	button1= new JButton();
    	button1.setBounds(140,220,300,60);
		button1.setBackground(new Color(207, 190, 107));
		button1.setText(" Book a Room ");
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setFocusable(false);
		button1.setFont(new Font("Century Gothic", Font.BOLD,24));
		button1.setForeground(new Color(32, 35, 46));
		button1.setBorder(border);
		button1.addActionListener(this);
    	panel.add(button1);
		
		
    	

    	button2= new JButton();
    	button2.setBounds(140,310,300,60);
		button2.setBackground(new Color(207, 190, 107));
		button2.setText(" Book a service ");
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setFocusable(false);
		button2.setFont(new Font("Century Gothic", Font.BOLD,24));
		button2.setForeground(new Color(32, 35, 46));
		button2.setBorder(border);
		button2.addActionListener(this);
    	panel.add(button2);
		
    	back= new JButton();
		back.setBounds(15,17,50,50);
		back.setText("<");
		back.setFocusable(false);
		back.setHorizontalTextPosition(JLabel.CENTER);
		back.setVerticalTextPosition(JLabel.TOP);
		back.setFont(new Font("Century Gothic", Font.BOLD, 18));
		back.setBackground(new Color(207, 190, 107));
		back.setForeground(new Color(32, 35, 46));
		back.addActionListener(this);
		panel.add(back);
		
		
    	
		JPanel line3 = new JPanel();
		line3.setBounds(0,520,600,3);
		line3.setBackground(new Color(207, 190, 107));
		line3.setLayout(null);
		panel.add(line3);
			
		
		JPanel line4 = new JPanel();
		line4.setBounds(0,530,600,3);
		line4.setBackground(new Color(207, 190, 107));
		line4.setLayout(null);
		panel.add(line4);
		
    	this.add(panel);
    	this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button1) {
			new BookRoom();
			this.dispose();
		}
	
		
		if (e.getSource()==button2) {
			new BookService();
			this.dispose();
		}
		
		if (e.getSource()==back){
			new GuestMenu();
			this.dispose();
		}
	}
	
}
