import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.*; 
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Sd02 extends JFrame{
    
	public Sd02(){
		Image icon = Toolkit.getDefaultToolkit().getImage("world-wide-web.png");
		setIconImage(icon);
		
		
		setSize(500,500);
		setLocation(600,200);
		setTitle("Computer Studies");
		
		Color myColor3 = new Color(180,132,132);
		
		Container con = getContentPane();
		con.setLayout(null);
		con.setBackground(myColor3);
		
		JLabel lblTitle = new JLabel("Registration Form");
		lblTitle.setBounds(180,5,150,20);
		
		JLabel lblName = new JLabel("User Name");
		lblName.setBounds(50,40,120,25);
		JTextField txtName = new JTextField();
		txtName.setBounds(200,40,150,25);
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
		txtName.setBorder(border);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(50,80,120,25);
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(200,80,150,25);
		txtPhone.setBorder(border);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50,120,120,25);
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(200,120,150,25);
		txtEmail.setBorder(border);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50,160,120,25);
		JPasswordField password = new JPasswordField();
		password.setBounds(200,160,150,25);
		password.setBorder(border);
		
		JLabel lblConPassword = new JLabel("Confirm Password");
		lblConPassword.setBounds(50,200,120,25);
		JPasswordField conpassword = new JPasswordField();
		conpassword.setBounds(200,200,150,25);
		conpassword.setBorder(border);
		
		JLabel lblChooseLanguage = new JLabel("Select Languages");
		lblChooseLanguage.setBounds(50,240,120,25);
		
		JCheckBox checkC = new JCheckBox("C++");
		checkC.setBounds(200,240,120,25);
		checkC.setBackground(myColor3);
		
		JCheckBox checkJava = new JCheckBox("Java");
		checkJava.setBounds(200,270,120,25);
		checkJava.setBackground(myColor3);
		
		JCheckBox checkPython = new JCheckBox("Python");
		checkPython.setBounds(200,300,120,25);
		checkPython.setBackground(myColor3);
		
		JCheckBox checkJscript = new JCheckBox("JavaScript");
		checkJscript.setBounds(200,330,120,25);
		checkJscript.setBackground(myColor3);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(180,400,100,25);
		
		
		
		
		
		setVisible(true);
		con.add(lblName);
		con.add(txtName);
		con.add(lblPhone);
		con.add(txtPhone);
		con.add(lblEmail);
		con.add(txtEmail);
		con.add(lblPassword);
		con.add(password);
		con.add(lblConPassword);
		con.add(conpassword);
		con.add(lblTitle);
		con.add(lblChooseLanguage);
		con.add(checkC);
		con.add(checkJava);
		con.add(checkPython);
		con.add(checkJscript);
		con.add(btnRegister);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String arg[]){
		Sd02 sd02 = new Sd02();
	}


}