import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num4 extends JFrame {
	public Num4() {
		super("�ǽ�����4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ư�� �� �迭 ����
		Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, 
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, 
				Color.LIGHT_GRAY };
		Container c = getContentPane();
		//1x10���� ����
		c.setLayout(new GridLayout(1, 10));
		//��ư �迭 ����
		JButton [] btn = new JButton [10];
		//��ư ����
		for(int i=0; i<btn.length; i++) {
			
			btn[i] = new JButton(Integer.toString(i));
			//��ư ���� ����
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
