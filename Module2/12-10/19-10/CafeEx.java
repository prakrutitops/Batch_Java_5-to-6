package com.a1910;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CafeEx implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	public CafeEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		chk1 =new JCheckBox("Pizza @ rs.100");
		chk1.setBounds(66, 7, 150, 23);
		
		chk2 = new JCheckBox("Burger @rs. 50");
		chk2.setBounds(66, 37, 150, 23);
		
		chk3 =new JCheckBox("Coffee @ rs.70");
		chk3.setBounds(66, 67, 150, 23);
		
		btnorder = new JButton("ORDER");
		btnorder.setBounds(66, 97, 89, 23);
		
		
		btnorder.addActionListener(this);
		
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new CafeEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btnorder)
		{
			int amount=0;
			StringBuffer buffer =new StringBuffer("\n Selected Items");
			
			
			if(chk1.isSelected())
			{
				buffer.append("\n Pizza @ rs.100");
				amount+=100;
			}
			if(chk2.isSelected())
			{
				buffer.append("\n Burger @ rs.50");
				amount+=50;
			}
			if(chk3.isSelected())
			{
				buffer.append("\n Coffee @ rs.70");
				amount+=70;
			}
			
			JOptionPane.showMessageDialog(frame, "\n "+buffer.toString()+" \n Total :"+amount);
		}
	}
}
