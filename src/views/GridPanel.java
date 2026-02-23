package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GridPanel extends JPanel{
	 Font myFont, greetingFont;
	 
	 public GridPanel() {
		 setLayout(new GridLayout(3, 1, 10, 10));
		 
		 Border emptyBorder = BorderFactory.createEmptyBorder(30, 40, 30, 40);
	     setBorder(emptyBorder);
	     
	     myFont = new Font("Georgia", Font.PLAIN, 14);
	     greetingFont = new Font("Georgia", Font.ITALIC, 23);

	     initializeComponents();
	 }
	 
	 private void initializeComponents() {
		 createLogo();
		 createFormulary();
		 createButtons();
	 }
	 
	 private void createLogo() {
		 JLabel lblLogo = new JLabel(loadIcon("/img/icon.jpg", 100, 100));
	     lblLogo.setHorizontalAlignment(JLabel.CENTER);
	     add(lblLogo);
	 }
	 
	 private void createFormulary() {
		 JPanel formPanel = new JPanel(new GridLayout(3, 1, 10, 10));
		 
		 JPanel greetings = new JPanel(new GridLayout(2, 1));
		 JPanel greetingsRow = new JPanel(new GridLayout(1, 2, 10, 0));
		 JLabel lblGreeting = new JLabel("Welcome!", JLabel.CENTER);
	     lblGreeting.setFont(greetingFont);
	     greetingsRow.add(lblGreeting);
	     greetings.add(greetingsRow);
	     
	     JPanel emailGroup = new JPanel(new GridLayout(2, 1));
	     JPanel emailRow = new JPanel(new GridLayout(1, 2, 10, 0));
	     JLabel lblEmail = new JLabel("Email:");
	     lblEmail.setFont(myFont);
	     JTextField txtEmail = new JTextField(15);
	     emailRow.add(lblEmail);
	     emailRow.add(txtEmail);
	     JLabel lblEmailError = new JLabel("The email is required.");
	     lblEmailError.setFont(myFont);
	     lblEmailError.setForeground(Color.RED);
	     lblEmailError.setHorizontalAlignment(JLabel.RIGHT);
	     emailGroup.add(emailRow);
	     emailGroup.add(lblEmailError);
	     
	     JPanel passwordGroup = new JPanel(new GridLayout(2, 1));
	     JPanel passwordRow = new JPanel(new GridLayout(1, 2, 10, 0));
	     JLabel lblPassword = new JLabel("Password:");
	     lblPassword.setFont(myFont);
	     JPasswordField password = new JPasswordField(15);
	     passwordRow.add(lblPassword);
	     passwordRow.add(password);
	     
	     JLabel lblPasswordError = new JLabel("The password is incorrect.");
	     lblPasswordError.setFont(myFont);//niggas
	     lblPasswordError.setForeground(Color.RED);
	     lblPasswordError.setHorizontalAlignment(JLabel.RIGHT);
	     passwordGroup.add(passwordRow);
	     passwordGroup.add(lblPasswordError);
	     
	     formPanel.add(greetings);
	     formPanel.add(emailGroup);
	     formPanel.add(passwordGroup);

	     add(formPanel);
	 }
	 
	 private void createButtons() {
		 JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	     JButton button = new JButton("Log in!");
	     button.setFont(myFont);
	     button.setBackground(Color.GREEN);

	     buttonPanel.add(button);
	     add(buttonPanel);
	 }
	 
	 private ImageIcon loadIcon(String route, int w, int h) {
		 try {
			 Image icon = ImageIO.read(getClass().getResource(route));
	         icon = icon.getScaledInstance(w, h, Image.SCALE_SMOOTH);
	         return new ImageIcon(icon);
		 } catch(Exception ex) {
			 System.out.println("Icon image not found.");
		 }
		 return null;
	 }
}
