import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num3 extends JFrame {
	public Num3() {
		super("실습문제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//1,10으로 서정
		c.setLayout(new GridLayout(1, 10));
		//버튼 배열 생성
		JButton [] btn = new JButton [10];
		//버튼 생성
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			c.add(btn[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num3();
	}

}
