package main;

import javax.swing.*;

import common.BillObject;
import display.FinalDisplay;
import display.IntroDisplay;
import display.MainDisplay;
import display.OrderDisplay;
import display.SeatDisplay;
import display.Modal;
import menudisplay.MainMenuDisplay;

import java.awt.*;

public class Main extends JFrame {

	public static Window frame;
	public BillObject billObject = new BillObject(); //영수증 안에 들어갈 어레이리스트가 있는 객체
	IntroDisplay introDis = new IntroDisplay(this);
	
	Main() {
		setTitle("Custom Bibimbab");
		add(introDis);// 자식 객체에서 부모를 변경해야기 때문에
		// 성을 할때 자식에게 부모 객체를 아규먼트로 준다
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(940, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	public void changeMainDisplay() {
		// 시작 화면에 버튼 누르고 화면이 바뀌는 함수
		// 부모객체에서 바꿔줘야 해서 this가 필요해서 여기서 함수 작성
		introDis.th.interrupt();//움직이는 마스코트 쓰레드 종료
		MainDisplay maindis = new MainDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(maindis);
		revalidate();
		repaint();
	}
	

	public void changeOrderDisplay() {
		// 주문 화면에서 버튼 누르면 화면이 바뀌는 함수
		// 부모객체에서 바꿔줘야 해서 this가 필요해서 여기서 함수 작성
		OrderDisplay orderdis = new OrderDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(orderdis);
		revalidate();
		repaint();
	}
	
	public void changeFinalDisplay() {
		// 주문 완료 화면에서 버튼 누르면 화면이 바뀌는 함수
		// 부모객체에서 바꿔줘야 해서 this가 필요해서 여기서 함수 작성
		FinalDisplay finaldis = new FinalDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(finaldis);
		revalidate();
		repaint();
	}
	
	public void changeSeatDisplay() {
		// 자리 지정 화면으로 화면이 바뀌는 함수
		// 부모객체에서 바꿔줘야 해서 this가 필요해서 여기서 함수 작성
		SeatDisplay seat = new SeatDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(seat);
		revalidate();
		repaint();
	}
}
