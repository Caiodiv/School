import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AnoBis extends JFrame implements ActionListener
{
JLabel L1;
JButton B1,B2,B3;
JTextField T1,T2;

AnoBis()
{
    setTitle("Verifica ano Bisssexto");
    setSize(420,150);
    setLocation(500,300);
    L1 = new JLabel ("Digite Ano: ");
    B1 = new JButton ("Verifica Ano"); B1.addActionListener(this);
    B2 = new JButton ("Limpar"); B2.addActionListener(this);
    B3 = new JButton ("Sair"); B3.addActionListener(this);
    T1 = new JTextField(25);
    T2 = new JTextField(25);
    T2.setEditable(false);
    getContentPane().setBackground(Color.yellow);
    getContentPane().setLayout(new GridLayout (2,3));
    getContentPane().add(L1); getContentPane().add(T1); getContentPane().add(T2);
    getContentPane().add(B1); getContentPane().add(B2); getContentPane().add(B3);

}

 public static void main(String args[])
       {
           JFrame JAnoBis = new AnoBis();
           JAnoBis.setVisible(true);
}

       public void actionPerformed(ActionEvent e)
       {

        int Ano = 0;
        Ano = Integer.parseInt(T1.getText());

        if(e.getSource()==B3) {
           System.exit(0);
		}
        if(e.getSource()==B1)
        {

        if((Ano % 4==0) && (Ano % 100 !=0) || (Ano%400==0))
            T2.setText(Ano + " É Bissexto");
            else
            T2.setText(Ano + " Não é Bissexto");
    }
        if(e.getSource()==B2)
        {
            T1.setText("");
            T2.setText("");
        }

} }
