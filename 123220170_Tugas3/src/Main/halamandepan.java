package Main;

import View.Mahasiswa.ViewData;
import View.Dosen.ViewDataDosen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class halamandepan extends JFrame {
    
    JLabel teks1 = new JLabel("WELCOMEEEEEEE KING");
    JLabel teks2 = new JLabel("Nama  : Malik Afif Bhirawa");
    JLabel teks3 = new JLabel("NIM    : 123220170");
    JLabel teks4 = new JLabel("Kelas  : IF-F");
    JLabel teks5 = new JLabel("Matkul  : Praktikum Pemrograman Java");
       
    JButton viewmahasiswa = new JButton("View Data Mahasiswa");
    JButton viewdosen = new JButton("View Data Dosen");
    
    
    public halamandepan(){
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(teks1);
        teks1.setBounds(20, 20, 250, 24);
        teks1.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(teks2);
        teks2.setBounds(20, 80, 300, 25);
        teks2.setFont(new Font("Arial", Font.PLAIN, 18));
        add(teks3);
        teks3.setBounds(20, 110, 300, 25);
        teks3.setFont(new Font("Arial", Font.PLAIN, 18));
        add(teks4);
        teks4.setBounds(20,140, 300, 25);
        teks4.setFont(new Font("Arial", Font.PLAIN, 18));
        add(teks5);
        teks5.setBounds(20,170, 350, 25);
        teks5.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(viewmahasiswa);
        viewmahasiswa.setBounds(130, 200, 200, 32);
        
        add(viewdosen);
        viewdosen.setBounds(130, 250, 200, 32);
        
        
        viewmahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewData();
            }
        });
        
        viewdosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
                
            }
        });
    }
}