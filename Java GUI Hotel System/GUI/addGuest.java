import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addGuest extends JFrame implements ActionListener {
JLabel[] labels;
JTextField[] texts;
JButton button;
Connection con;
JButton back;
	addGuest(){
		this.setLayout(null);
		this.setTitle("The Four");
		this.setSize(600,670);
		this.setLocation(400,50);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		this.setResizable(false);
		this.setBackground(new Color(255, 255, 255));
		

		JPanel panel= new JPanel();
		panel.setBounds(0, 0, 600, 670);
		panel.setBackground(new Color(32, 35, 46));
		panel.setLayout(null);
	
		JLabel label1= new JLabel();
		label1.setBounds(100,30,450,40);
		label1.setText("Please Enter Guest Information");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		label1.setIconTextGap(20);
		label1.setForeground(new Color(207, 190, 107));
		panel.add(label1);
		//('Lara Idriss','01589746','25','lara.idriss@gmail.com','Lebanon','0'),

		JPanel line1= new JPanel();
		line1.setBounds(70, 65, 450, 2);
		line1.setBackground(new Color(207, 190, 107));
		line1.setLayout(null);		
		panel.add(line1);
		

		labels= new JLabel[11];
		texts= new JTextField[11];
		for ( int i=0; i<11 ; i++) {
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
		labels[0].setText("Guest Name: ");
		texts[0].setBounds(230,120, 300,20);
		
		labels[1].setBounds(5,160, 200,20);
		labels[1].setText("Guest Phone Number: ");
		texts[1].setBounds(230,160, 300,20);
		
		labels[2].setBounds(5,200, 200,20);
		labels[2].setText("Guest Age: ");
		texts[2].setBounds(230,200, 300,20);
		
		labels[3].setBounds(5,240, 270,20);
		labels[3].setText("Guest Email: ");
		texts[3].setBounds(230,240, 300,20);
		
		labels[4].setBounds(5,280, 200,20);
		labels[4].setText("Guest Country: ");
		texts[4].setBounds(230,280, 300,20);
		
		
		labels[5].setBounds(5,320, 200,20);
		labels[5].setText("Reward Points: ");
		texts[5].setBounds(230,320, 300,20);	
		//(1, '2:00:00', '12:00:00', 1, 1),
		labels[6].setBounds(5,360, 200,20);
		labels[6].setText("Branch ID: ");
		texts[6].setBounds(230,360, 300,20);
		
		labels[7].setBounds(5,400, 200,20);
		labels[7].setText("Check In Time: ");
		texts[7].setBounds(230,400, 300,20);
		
		labels[8].setBounds(5,440, 200,20);
		labels[8].setText("Check Out Time: ");
		texts[8].setBounds(230,440, 300,20);

		labels[9].setBounds(5,480, 200,20);
		labels[9].setText("Payment ID: ");
		texts[9].setBounds(230,480, 300,20);

		labels[10].setBounds(5,520, 200,20);
		labels[10].setText("Employee ID: ");
		texts[10].setBounds(230,520, 300,20);

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
		button.setBounds(270,560,270,30);
		button.setText("Enter Employee to Database");
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
		if (e.getSource()==button) {
			Connect();
			String name= texts[0].getText();
			Long phone_nb= Long.parseLong(texts[1].getText());
			int age= Integer.parseInt(texts[2].getText());
			String email= texts[3].getText();
			String country= texts[4].getText();
			int reward= Integer.parseInt(texts[5].getText());
			int branch_id=Integer.parseInt( texts[6].getText());
			int payment_id = Integer.parseInt(texts[9].getText());
			int employee_id = Integer.parseInt(texts[10].getText());
			Statement st;
			String r;
			String g;
			try {
				st = con.createStatement();
				 g="insert into guest(guest_name, guest_phoneNb, guest_age, guest_email,"
				 		+ " guest_country, reward_points) values ('" + name +"','" + phone_nb +"','" +age+"','"+email+"','"+
						 country +"','" + reward +"')";
				 // + "','" + branch_id + "','12:00:00' , '2:00:00','"+)";
				 r="insert Reservation_details(branch_id, check_in, check_out, payment_id, emp_id) values "
				 		+ "('" + branch_id + "','02:00:00' , '12:00:00','"+ payment_id + "','" + employee_id +"')";
				 st.execute(g);
				 st.execute(r);
				st.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		
		if (e.getSource()==back) {
		new FrontMenu();
		this.dispose();
	}

}
}