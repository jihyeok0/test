package display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bottomBillPane.BottomBillDisplay;
import common.CommonMethod;
import common.MenuStructor;

@SuppressWarnings("serial")
public class Modal extends JDialog {
	String[] food={"�Ұ�⹫��", "�ع����κ��", "���������", "��ġ�", "������", "�δ��", 
			"���캺����", "�Ұ��", "��������","����Ұ��","��¡���","��������",
			"��Į����","������ �����Ľ�Ÿ","Ʈ����ũ���Ľ�Ÿ","�����ҹ�","������ �����Ľ�Ÿ","������ �ع�«��",
			"�׸� ������","ũ���� ������","�߰����� ������","�Ľ�Ÿ ������","ġ�� ������","�Ұ�� ������"};
    ImageIcon[] images = { new ImageIcon("images/img1/�Ұ�⹫��.png"),new ImageIcon("images/img1/���κ��.png"),new ImageIcon("images/img1/���� �����.png")
    		,new ImageIcon("images/img1/��ġ�.png"),new ImageIcon("images/img1/������.png"),new ImageIcon("images/img1/�δ��.png")
    		,new ImageIcon("images/img4/���캺����.png"),new ImageIcon("images/img4/�Ұ��.png"),new ImageIcon("images/img4/��������.png")
    		,new ImageIcon("images/img4/����Ұ��.png"),new ImageIcon("images/img4/��¡���.png"),new ImageIcon("images/img4/��������.png")
    		,new ImageIcon("images/img3/��Į����.png"),new ImageIcon("images/img3/������ ���۷� �Ľ�Ÿ.png"),new ImageIcon("images/img3/Ʈ���� ũ�� �Ľ�Ÿ.png")
    		,new ImageIcon("images/img3/�����ҹ�.png"),new ImageIcon("images/img3/������ ���� �Ľ�Ÿ.png"),new ImageIcon("images/img3/������ �ع�«��.png")
    		,new ImageIcon("images/img2/�׸�������.png"),new ImageIcon("images/img2/ũ���� ������.png"),new ImageIcon("images/img2/�׸�������.png")
    		,new ImageIcon("images/img2/�Ľ�Ÿ������.png"),new ImageIcon("images/img2/ġ�������.png"),new ImageIcon("images/img2/�Ұ�� ������.png")};
    int index;
    MenuStructor getItem2;
	public Modal(Window parent,MenuStructor getItem,BottomBillDisplay billPane) {
		super(parent, "MenuItemDisplay", ModalityType.APPLICATION_MODAL);
		setSize(720, 550);
		JPanel frame = new JPanel();
	      frame.setBackground(Color.ORANGE);
	      frame.setSize(720, 550);
	      frame.setLayout(null);

	     
	      JPanel panel_0_1 = new JPanel(); //�װ� ������ ��� �г�
	      panel_0_1.setBackground(Color.ORANGE);
	      panel_0_1.setBounds(352, 0, 352, 441);
	      frame.add(panel_0_1);
	      panel_0_1.setLayout(null);
	      panel_0_1.setVisible(false);
	    
	      JPanel panel_0_1_1 = new JPanel(); //������ �� ������ �г�
	       panel_0_1_1.setBackground(Color.ORANGE);
	       panel_0_1_1.setBounds(352, 0, 352, 441);
		   frame.add(panel_0_1_1);
		   panel_0_1_1.setLayout(null);
		   panel_0_1_1.setVisible(false);
		  
	
		      ImageIcon mainimg3 = new ImageIcon();
		      JLabel image3 = new JLabel(mainimg3);
		      image3.setIcon(images[index]);
		      image3.setBounds(0, 0, 704, 441);
		      panel_0_1.add(image3);
		      add(frame);
		      image3.setVisible(false);
		      
	      JComboBox strCombo= new JComboBox(food);
	      panel_0_1.add(strCombo);
	       strCombo.setBounds(10, 0, 160, 30);
	       strCombo.setForeground(Color.BLACK);
	       strCombo.setBackground(Color.WHITE);
	       strCombo.setFont(CommonMethod.myfont("�߰�"));
	       strCombo.addActionListener(new ActionListener() {
	    	   @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		   image3.setVisible(true);
	    		 strCombo.setVisible(false);
	    		 JComboBox jcb =(JComboBox)e.getSource();
	    		index = jcb.getSelectedIndex();
	    		image3.setIcon(images[index]);
	    		   
	    	   }});

		     
	       JPanel panel_5 = new JPanel(); //�ϴ� ��ư �г�
		      panel_5.setBackground(Color.ORANGE);
		      panel_5.setBounds(0, 441, 704, 70);
		      frame.add(panel_5);
		      panel_5.setLayout(null);

