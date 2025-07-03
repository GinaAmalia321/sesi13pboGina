import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class KuisPenjumlahan extends JFrame implements ActionListener {

    JTextField angka1, angka2, jawaban;
    JButton check;
    JLabel hasil;
    int bil1, bil2;

    public KuisPenjumlahan() {
        setTitle("Game Kuis Penjumlahan");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Angka acak
        Random rand = new Random();
        bil1 = rand.nextInt(10); // 0-9
        bil2 = rand.nextInt(10); // 0-9

        angka1 = new JTextField(5);
        angka2 = new JTextField(5);
        jawaban = new JTextField(5);
        check = new JButton("CHECK");
        hasil = new JLabel("");

        angka1.setText(String.valueOf(bil1));
        angka2.setText(String.valueOf(bil2));
        angka1.setEditable(false);
        angka2.setEditable(false);

        add(angka1);
        add(new JLabel("+"));
        add(angka2);
        add(new JLabel("="));
        add(jawaban);
        add(check);
        add(hasil);

        check.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int userJawab = Integer.parseInt(jawaban.getText());
            if (userJawab == bil1 + bil2) {
                hasil.setText("Selamat Jawaban Anda Benar !!!");
                hasil.setForeground(Color.GREEN);
                getContentPane().setBackground(new Color(200, 255, 200));
            } else {
                hasil.setText("Maaf, Jawaban Anda Salah");
                hasil.setForeground(Color.RED);
                getContentPane().setBackground(new Color(255, 200, 200));
            }
        } catch (Exception ex) {
            hasil.setText("Masukkan angka yang valid");
            hasil.setForeground(Color.ORANGE);
        }
    }

    public static void main(String[] args) {
        new KuisPenjumlahan();
    }
}
