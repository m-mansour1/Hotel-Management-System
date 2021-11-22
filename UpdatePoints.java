import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdatePoints extends JFrame implements ActionListener{
	JLabel[] labels;
	JTextField field1;
	JTextField field2;
	JButton button;
	Connection con;
	JPanel panel;
	JButton back;
	
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();

	UpdatePoints(){
		
				this.setLayout(null);
				this.setTitle("The Four");
				this.setSize(600,500);
				this.setLocation(400,80);
				this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
				this.setResizable(false);
				this.setBackground(new Color(255, 255, 255));
				

				panel= new JPanel();
				panel.setBounds(0, 0, 600, 500);
				panel.setBackground(new Color(32, 35, 46));
				panel.setLayout(null);
			
				JLabel label1= new JLabel();
				label1.setBounds(120,30,450,40);
				label1.setText("Please Enter Guest Name");
				label1.setHorizontalTextPosition(JLabel.CENTER);
				label1.setVerticalTextPosition(JLabel.TOP);
				label1.setFont(new Font("Century Gothic", Font.BOLD, 25));
				label1.setIconTextGap(20);
				label1.setForeground(new Color(207, 190, 107));
				panel.add(label1);
				

				JPanel line1= new JPanel();
				line1.setBounds(90, 65, 410, 2);
				line1.setBackground(new Color(207, 190, 107));
				line1.setLayout(null);		
				panel.add(line1);
				
				JLabel label2= new JLabel() ;
				label2.setText("Guest Name: ");
				label2.setBounds(50,150,200,30);
				label2.setHorizontalTextPosition(JLabel.CENTER);
				label2.setVerticalTextPosition(JLabel.TOP);
				label2.setFont(new Font("Century Gothic", Font.BOLD, 16));
				label2.setIconTextGap(20);
				label2.setForeground(new Color(207, 190, 107));
				panel.add(label2);
					
				
				field1= new JTextField();
				field1.setBounds(210,150,300,30);
				panel.add(field1);
				
				
				JLabel label3= new JLabel() ;
				label3.setText("Reward Points : ");
				label3.setBounds(50,190,200,30);
				label3.setHorizontalTextPosition(JLabel.CENTER);
				label3.setVerticalTextPosition(JLabel.TOP);
				label3.setFont(new Font("Century Gothic", Font.BOLD, 16));
				label3.setIconTextGap(20);
				label3.setForeground(new Color(207, 190, 107));
				panel.add(label3);
					
				/*JLabel label4= new JLabel() ;
				label4.setText("eg: 1.25 ");
				label4.setBounds(50,210,200,30);
				label4.setHorizontalTextPosition(JLabel.CENTER);
				label4.setVerticalTextPosition(JLabel.TOP);
				label4.setFont(new Font("Century Gothic", Font.BOLD, 10));
				label4.setIconTextGap(20);
				label4.setForeground(new Color(207, 190, 107));
				panel.add(label4);
					*/ 
				field2= new JTextField();
				field2.setBounds(210,190,300,30);
				panel.add(field2);
				
				
				
				
				button= new JButton();
				button.setBounds(328,250,230,30);
				button.setText("Update Reward Points");
				button.setFocusable(false);
				button.setHorizontalTextPosition(JLabel.CENTER);
				button.setVerticalTextPosition(JLabel.TOP);
				button.setFont(new Font("Century Gothic", Font.BOLD, 14));
				button.setBackground(new Color(207, 190, 107));
				button.setForeground(new Color(32, 35, 46));
				button.addActionListener(this);
				panel.add(button);
				
			//	label3= new JLabel();
			
				label4.setBounds(90,310,600,30);
				label4.setHorizontalTextPosition(JLabel.CENTER);
				label4.setVerticalTextPosition(JLabel.TOP);
				label4.setFont(new Font("Century Gothic", Font.BOLD, 16));
				label4.setIconTextGap(20);
				label4.setForeground(new Color(207, 190, 107));
				//label3.setText("-------");
				panel.add(label4);
			
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
				
				
				
				
			//	label3= new JLabel();
				
				
				this.add(panel);
				this.setVisible(true);
				
				

				
				
				
				
//delete from employees where emp_name =
	}
	
	public void Connect() {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/thefour" , "root","Elios2610*");
				System.out.println("Connection Succesful");
			
				
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
			String name= field1.getText();
			label4.setText("Reward points for guest  "+name+ " has been updated");
            
			
		//	panel.add(label3);
			int points= Integer.parseInt(field2.getText());
			

			Connect();
		
			Statement st;
			String q;
			try {
				st = con.createStatement();
				 q="update guest set reward_points=reward_points + " + points +" where guest_name= '"+name+"'";
				 st.execute(q);
				 
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