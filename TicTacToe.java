import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {

    JButton[][] tombol = new JButton[3][3];
    boolean giliranX = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        // Buat tombol 3x3
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                tombol[baris][kolom] = new JButton("");
                tombol[baris][kolom].setFont(new Font("Arial", Font.BOLD, 40));
                tombol[baris][kolom].setFocusPainted(false);
                tombol[baris][kolom].addActionListener(this);
                add(tombol[baris][kolom]);
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("")) {
            if (giliranX) {
                btn.setText("X");
            } else {
                btn.setText("O");
            }
            giliranX = !giliranX;
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}

