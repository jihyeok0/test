package menudisplay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import bottomBillPane.BottomBillDisplay;
import common.CommonMethod;
import common.MenuObject;
import common.MenuStructor;
import common.MyColor;
import common.SetLanguage;
import component.MyBorderButton;
import main.Main;

public class MainMenuDisplay extends JPanel {
	
	final static MenuObject munuObject = new MenuObject();
	//한번만 메모리에 할당하기 위해서 객체를 만들고 필드들 호출
	final static String[] korMenu = munuObject.korMenu;
	final static String[] engMenu = munuObject.engMenu;
	
	MenuDisplay[] menuDis = new MenuDisplay[korMenu.length];
	
	int selectedMenu = 0;
	Main root;
	
	public MainMenuDisplay(Main root, RightMenuDisplay rigfht_dis){
		this.root = root; //root가 되는 판넬
		setBackground(MyColor.mainColor);
		setLayout(null);
		setSize(720, 800);
		
		UIManager.put("TabbedPane.selected", MyColor.subColor);//탭바 선택이 되었을때
		//하단에 계산을 도와 줄 판넬
		BottomBillDisplay billPane = new BottomBillDisplay(root, rigfht_dis);
		JTabbedPane tabPane = new JTabbedPane(); //탭바를 가지고 있는 메뉴를 보여 줄 판낼
												 //billDisplay 수정할때 같은 객체를 수정 해야해서 파라미터로 던져 준다
		tabPane.setSize(720, 550);
		tabPane.setFont(CommonMethod.myfont("작게"));
		tabPane.setBackground(MyColor.mainColor);
		
		//판낼에 탭바를 붙이는 반복문
		for(int i = 0; i < korMenu.length; i++) { 
			menuDis[i] = new MenuDisplay(bibimbabSubMenu(i), billPane);
			tabPane.addTab(null, menuDis[i]);
			 JLabel tabText = new JLabel();
			 tabText.setText(new SetLanguage().getLang() ? engMenu[i] : korMenu[i]);
			 tabText.setFont(new SetLanguage().getLang() ? CommonMethod.myfont("중간작게") : CommonMethod.myfont("중간"));
			 tabText.setPreferredSize(new Dimension(90, 30));
			 tabPane.setTabComponentAt(i, tabText); 
		}
		add(tabPane);
		add(billPane);
	}
	
	public MenuStructor[] bibimbabSubMenu(int i) {
		//메뉴에 맞는 배열을 호출하는 함수
		boolean flag = new SetLanguage().getLang();
		switch(i) {
		case 0 : return flag ? munuObject.riceMenuEng : munuObject.riceMenuKor;
		case 1 : return flag ? munuObject.toppingMenuEng : munuObject.toppingMenuKor;
		case 2 : return flag ? munuObject.sauceMenuEng : munuObject.sauceMenuKor;
		case 3 : return flag ? munuObject.sideMenuEng : munuObject.sideMenuKor;
		case 4 : return flag ? munuObject.beverageMenuEng : munuObject.beverageMenuKor;
		default : return flag ? munuObject.riceMenuEng : munuObject.riceMenuKor;
		}
	}
	
}