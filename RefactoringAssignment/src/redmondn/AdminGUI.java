package redmondn;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminGUI extends Menu {
	public void adminGui() {
	
	f = new JFrame("Administrator Menu");
	f.setSize(400, 400);
	f.setLocation(200, 200);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) { System.exit(0); }
	});          
	f.setVisible(true);
	
	JPanel deleteCustomerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton deleteCustomer = new JButton("Delete Customer");	
	deleteCustomer.setPreferredSize(new Dimension(250, 20));
	deleteCustomerPanel.add(deleteCustomer);
	
	JPanel deleteAccountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton deleteAccount = new JButton("Delete Account");
	deleteAccount.setPreferredSize(new Dimension(250, 20));	
	deleteAccountPanel.add(deleteAccount);
	
	JPanel bankChargesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton bankChargesButton = new JButton("Apply Bank Charges");
	bankChargesButton.setPreferredSize(new Dimension(250, 20));	
	bankChargesPanel.add(bankChargesButton);
	
	JPanel interestPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton interestButton = new JButton("Apply Interest");
	interestPanel.add(interestButton);
	interestButton.setPreferredSize(new Dimension(250, 20));
	
	JPanel editCustomerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton editCustomerButton = new JButton("Edit existing Customer");
	editCustomerPanel.add(editCustomerButton);
	editCustomerButton.setPreferredSize(new Dimension(250, 20));
	
	JPanel navigatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton navigateButton = new JButton("Navigate Customer Collection");
	navigatePanel.add(navigateButton);
	navigateButton.setPreferredSize(new Dimension(250, 20));
	
	JPanel summaryPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton summaryButton = new JButton("Display Summary Of All Accounts");
	summaryPanel.add(summaryButton);
	summaryButton.setPreferredSize(new Dimension(250, 20));
	
	JPanel accountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JButton accountButton = new JButton("Add an Account to a Customer");
	accountPanel.add(accountButton);
	accountButton.setPreferredSize(new Dimension(250, 20));
	
	JPanel returnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	JButton returnButton = new JButton("Exit Admin Menu");
	returnPanel.add(returnButton);

}
}