		      JButton btnNewButton_5 = new JButton("���ϱ�");
		      btnNewButton_5.setForeground(Color.WHITE);
		      btnNewButton_5.setFont(new Font("���� ���", Font.BOLD, 25));
		      btnNewButton_5.setBackground(Color.ORANGE);
		      btnNewButton_5.setBounds(490, 0, 165, 60);
		      frame.add(btnNewButton_5);
		      panel_5.add(btnNewButton_5);
		      btnNewButton_5.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
		        	  image3.setVisible(false);
			    	strCombo.setVisible(true);
		        	  panel_0_1.setVisible(true);
		          }
		       });

	      JPanel panel_3 = new JPanel(); //�ϴ� ��ư �г�
	      panel_3.setBackground(Color.ORANGE);
	      panel_3.setBounds(0, 441, 704, 70);
	      frame.add(panel_3);
	      panel_3.setLayout(null);
	      
	      JButton btnNewButton_1 = new JButton("���");
	      btnNewButton_1.setForeground(Color.WHITE);
	      btnNewButton_1.setFont(new Font("���� ���", Font.BOLD, 25));
	      btnNewButton_1.setBackground(Color.ORANGE);
	      btnNewButton_1.setBounds(30, 0, 165, 60);
	      panel_3.add(btnNewButton_1);
	      panel_5.add(btnNewButton_1);
	      btnNewButton_1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  billPane.changeDisplay(getItem);
	        	  setVisible(false);  
	          }
	       });
	      JButton btnNewButton_2 = new JButton("���");
	      btnNewButton_2.setForeground(Color.WHITE);
	      btnNewButton_2.setFont(new Font("���� ���", Font.BOLD, 25));
	      btnNewButton_2.setBackground(Color.ORANGE);
	      btnNewButton_2.setBounds(270, 0, 165, 60);
	      panel_3.add(btnNewButton_2);
	      panel_5.add(btnNewButton_2);
	      btnNewButton_2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             setVisible(false);
	          }
	       });
	      
	      JButton btnNewButton_3 = new JButton("���ϱ�");
	      btnNewButton_3.setForeground(Color.WHITE);
	      btnNewButton_3.setFont(new Font("���� ���", Font.BOLD, 25));
	      btnNewButton_3.setBackground(Color.ORANGE);
	      btnNewButton_3.setBounds(490, 0, 165, 60);
	      panel_3.add(btnNewButton_3);
	      panel_3.add(btnNewButton_3);
	      btnNewButton_3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  panel_0_1.setVisible(true);
	        	  panel_3.setVisible(false);
	        	  panel_5.setVisible(true);
	          }
	       });
	      
	      JPanel panel_0_2 = new JPanel(); //�װ� ������ ��� �г�
	      panel_0_2.setBackground(Color.ORANGE);
	      panel_0_2.setBounds(0, 441, 704, 70);
	      frame.add(panel_0_2);
	      panel_0_2.setLayout(null);
	      setVisible(false);
	      
	      
	      
	      JPanel panel_4 = new JPanel(); //��� �̹��� �г�
	      panel_4.setBackground(Color.ORANGE);
	      panel_4.setBounds(0, 0, 704, 441);
	      frame.add(panel_4);
	      panel_4.setLayout(null);
	      
	      ImageIcon mainimg2 = new ImageIcon(getItem.getMenuImg2());
	      JLabel image2 = new JLabel(mainimg2);
	      image2.setIcon(new ImageIcon(getItem.getMenuImg2()));
	      image2.setBounds(0, 0, 704, 441);
	      panel_4.add(image2);
	      add(frame);
	    	 
	   }}
	      
