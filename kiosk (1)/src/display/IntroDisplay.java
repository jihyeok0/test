package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CommonMethod;
import common.MyColor;
import common.SetLanguage;
import component.MyBorderButton;
import main.Main;
import payDialog.CardDialog.ThreadTest;

public class IntroDisplay extends JPanel {
	Main root;
	JLabel macot = null;
	public ThreadTest th = new ThreadTest();
	
	public IntroDisplay(Main root){
		setBackground(MyColor.mainColor);
		
		setLayout(new GridLayout(3, 1)); //화면이 3등분으로 나뉘어 그리드 레이아웃
		this.root = root; //화면 변경을 위해 부모객체 받아옴
		JPanel header = new JPanel();
		header.setBackground(MyColor.mainColor);
		header.setLayout(null);
		ImageIcon macotimg = CommonMethod.changeImgSize("images/mascot.png", 160, 128); //이미지 크기 바꿔주기 위한 함수
		macot = new JLabel(macotimg);
		JLabel headerText = new JLabel("밀키트 자판기");
		headerText.setFont(CommonMethod.myfont("제목"));
		headerText.setBounds(300, 40, 400, 200);
		headerText.setForeground(MyColor.subColor);
		header.add(macot);
		header.add(headerText);

		th.start();//마스코트가 움직이는 쓰레드
		
		ImageIcon bibibbab = CommonMethod.changeImgSize("images/bibibab.jpg", 500, 300); //이미지 크기 바꿔주기 위한 함수
		JLabel body = new JLabel(bibibbab);
		body.setSize(500, 500);
		
		JPanel footer = new JPanel();
		footer.setBackground(MyColor.mainColor);
		footer.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 80)); //버튼을 둘 판넬 레이아웃 지정
		
		add(header);
		add(body);
		add(footer);
		MyBorderButton koreanBtn = new MyBorderButton("한 국 어", "크게");
		MyBorderButton englishBtn = new MyBorderButton("English", "크게");
		koreanBtn.setMargin(new Insets(0, 0, 100, 100));
		
		koreanBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SetLanguage().setKorean();
				root.changeMainDisplay();
				}
			});
		
		englishBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SetLanguage().setEnglish();
				root.changeMainDisplay();
				}
			});
		
		footer.add(koreanBtn);
		footer.add(englishBtn);
		}
	public class ThreadTest extends Thread{
	    public void run(){
	        // 인터럽트 �瑛뻑� 예외처리
	        try{
	        	while(true) {
		            for(int i = 110 ; i > 20; --i){//마스코트가 뛰는 쓰레드
		                Thread.sleep(8);
		                macot.setBounds(110, i, 160, 128);//절대값 위치 
		            }
		            Thread.sleep(20);
		            for(int i = 20 ; i < 110; i++){//마스코트가 앉는 쓰레드
		                Thread.sleep(8);
		                macot.setBounds(110, i, 160, 128);//절대값 위치 
		            }
	        	}
	        }catch(InterruptedException e){
	            System.out.println(e);
	        }
	    }
	}
}
