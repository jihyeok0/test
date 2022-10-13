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
	public BillObject billObject = new BillObject(); //������ �ȿ� �� ��̸���Ʈ�� �ִ� ��ü
	IntroDisplay introDis = new IntroDisplay(this);
	
	Main() {
		setTitle("Custom Bibimbab");
		add(introDis);// �ڽ� ��ü���� �θ� �����ؾ߱� ������
		// ���� �Ҷ� �ڽĿ��� �θ� ��ü�� �ƱԸ�Ʈ�� �ش�
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(940, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	public void changeMainDisplay() {
		// ���� ȭ�鿡 ��ư ������ ȭ���� �ٲ�� �Լ�
		// �θ�ü���� �ٲ���� �ؼ� this�� �ʿ��ؼ� ���⼭ �Լ� �ۼ�
		introDis.th.interrupt();//�����̴� ������Ʈ ������ ����
		MainDisplay maindis = new MainDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(maindis);
		revalidate();
		repaint();
	}
	

	public void changeOrderDisplay() {
		// �ֹ� ȭ�鿡�� ��ư ������ ȭ���� �ٲ�� �Լ�
		// �θ�ü���� �ٲ���� �ؼ� this�� �ʿ��ؼ� ���⼭ �Լ� �ۼ�
		OrderDisplay orderdis = new OrderDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(orderdis);
		revalidate();
		repaint();
	}
	
	public void changeFinalDisplay() {
		// �ֹ� �Ϸ� ȭ�鿡�� ��ư ������ ȭ���� �ٲ�� �Լ�
		// �θ�ü���� �ٲ���� �ؼ� this�� �ʿ��ؼ� ���⼭ �Լ� �ۼ�
		FinalDisplay finaldis = new FinalDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(finaldis);
		revalidate();
		repaint();
	}
	
	public void changeSeatDisplay() {
		// �ڸ� ���� ȭ������ ȭ���� �ٲ�� �Լ�
		// �θ�ü���� �ٲ���� �ؼ� this�� �ʿ��ؼ� ���⼭ �Լ� �ۼ�
		SeatDisplay seat = new SeatDisplay(this);
		getContentPane().removeAll();
		getContentPane().add(seat);
		revalidate();
		repaint();
	}
}