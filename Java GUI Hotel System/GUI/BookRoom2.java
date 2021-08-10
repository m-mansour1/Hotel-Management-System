import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookRoom2 extends JFrame implements ActionListener {
JLabel[] labels;
JTextField[] texts;
JButton button;
Connection con;
JButton back;
Random rand= new Random();
	BookRoom2(){
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
	
		JLabel label1= new JLabel();
		label1.setBounds(70,30,450,40);
		label1.setText("Please Enter Payment Information");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		label1.setIconTextGap(20);
		label1.setForeground(new Color(207, 190, 107));
		panel.add(label1);
		

		JPanel line1= new JPanel();
		line1.setBounds(70, 65, 430, 2);
		line1.setBackground(new Color(207, 190, 107));
		line1.setLayout(null);		
		panel.add(line1);
		

		labels= new JLabel[10];
		texts= new JTextField[10];
		for ( int i=0; i<10 ; i++) {
			texts[i] = new JTextField();
			panel.add(texts[i]);
			labels[i] = new JLabel();
			labels[i].setHorizontalTextPosition(JLabel.CENTER);
			labels[i].setVerticalTextPosition(JLabel.TOP);
			labels[i].setFont(new Font("Century Gothic", Font.BOLD, 16));
			labels[i].setIconTextGap(20);
			labels[i].setForeground(new Color(207, 190, 107));
			panel.add(labels[i]);
		}
		
		labels[0].setBounds(5,120, 200,20);
		labels[0].setText("Payment Method: ");
		texts[0].setBounds(230,120, 300,20);
		
		labels[1].setBounds(5,160, 200,20);
		labels[1].setText("Card Number: ");
		texts[1].setBounds(230,160, 300,20);
		
		labels[2].setBounds(5,200, 200,20);
		labels[2].setText("Pin Code: ");
		texts[2].setBounds(230,200, 300,20);
		
		labels[3].setBounds(5,240, 270,20);
		labels[3].setText("Card Expiry Date: ");
		texts[3].setBounds(230,240, 300,20);
		
		labels[4].setBounds(5,280, 200,20);
		labels[4].setText("Room Number: ");
		texts[4].setBounds(230,280, 300,20);
		
		
		labels[5].setBounds(5,320, 200,20);
		labels[5].setText("Total Amount: ");
		texts[5].setBounds(230,320, 300,20);	
	//	if (!labels[4].getText().isEmpty()) {
		//texts[5].setText(String.valueOf(rand.nextInt(200)));}
	/*	labels[6].setBounds(5,360, 200,20);
		labels[6].setText("Employee Street: ");
		texts[6].setBounds(230,360, 300,20);
		
		labels[7].setBounds(5,400, 200,20);
		labels[7].setText("Employee Extension: ");
		texts[7].setBounds(230,400, 300,20);
		
		labels[8].setBounds(5,440, 200,20);
		labels[8].setText("Department Name: ");
		texts[8].setBounds(230,440, 300,20);

		labels[9].setBounds(5,480, 200,20);
		labels[9].setText("Employee Salary: ");
		texts[9].setBounds(230,480, 300,20);
*/
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
		
		
		button= new JButton();
		button.setBounds(270,530,270,30);
		button.setText("Confirm Payment");
		//button.setBorder(border);
		button.setFocusable(false);
		button.setHorizontalTextPosition(JLabel.CENTER);
		button.setVerticalTextPosition(JLabel.TOP);
		button.setFont(new Font("Century Gothic", Font.BOLD, 14));
		button.setBackground(new Color(207, 190, 107));
		button.setForeground(new Color(32, 35, 46));
		button.addActionListener(this);
		panel.add(button);
		
		
		this.add(panel);
		this.setVisible(true);
		//Connect();
	}
	
	
	
	
	public void Connect() {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/thefour" , "root","Elios2610*");
				System.out.println("Connection Successful");
				Statement st= con.createStatement();
				st.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//('Zad Kojok','zad.kojok@TheFour.com','02587836','26','Lebanon-Beirut','Airport Street','1478','Reception',9000)	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==texts[4]) {
			texts[5].setText(String.valueOf(rand.nextInt(600)));
		}
		
		if (e.getSource()==button) {
			Connect();
			String method= texts[0].getText();
			String cardNumber= texts[1].getText();
			int pin=Integer.parseInt( texts[2].getText());
			Date expiry= Date.valueOf(texts[3].getText());
			/*int age= Integer.parseInt(texts[4].getText());*/
			int RoomNumber=  Integer.parseInt(texts[4].getText());
			int totalAmount= Integer.parseInt(texts[5].getText());
		
			Statement st;
			String c;
			String p;
			try {
				st = con.createStatement();
				 c="insert into credit_card(card_number, pin_code, expiry_date) values "
				+  " ('" + cardNumber + "'," + pin + ",'" + expiry + "')";
				 
				 p="insert Payment (payment_method,Room_number, total_amount, card_number, payment_details)"
				 		+ " values"	+  " ('" + method + "','" + RoomNumber + "','" + totalAmount + "','" + cardNumber + "','Room Reservation')";
							 
							
				 st.execute(c);
				 st.execute(p);

				st.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		
		if (e.getSource()==back) {
		//new PremiumMenu();
		this.dispose();
	}

}
}