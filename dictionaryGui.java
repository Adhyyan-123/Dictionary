import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
public class dictionaryGui
{
	public JFrame f=new JFrame();
	public JTextField addWord=new JTextField("Enter the Word");
	public JTextField addMeaning=new JTextField("Enter the Meaning");
	public JTextField MeaningWord=new JTextField("Enter Word To Get Meaning");
	public JLabel D=new JLabel(new ImageIcon(new ImageIcon("grey.jpg").getImage().getScaledInstance(1,1,Image.SCALE_DEFAULT)));
	public JButton b1=new JButton("ADD");
	public JButton b2=new JButton("GET MEANING");
	dictionaryGui()
	{		
	}
	dictionaryGui(String s)
	{	
		f.setTitle(s);
		addWord.setBounds(575,200,150,40);f.add(addWord);
		b1.setBounds(775,300,75,30);f.add(b1);
		addMeaning.setBounds(575,300,150,40);f.add(addMeaning);
		MeaningWord.setBounds(575,450,150,40);f.add(MeaningWord);
		b2.setBounds(775,450,75,30);f.add(b2);
		D.setBounds(0,0,1,1);f.add(D);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);  
		f.setVisible(true);  
        	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
	}
	public String s1;
	public String s2;
	boolean t1=false;
	public boolean Add()
	{
		if(!(addWord.getText().equals("") || addWord.getText().equals("Enter the Word")))
		{
			if(!(addMeaning.getText().equals("") || addMeaning.getText().equals("Enter the Meaning")))
			{	
				b1.setEnabled(true);
				b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent evt) 
						{
							t1=true;
							s1=addWord.getText();
							s2=addMeaning.getText();
					}});
			}
		}
		return t1;
	}
	public String s3;
	boolean t2=false;
	public boolean setWord()
	{
		if(!(MeaningWord.getText().equals("") || MeaningWord.getText().equals("Enter Word To Get Meaning")))
		{	
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent evt){
						t2=true;
						s3=MeaningWord.getText();
						}});
		}
		return t2;
	}
	public void Meanings()
	{
	}
	void popUp(String message)
	{
		JOptionPane.showMessageDialog(f,message);
	}
}
