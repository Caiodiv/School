import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


	class MFAnual extends JFrame implements ActionListener {
		JLabel L1,L2,L3,L4,L5,L6,L7,L8;
		JButton B1,B2,B3;
		JTextField TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9;

		public static void main(String args[]) {
			JFrame Janela = new MFAnual();
			Janela.setVisible(true);
		}

		MFAnual()
		{
			getContentPane().setBackground(new Color(0,100,0));
			setTitle("Media Final Anual");
			setSize(400,180);
			setLocation(500,200);

			getContentPane().setLayout(new GridLayout (5,4));


			// Campos
			TF1 = new JTextField(10);
			TF2 = new JTextField(10);
			TF3 = new JTextField(10);
			TF4 = new JTextField(10);
			TF5 = new JTextField(10);
			TF6 = new JTextField(10);
			TF7 = new JTextField(10);
			TF8 = new JTextField(10);
			TF9 = new JTextField(10);

			TF8.setEditable(false);
			TF9.setEditable(false);


			// Textos
			L1 = new JLabel("Turma: ",JLabel.CENTER);
			L2 = new JLabel("N:",JLabel.CENTER);
			L3 = new JLabel("NT1: ",JLabel.CENTER);
			L4 = new JLabel("NT3: ",JLabel.CENTER);
			L5 = new JLabel("Disciplina: ",JLabel.CENTER);
			L6 = new JLabel("Nome: ",JLabel.CENTER);
			L7 = new JLabel("NT2: ",JLabel.CENTER);
			L8 = new JLabel("MF: ",JLabel.CENTER);

			L1.setForeground(new Color(250,250,250));
			L2.setForeground(new Color(250,250,250));
			L3.setForeground(new Color(250,250,250));
			L4.setForeground(new Color(250,250,250));

			L5.setForeground(new Color(250,250,250));
			L6.setForeground(new Color(250,250,250));
			L7.setForeground(new Color(250,250,250));
			L8.setForeground(new Color(250,250,250));



			// Botão
			B1 = new JButton("Calcular");
			B2 = new JButton("Limpar");
			B3 = new JButton("Sair");

			B1.addActionListener(this);
			B2.addActionListener(this);
			B3.addActionListener(this);

			// Mostrar Tela

			 getContentPane().add(L1);
			 getContentPane().add(TF1);
			 getContentPane().add(L5);
			 getContentPane().add(TF5);
			 getContentPane().add(L2);
			 getContentPane().add(TF2);
			 getContentPane().add(L6);
			 getContentPane().add(TF6);
			 getContentPane().add(L3);
			 getContentPane().add(TF3);
			 getContentPane().add(L7);
			 getContentPane().add(TF7);
			 getContentPane().add(L4);
			 getContentPane().add(TF4);
			 getContentPane().add(L8);
			 getContentPane().add(TF8);
			 getContentPane().add(TF9);
			 getContentPane().add(B1);
			 getContentPane().add(B2);
			 getContentPane().add(B3);



		}


		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == B3) {
				System.exit(0);
			}

			if(e.getSource() == B1) {
				float N1 = Float.parseFloat(TF3.getText());
				float N2 = Float.parseFloat(TF4.getText());
				float N3 = Float.parseFloat(TF7.getText());

				float MF = (3*N1+3*N2+4*N3)/10;

				if(MF > 6.0) {
					TF9.setText("Promovido!");
					TF8.setText("" + MF);
				} else {
					TF9.setText("Repetido!");
					TF9.setForeground(Color.red);
					TF8.setText("" + MF);
				}
			}

			if(e.getSource() == B2) {
				TF1.setText("");
				TF2.setText("");
				TF3.setText("");
				TF4.setText("");
				TF5.setText("");
				TF6.setText("");
				TF7.setText("");
				TF8.setText("");
				TF9.setText("");
			}
		}

}