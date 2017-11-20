import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num5 extends JFrame {
	public Num5() {
		super("실습문제5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼의 색 배열 생성
		Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, Color.BLUE, 
				Color.MAGENTA, Color.GRAY, Color.PINK, 
				Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK,Color.ORANGE, Color.BLUE, Color.MAGENTA};
		Container c = getContentPane();
		//4x4로 서정
		c.setLayout(new GridLayout(4,4));
		//버튼 배열 생성
		JButton [] btn = new JButton [16];
		//버튼 생성
		for(int i=0; i<btn.length; i++) {
			
			btn[i] = new JButton(Integer.toString(i));
			//버튼 색을 지정
			btn[i].setBackground(col[i]);
			c.add(btn[i]);
		}
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num5();
	}

}
