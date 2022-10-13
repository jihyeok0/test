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
	//�ѹ��� �޸𸮿� �Ҵ��ϱ� ���ؼ� ��ü�� ����� �ʵ�� ȣ��
	final static String[] korMenu = munuObject.korMenu;
	final static String[] engMenu = munuObject.engMenu;
	
	MenuDisplay[] menuDis = new MenuDisplay[korMenu.length];
	
	int selectedMenu = 0;
	Main root;
	
	public MainMenuDisplay(Main root, RightMenuDisplay rigfht_dis){
		this.root = root; //root�� �Ǵ� �ǳ�
		setBackground(MyColor.mainColor);
		setLayout(null);
		setSize(720, 800);
		
		UIManager.put("TabbedPane.selected", MyColor.subColor);//�ǹ� ������ �Ǿ�����
		//�ϴܿ� ����� ���� �� �ǳ�
		BottomBillDisplay billPane = new BottomBillDisplay(root, rigfht_dis);
		JTabbedPane tabPane = new JTabbedPane(); //�ǹٸ� ������ �ִ� �޴��� ���� �� �ǳ�
												 //billDisplay �����Ҷ� ���� ��ü�� ���� �ؾ��ؼ� �Ķ���ͷ� ���� �ش�
		tabPane.setSize(720, 550);
		tabPane.setFont(CommonMethod.myfont("�۰�"));
		tabPane.setBackground(MyColor.mainColor);
		
		//�ǳ��� �ǹٸ� ���̴� �ݺ���
		for(int i = 0; i < korMenu.length; i++) { 
			menuDis[i] = new MenuDisplay(bibimbabSubMenu(i), billPane);
			tabPane.addTab(null, menuDis[i]);
			 JLabel tabText = new JLabel();
			 tabText.setText(new SetLanguage().getLang() ? engMenu[i] : korMenu[i]);
			 tabText.setFont(new SetLanguage().getLang() ? CommonMethod.myfont("�߰��۰�") : CommonMethod.myfont("�߰�"));
			 tabText.setPreferredSize(new Dimension(90, 30));
			 tabPane.setTabComponentAt(i, tabText); 
		}
		add(tabPane);
		add(billPane);
	}
	
	public MenuStructor[] bibimbabSubMenu(int i) {
		//�޴��� �´� �迭�� ȣ���ϴ� �Լ�
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