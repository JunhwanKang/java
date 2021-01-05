package day26;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("my program");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		add(new JButton("클릭"));
		setVisible(true);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		new MyFrame();	
	}
}
