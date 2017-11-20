import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num6 extends JFrame {
	public Num6() {
		setTitle("실습문제 6번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//배치관리자 삭제
		c.setLayout(null);
		
		JLabel la = new JLabel();
		la.setLocation(50,50);
		la.setSize(300,300);
		Random r = new Random();
		
		for (int i = 0; i < 20; i++) {
			JButton b = new JButton(Integer.toString(i));
			//랜덤으로 x, y좌표를 받아준다
			int x = r.nextInt(150) + 50;
			int y = r.nextInt(150) + 50;
			b.setLocation(x,y);
			//버튼의 사이즈는 10x10
			b.setSize(10,10);
			//배경색 파랑
			b.setBackground(Color.BLUE);
			c.add(b);
			
		}
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Num6();
	}
}
