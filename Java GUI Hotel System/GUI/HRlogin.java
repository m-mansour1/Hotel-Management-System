import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class HRlogin extends JFrame implements ActionListener{
	
	
	JButton login; 
	HRlogin(){

		Border border= BorderFactory.createRaisedSoftBevelBorder();

		
		this.setLayout(null);
		this.setTitle("The Four");
		this.setSize(360,190);
		this.setLocation(540, 330);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		this.setResizable(false);
		this.setBackground(new Color(255, 255, 255));
		

		JPanel panel= new JPanel();
		panel.setBounds(0, 0, 360, 190);
		panel.setBackground(new Color(32, 35, 46));
		panel.setLayout(null);
	
		
		
		JLabel user= new JLabel();
		user.setBounds(20,25,90,30);
		user.setText("Username: ");
		user.setHorizontalTextPosition(JLabel.CENTER);
		user.setVerticalTextPosition(JLabel.TOP);
		user.setFont(new Font("Century Gothic", Font.BOLD, 14));
		user.setIconTextGap(20);
		user.setForeground(new Color(207, 190, 107));
		panel.add(user);
		
		JLabel password= new JLabel();
		password.setBounds(20,65,90,30);
		password.setText("Password: ");
		password.setHorizontalTextPosition(JLabel.CENTER);
		password.setVerticalTextPosition(JLabel.TOP);
		password.setFont(new Font("Century Gothic", Font.BOLD, 14));
		password.setIconTextGap(20);
		password.setForeground(new Color(207, 190, 107));
		panel.add(password);
		
		
		JTextField usertxt= new JTextField();
		usertxt.setBounds(115,25,170,27);
		panel.add(usertxt);
		
		JPasswordField passtxt= new JPasswordField();
		passtxt.setBounds(115,65,170,27);
		panel.add(passtxt);
		
		login= new JButton();
		login.setBounds(230,110,90,30);
		login.setText("Login");
		login.setBorder(border);
		login.setFocusable(false);
		login.setHorizontalTextPosition(JLabel.CENTER);
		login.setVerticalTextPosition(JLabel.TOP);
		login.setFont(new Font("Century Gothic", Font.BOLD, 14));
		login.setBackground(new Color(207, 190, 107));
		login.setForeground(new Color(32, 35, 46));
		login.addActionListener(this);
		panel.add(login);
		
		this.add(panel);	
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==login) {
			new HRMenu();
			this.dispose();
		
		}
	
	
	}
	

}
