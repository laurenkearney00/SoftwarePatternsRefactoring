package redmondn;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CustomerOptions {
	Menu menu = new Menu();
	
		
	public void statement() {
	
	menu.f.dispose();
	menu.f = new JFrame("Customer Menu");
	menu.f.setSize(400, 600);
	menu.f.setLocation(200, 200);
	menu.f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) { System.exit(0); }
	});          
	menu.f.setVisible(true);
	
	JLabel label1 = new JLabel("Summary of account transactions: ");
	
	JPanel returnPanel = new JPanel();
	JButton returnButton = new JButton("Return");
	returnPanel.add(returnButton);
	
	JPanel textPanel = new JPanel();
	
	textPanel.setLayout( new BorderLayout() );
	JTextArea textArea = new JTextArea(40, 20);
	textArea.setEditable(false);
	textPanel.add(label1, BorderLayout.NORTH);
	textPanel.add(textArea, BorderLayout.CENTER);
	textPanel.add(returnButton, BorderLayout.SOUTH);
	
	JScrollPane scrollPane = new JScrollPane(textArea);
	textPanel.add(scrollPane);
	
	for (int i = 0; i < menu.acc.getTransactionList().size(); i ++)
	{
		textArea.append(menu.acc.getTransactionList().get(i).toString());
		
	}
	
	textPanel.add(textArea);
	menu.content.removeAll();
	
	
	Container content = menu.f.getContentPane();
	content.setLayout(new GridLayout(1, 1));
	content.add(textPanel);
	
	returnButton.addActionListener(new ActionListener(  ) {
		public void actionPerformed(ActionEvent ae) {
			menu.f.dispose();			
		}		
     });	
	}
	
	public void lodgement() {
		boolean loop = true;
		boolean on = true;
		double balance = 0;

		if(menu.acc instanceof CustomerCurrentAccount)
		{
			int count = 3;
			int checkPin = ((CustomerCurrentAccount) menu.acc).getAtm().getPin();
			loop = true;
			
			while(loop)
			{
				if(count == 0)
				{
					JOptionPane.showMessageDialog(menu.f, "Pin entered incorrectly 3 times. ATM card locked."  ,"Pin",  JOptionPane.INFORMATION_MESSAGE);
					((CustomerCurrentAccount) menu.acc).getAtm().setValid(false);
					 menu.customer(menu.customer); 
					loop = false;
					on = false;
				}
				
				String Pin = JOptionPane.showInputDialog(menu.f, "Enter 4 digit PIN;");
				int i = Integer.parseInt(Pin);
				
			   if(on)
			   {
				if(checkPin == i)
				{
					loop = false;
					JOptionPane.showMessageDialog(menu.f, "Pin entry successful" ,  "Pin", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else
				{
					count --;
					JOptionPane.showMessageDialog(menu.f, "Incorrect pin. " + count + " attempts remaining."  ,"Pin",  JOptionPane.INFORMATION_MESSAGE);					
				}
			
			}
			}
	
			
		}		if(on == true)
				{
			String balanceTest = JOptionPane.showInputDialog(menu.f, "Enter amount you wish to lodge:");//the isNumeric method tests to see if the string entered was numeric. 
			if(isNumeric(balanceTest))
			{
				
				balance = Double.parseDouble(balanceTest);
				loop = false;
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(menu.f, "You must enter a numerical value!" ,"Oops!",  JOptionPane.INFORMATION_MESSAGE);
			}
			
		
		String euro = "\u20ac";
		 menu.acc.setBalance(menu.acc.getBalance() + balance);
		// String date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		 Date date = new Date();
		 String date2 = date.toString();
		 String type = "Lodgement";
			double amount = balance;
			
			
			
			
			AccountTransaction transaction = new AccountTransaction(date2, type, amount);
			menu.acc.getTransactionList().add(transaction);
			
		 JOptionPane.showMessageDialog(menu.f, balance + euro + " added do you account!" ,"Lodgement",  JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(menu.f, "New balance = " + menu.acc.getBalance() + euro ,"Lodgement",  JOptionPane.INFORMATION_MESSAGE);
		}

		}

	private boolean isNumeric(String balanceTest) {
		// TODO Auto-generated method stub
		return false;
	}	

	
}	

