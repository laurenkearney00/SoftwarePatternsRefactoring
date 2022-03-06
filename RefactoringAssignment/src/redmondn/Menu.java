package redmondn;

import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.text.MaskFormatter;
import java.util.ArrayList; 

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Menu extends JFrame{
	
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private int position = 0;
	private String password;
	Customer customer = null;
	CustomerAccount acc = new CustomerAccount();
	JFrame f, f1;
	 JLabel firstNameLabel, surnameLabel, pPPSLabel, dOBLabel;
	 JTextField firstNameTextField, surnameTextField, pPSTextField, dOBTextField;
		JLabel customerIDLabel, passwordLabel;
		JTextField customerIDTextField, passwordTextField;
	Container content;
		Customer e;


	 JPanel panel2;
		JButton add;
		String 	PPS,firstName,surname,DOB,CustomerID;
	
	public static void main(String[] args)
	{
		Menu driver = new Menu();
		driver.menuStart();
	}
	
	
	public void menuStart() {
		
		MenuStart start = new MenuStart();
	}
	
	

	
	public void admin()
	{
		Admin admin = new Admin();
	}
		
	
	
	public void customer(Customer e1)
	{	
		CustomerMenu customerMenu = new CustomerMenu();
	}
	
	public static boolean isNumeric(String str)  // a method that tests if a string is numeric
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
}

