import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


 class ExConcatenar extends JFrame implements ActionListener {
		JLabel L1,L2,L3;
		JTextField T1,T2,T3;
		JButton B1,B2,B3;


	public static void main(String args[]) {
		JFrame Janela = new ExConcatenar();
		Janela.setVisible(true);
	}

		ExConcatenar() {
			setTitle("Concatenação de Strings");
			setSize(500,180);

			getContentPane().setBackground(new Color(112,219,147));


			L1 = new JLabel("Digite seu primeiro nome:");
			L1.setForeground(Color.RED);

			L2 = new JLabel("Digite seu sobrenome:");
			L2.setForeground(Color.BLUE);

			L3 = new JLabel("Seu nome completo:");
			L3.setForeground(Color.BLACK);

			T1 = new JTextField(25);
			T2 = new JTextField(25);
			T3 = new JTextField(25);

			B1 = new JButton("Concatenar");
			B1.addActionListener(this);

			B2 = new JButton("Limpar");
			B2.addActionListener(this);

			B3 = new JButton("Sair");
			B3.addActionListener(this);

			getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(L1);
			getContentPane().add(T1);
			getContentPane().add(L2);
			getContentPane().add(T2);
			getContentPane().add(L3);
			getContentPane().add(T3);

			getContentPane().add(B1);
			getContentPane().add(B2);
			getContentPane().add(B3);

		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == B3) {
				System.exit(0);
			}
			if(e.getSource() == B2) {
				T1.setText("");
				T2.setText("");
				T3.setText("");
			}
			if(e.getSource() == B1) {
				T3.setText(T1.getText() + " " + T2.getText());
			}
		}


	}