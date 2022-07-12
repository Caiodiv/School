
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class tabuada extends JFrame implements ActionListener{

	JTextField T1;
	JLabel L1;
	JButton B1,B2,B3;
	JTextArea TA1;


	tabuada() {
		setTitle("Tabuada");
	    setSize(320,320);
	    setLocation(50,50);

	    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

	    L1 = new JLabel("Digite um Numero Inteiro: ");

	    T1 = new JTextField(10);

	    B1 = new JButton("Tabuada");
	    B1.addActionListener(this);

	    B2 = new JButton("Limpar");
	    B2.addActionListener(this);

	    B3 = new JButton("Sair");
	    B3.addActionListener(this);

	    TA1 = new JTextArea(12,15);
	    JScrollPane painel1 = new JScrollPane(TA1);

	    getContentPane().setBackground(Color.yellow);

	    getContentPane().add(L1);
	    getContentPane().add(T1);
	    getContentPane().add(B1);
	    getContentPane().add(B2);
	    getContentPane().add(B3);
	    getContentPane().add(painel1);
	}

	public static void main(String[] args) {
		JFrame JTabuada = new tabuada();
		JTabuada.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == B3) {
			System.exit(0);
		}

		if(e.getSource() == B2) {
			TA1.setText("");
			T1.setText("");
		}



		if(e.getSource() == B1) {

			int I , N;

			N = Integer.parseInt(T1.getText());

			       for (I = 0; I <= 10; I++){

			      TA1.append(N + " x " + I +" = " + N*I +"\n");

			}

		}
	}
}

