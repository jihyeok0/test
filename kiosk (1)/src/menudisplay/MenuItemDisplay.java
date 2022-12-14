package menudisplay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import bottomBillPane.BottomBillDisplay;
import common.BillObject;
import common.CommonMethod;
import common.MenuStructor;
import main.Main;
import common.MyColor;
import display.Modal;

public class MenuItemDisplay extends JPanel {
	protected Object display;
	protected Window parent;

	public MenuItemDisplay(MenuStructor getItem, BottomBillDisplay billPane) {
		
		setLayout(new BorderLayout());
		
		ImageIcon mainimg = new ImageIcon(getItem.getMenuImg());
		JPanel descripPanel = new JPanel();
		
		JLabel image = new JLabel(mainimg);
		JLabel title = new JLabel("SOUTH", SwingConstants.CENTER);
		JLabel price = new JLabel("CENTER", SwingConstants.CENTER);
		BillObject billObject = new BillObject();
		
		descripPanel.setBackground(MyColor.subColor);
		descripPanel.setPreferredSize(new Dimension(160, 60));
		descripPanel.setLayout(new GridLayout(2, 1));
		
		title.setText(getItem.getMenuTitle());
		price.setText(""+getItem.getMenuPrice());
		title.setFont(CommonMethod.myfont("중간"));
		price.setFont(CommonMethod.myfont("작게"));
		title.setForeground(Color.DARK_GRAY);
		price.setForeground(Color.DARK_GRAY);
		
		descripPanel.add(title);
		descripPanel.add(price);
		
		add(image, "Center");
		add(descripPanel, "South");
		this.addMouseListener(new MouseListener() {
			

			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				title.setFont(CommonMethod.myfont("중간"));
				price.setFont(CommonMethod.myfont("작게"));
				setBackground(MyColor.subColor);
				descripPanel.setBackground(MyColor.subColor);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				title.setFont(CommonMethod.myfont("중간크게"));
				price.setFont(CommonMethod.myfont("중간작게"));
				setBackground(MyColor.subColor2);
				descripPanel.setBackground(MyColor.subColor2);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//billObject.addBill(getItem);
				Modal m = new Modal(Main.frame,getItem,billPane);
				m.setVisible(true);
			}
		});
		
		setBackground(MyColor.subColor);
		setPreferredSize(new Dimension(173, 224));
		setVisible(true);
	}
}
