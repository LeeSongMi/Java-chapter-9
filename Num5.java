import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Num5 extends JFrame {
	public Num5() {
		super("�ǽ�����5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ư�� �� �迭 ����
		Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, Color.BLUE, 
				Color.MAGENTA, Color.GRAY, Color.PINK, 
				Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK,Color.ORANGE, Color.BLUE, Color.MAGENTA};
		Container c = getContentPane();
		//4x4�� ����
		c.setLayout(new GridLayout(4,4));
		//��ư �迭 ����
		JButton [] btn = new JButton [16];
		//��ư ����
		for(int i=0; i<btn.length; i++) {
			
			btn[i] = new JButton(Integer.toString(i));
			//��ư ���� ����
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
