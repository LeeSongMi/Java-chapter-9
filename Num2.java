import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num2 extends JFrame {
	public Num2() {
		setTitle("실습문제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//수평, 수직 간격 5,7로 설정
		c.setLayout( new BorderLayout(5,7));
		//버튼을 추가
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		//사이즈 설정
		setSize(350,200);
		setVisible(true);
		
	}
	

	

	public static void main(String[] args) {
		new Num2();

	}

}
