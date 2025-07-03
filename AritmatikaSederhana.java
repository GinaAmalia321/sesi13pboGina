import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AritmatikaSederhana extends JFrame implements ActionListener {

    JTextField angka1, angka2;
    JLabel hasil;
    JButton tambah, kurang, kali, bagi, mod;

    public AritmatikaSederhana() {
        setTitle("Aritmatika Sederhana");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        angka1 = new JTextField(10);
        angka2 = new JTextField(10);
        hasil = new JLabel("= Hasil");

        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        mod = new JButton("Modulus");

        add(angka1);
        add(angka2);
        add(hasil);
        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);
        add(mod);

        // Tambahkan event listener
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
        mod.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(angka1.getText());
            int b = Integer.parseInt(angka2.getText());
            int result = 0;

            if (e.getSource() == tambah) {
                result = a + b;
            } else if (e.getSource() == kurang) {
                result = a - b;
            } else if (e.getSource() == kali) {
                result = a * b;
            } else if (e.getSource() == bagi) {
                result = a / b;
            } else if (e.getSource() == mod) {
                result = a % b;
            }

            hasil.setText("= " + result);
        } catch (Exception ex) {
            hasil.setText("= Error");
        }
    }

    public static void main(String[] args) {
        new AritmatikaSederhana();
    }
}
