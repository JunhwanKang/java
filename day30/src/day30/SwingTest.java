package day30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트는 callback 함수로 처리해야만 한다.
// 함수를 만들어서 프레임워크나 운영체제에게 실행을 위탁
// 콜백 함수의 이름은 프레임워크나 운영체제에서 지정해준다.
// 자바에서 메소드 이름을 정해줄 때는 인터페이스를 이용한다.

class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
	}
}

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		add(new JButton("클릭하세요"));
		JButton btn = new JButton("클릭");
		add(btn);
		btn.addActionListener(new MyActionListener());
		setVisible(true);
	}
}

public class SwingTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
