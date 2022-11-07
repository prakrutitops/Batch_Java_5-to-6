import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test implements ActionListener
{
	JFrame frame;
	JButton insertbtn,viewbtn,updatebtn,deletebtn;
	
	public Test()
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		insertbtn = new JButton("INSERT");
		viewbtn = new JButton("VIEW");
		updatebtn = new JButton("UPDATE");
		deletebtn = new JButton("DELETE");

		
		insertbtn.addActionListener(this);
		
		
		frame.add(insertbtn);
		frame.add(viewbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		AllOperations a =new AllOperations();
		
		if(e.getSource()==insertbtn)
		{
			a.insertdata();
		}
	}
}
class AllOperations
{
	JFrame insertframe,updateframe,deleteframe;
	
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
}
