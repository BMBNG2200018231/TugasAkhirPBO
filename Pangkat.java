import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pangkat {
    JFrame frame;
    JLabel lAngka, lPangkat, lHasil;
    JTextField TxtAngka, TxtPangkat, TxtHasil;
    JPanel panel1, panel2;
    JButton BtHitung, BtReset;

    public Pangkat() {
        frame = new JFrame();
        frame.setTitle("Program Hitung Pangkat By Bambang Dimas Saputra");
        frame.setSize(400, 250);
        frame.getContentPane().setLayout(new GridLayout(2, 1));

        lAngka = new JLabel("Masukkan Angka : ");
        lPangkat = new JLabel("Masukkan Pangkat : ");
        lHasil = new JLabel("Hasil : ");

        TxtAngka = new JTextField("");
        TxtPangkat = new JTextField("");
        TxtHasil = new JTextField("");
        TxtHasil.setEditable(false);

        BtHitung = new JButton("Hitung");
        BtReset = new JButton("Reset");

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(lAngka);
        panel1.add(TxtAngka);
        panel1.add(lPangkat);
        panel1.add(TxtPangkat);
        panel1.add(lHasil);
        panel1.add(TxtHasil);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(BtHitung);
        panel2.add(BtReset);

        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);

        BtHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitungPangkat();
            }
        });

        BtReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });

        frame.setVisible(true);
    }

    private void hitungPangkat() {
        try {
            double angka = Double.parseDouble(TxtAngka.getText());
            int pangkat = Integer.parseInt(TxtPangkat.getText());

            double hasil = Math.pow(angka, pangkat);
            TxtHasil.setText(Double.toString(hasil));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!");
        }
    }

    private void resetFields() {
        TxtAngka.setText("");
        TxtPangkat.setText("");
        TxtHasil.setText("");
    }

    public static void main(String[] args) {
        Pangkat text = new Pangkat();
    }
}
