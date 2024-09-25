import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class KalkulatorDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class KalkulatorDisplay {
    // Deklarasi komponen GUI
    private JFrame frame;
    private JTextField textFieldAngka1;
    private JTextField textFieldAngka2;
    private JComboBox<String> comboBoxOperator;
    private JLabel labelHasil;

    /**
     * Konstruktor untuk kelas KalkulatorDisplay.
     * Metode ini menginisialisasi komponen GUI, mendefinisikan layout, dan menambahkan event listener.
     */
    public KalkulatorDisplay() {
        // Membuat objek Operator yang akan digunakan untuk melakukan operasi aritmatika
        Operator operator = new Operator();
        
        // Inisialisasi JFrame (jendela aplikasi)
        frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(300, 200);  // Mengatur ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Mengatur aksi saat frame ditutup
        frame.setLayout(new GridLayout(5, 2));  // Mengatur layout grid dengan 5 baris dan 2 kolom

        // Input field untuk angka pertama
        textFieldAngka1 = new JTextField();
        
        // Input field untuk angka kedua
        textFieldAngka2 = new JTextField();

        // Dropdown untuk memilih operator (penjumlahan, pengurangan, perkalian, pembagian)
        String[] operasi = {"Penjumlahan", "Pengurangan", "Perkalian", "Pembagian"};
        comboBoxOperator = new JComboBox<>(operasi);

        // Label untuk menampilkan hasil perhitungan
        labelHasil = new JLabel("Hasil: ");

        // Tombol untuk menghitung
        JButton buttonHitung = new JButton("Hitung");

        /**
         * Event listener untuk tombol "Hitung".
         * Ketika tombol ditekan, program akan membaca input angka dan operator,
         * kemudian menghitung hasil operasi yang sesuai dan menampilkan hasilnya di label.
         */
        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Mengambil nilai dari input pengguna
                    double angka1 = Double.parseDouble(textFieldAngka1.getText());
                    double angka2 = Double.parseDouble(textFieldAngka2.getText());
                    String operasi = (String) comboBoxOperator.getSelectedItem();
                    double hasil = 0;

                    // Melakukan operasi sesuai dengan operator yang dipilih
                    switch (operasi) {
                        case "Penjumlahan":
                            hasil = operator.tambah(angka1, angka2);
                            break;
                        case "Pengurangan":
                            hasil = operator.kurang(angka1, angka2);
                            break;
                        case "Perkalian":
                            hasil = operator.kali(angka1, angka2);
                            break;
                        case "Pembagian":
                            hasil = operator.bagi(angka1, angka2);
                            break;
                    }
                    // Menampilkan hasil di labelHasil
                    labelHasil.setText("Hasil: " + hasil);
                } catch (NumberFormatException ex) {
                    // Menampilkan dialog pesan jika input tidak valid (misal: bukan angka)
                    JOptionPane.showMessageDialog(frame, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Menangani exception khusus aritmatika (misal: pembagian dengan nol)
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Menambahkan komponen ke dalam frame
        frame.add(new JLabel("Angka 1:"));
        frame.add(textFieldAngka1);
        frame.add(new JLabel("Operator:"));
        frame.add(comboBoxOperator);
        frame.add(new JLabel("Angka 2:"));
        frame.add(textFieldAngka2);
        frame.add(buttonHitung);
        frame.add(labelHasil);

        // Menampilkan frame
        frame.setVisible(true);
    }

    /**
     * Metode main untuk menjalankan aplikasi GUI KalkulatorDisplay.
     * Program akan membuat instance dari KalkulatorDisplay dan menampilkan jendela aplikasi.
     */
    public static void main(String[] args) {
        // Membuat dan menjalankan GUI Kalkulator
        new KalkulatorDisplay();
    }
}
