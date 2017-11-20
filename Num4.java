import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num4 extends JFrame {
	public Num4() {
		super("실습문제4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼의 색 배열 생성
		Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, 
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, 
				Color.LIGHT_GRAY };
		Container c = getContentPane();
		//1x10으로 설정
		c.setLayout(new GridLayout(1, 10));
		//버튼 배열 생성
		JButton [] btn = new JButton [10];
		//버튼 생성
		for(int i=0; i<btn.length; i++) {
			
			btn[i] = new JButton(Integer.toString(i));
			//버튼 색을 지정
			btn[i].setBackground(col[i]);
			c.add(btn[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num4();
	}

}
