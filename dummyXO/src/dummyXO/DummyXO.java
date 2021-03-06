package dummyXO;


import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DummyXO extends JFrame {

	private static final long serialVersionUID = -8145463734195863317L;

	private JButton[] buttons = new JButton[9];

	public int counter = 0;

	public DummyXO() {
		GridLayout layout = new GridLayout();
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i], GridLayout.class);
			buttons[i].addActionListener(new Action());
		}

		setVisible(true);
		setTitle("Dummy X-O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		DummyXO DummyXO = new DummyXO();
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					if(counter%2==0)
						buttons[i].setText("X");
					else
						buttons[i].setText("O");
					break;
				}
			}
			counter++;
		}

	}

}
