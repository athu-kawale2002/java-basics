import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
	<applet code="apppletchekboxgrp.class" width="500" height="500">
	</applet>
*/
public class apppletchekboxgrp extends Applet implements ActionListener{
	private Label l1, l2, l3;
	private TextField t1;
	private Checkbox c1, c2, c3, c4;
	private CheckboxGroup g1, g2;
	private Button b;
	public void init(){
		l1 = new Label("Enter Name");
		add(l1);
		
		t1 = new TextField(20);
		add(t1);
		
		l2 = new Label("Select Gender");
		add(l2);
		
		g1 = new CheckboxGroup();
		
		c1 = new Checkbox("Male", false, g1);
		add(c1);
		
		c2 = new Checkbox("Female", true, g1);
		add(c2);
		
		g2 = new CheckboxGroup();
		
		c3 = new Checkbox("Indian", true, g2);
		add(c3);
		
		c4 = new Checkbox("Others", false, g2);
		add(c4);
		
		b = new Button("Submit");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String name = t1.getText();
		String gender = null, nat = null;
		Checkbox c = g1.getSelectedCheckbox();
		if(c == c1)
		gender = "Male";
		else
		if(c == c2)
		gender = "Female";
		
		c = g2.getSelectedCheckbox();
		if(c == c3)
		nat = "Indian";
		else
		if(c == c4)
		nat = "Others";
		
		JOptionPane.showMessageDialog(this, "Name ="+name+"\nGender = "+gender+"\nNationality"+nat);
	}
}