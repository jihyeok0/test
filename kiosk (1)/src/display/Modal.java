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
	String[] food={"소고기무국", "해물순두부찌개", "차돌된장찌개", "김치찌개", "육개장", "부대찌개", 
			"새우볶음밥", "불고기", "제육볶음","오삼불고기","오징어볶음","낙지볶음",
			"닭칼국수","바지락 봉골레파스타","트러플크림파스타","마제소바","쉬림프 로제파스타","딱새우 해물짬뽕",
			"그린 샐러드","크래미 샐러드","닭가슴살 샐러드","파스타 샐러드","치즈 샐러드","불고기 샐러드"};
    ImageIcon[] images = { new ImageIcon("images/img1/소고기무국.png"),new ImageIcon("images/img1/순두부찌개.png"),new ImageIcon("images/img1/차돌 된장찌개.png")
    		,new ImageIcon("images/img1/김치찌개.png"),new ImageIcon("images/img1/육개장.png"),new ImageIcon("images/img1/부대찌개.png")
    		,new ImageIcon("images/img4/새우볶음밥.png"),new ImageIcon("images/img4/불고기.png"),new ImageIcon("images/img4/제육볶음.png")
    		,new ImageIcon("images/img4/오삼불고기.png"),new ImageIcon("images/img4/오징어볶음.png"),new ImageIcon("images/img4/낙지볶음.png")
    		,new ImageIcon("images/img3/닭칼국수.png"),new ImageIcon("images/img3/바지락 봉글레 파스타.png"),new ImageIcon("images/img3/트러플 크림 파스타.png")
    		,new ImageIcon("images/img3/마제소바.png"),new ImageIcon("images/img3/쉬림프 로재 파스타.png"),new ImageIcon("images/img3/딱새우 해물짬뽕.png")
    		,new ImageIcon("images/img2/그린샐러드.png"),new ImageIcon("images/img2/크래미 샐러드.png"),new ImageIcon("images/img2/그린샐러드.png")
    		,new ImageIcon("images/img2/파스타샐러드.png"),new ImageIcon("images/img2/치즈샐러드.png"),new ImageIcon("images/img2/불고기 샐러드.png")};
    int index;
    MenuStructor getItem2;
	public Modal(Window parent,MenuStructor getItem,BottomBillDisplay billPane) {
		super(parent, "MenuItemDisplay", ModalityType.APPLICATION_MODAL);
		setSize(720, 550);
		JPanel frame = new JPanel();
	      frame.setBackground(Color.ORANGE);
	      frame.setSize(720, 550);
	      frame.setLayout(null);

	     
	      JPanel panel_0_1 = new JPanel(); //그걸 가리는 상단 패널
	      panel_0_1.setBackground(Color.ORANGE);
	      panel_0_1.setBounds(352, 0, 352, 441);
	      frame.add(panel_0_1);
	      panel_0_1.setLayout(null);
	      panel_0_1.setVisible(false);
	    
	      JPanel panel_0_1_1 = new JPanel(); //가린걸 또 가리는 패널
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
	       strCombo.setFont(CommonMethod.myfont("중간"));
	       strCombo.addActionListener(new ActionListener() {
	    	   @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		   image3.setVisible(true);
	    		 strCombo.setVisible(false);
	    		 JComboBox jcb =(JComboBox)e.getSource();
	    		index = jcb.getSelectedIndex();
	    		image3.setIcon(images[index]);
	    		   
	    	   }});

		     
	       JPanel panel_5 = new JPanel(); //하단 버튼 패널
		      panel_5.setBackground(Color.ORANGE);
		      panel_5.setBounds(0, 441, 704, 70);
		      frame.add(panel_5);
		      panel_5.setLayout(null);

		      JButton btnNewButton_5 = new JButton("비교하기");
		      btnNewButton_5.setForeground(Color.WHITE);
		      btnNewButton_5.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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

	      JPanel panel_3 = new JPanel(); //하단 버튼 패널
	      panel_3.setBackground(Color.ORANGE);
	      panel_3.setBounds(0, 441, 704, 70);
	      frame.add(panel_3);
	      panel_3.setLayout(null);
	      
	      JButton btnNewButton_1 = new JButton("담기");
	      btnNewButton_1.setForeground(Color.WHITE);
	      btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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
	      JButton btnNewButton_2 = new JButton("취소");
	      btnNewButton_2.setForeground(Color.WHITE);
	      btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
	      btnNewButton_2.setBackground(Color.ORANGE);
	      btnNewButton_2.setBounds(270, 0, 165, 60);
	      panel_3.add(btnNewButton_2);
	      panel_5.add(btnNewButton_2);
	      btnNewButton_2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             setVisible(false);
	          }
	       });
	      
	      JButton btnNewButton_3 = new JButton("비교하기");
	      btnNewButton_3.setForeground(Color.WHITE);
	      btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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
	      
	      JPanel panel_0_2 = new JPanel(); //그걸 가리는 상단 패널
	      panel_0_2.setBackground(Color.ORANGE);
	      panel_0_2.setBounds(0, 441, 704, 70);
	      frame.add(panel_0_2);
	      panel_0_2.setLayout(null);
	      setVisible(false);
	      
	      
	      
	      JPanel panel_4 = new JPanel(); //상단 이미지 패널
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
	      
