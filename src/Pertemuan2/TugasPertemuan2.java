/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class TugasPertemuan2 {
    
    public static void main(String[] args) {
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel name = new JLabel();
        name.setText(" Nama ");
        name.setBounds(50, 100, 100, 30);
        j.add(name);

        JLabel email = new JLabel();
        email.setText(" Email ");
        email.setBounds(50, 150, 100, 30);
        j.add(email);
        
        JLabel noHp = new JLabel();
        noHp.setText(" NoHP ");
        noHp.setBounds(50, 200, 100, 30);
        j.add(noHp);
        
        JLabel Menu = new JLabel();
        Menu.setText(" Menu Makanan ");
        Menu.setBounds(50, 250, 100, 30);
        j.add(Menu);
        
        String[] amenu = {"mie ayam", "bakso", "mie becek"};
        JComboBox cbMenu = new JComboBox(amenu);
        cbMenu
        
        JLabel JenisKelamin = new JLabel();
        JenisKelamin.setText(" Jenis Kelamin ");
        JenisKelamin.setBounds(50, 300, 100, 30);
        j.add(JenisKelamin);
        JRadioButton radio1 = new JRadioButton();
        
        JLabel Alamat = new JLabel();
        Alamat.setText(" Alamat ");
        Alamat.setBounds(50, 350, 100, 30);
        j.add(Alamat);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150, 100, 200, 30);
        j.add(nameTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 150, 200, 30);
        j.add(emailTxt);
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(150, 200, 200, 30);
        j.add(noHpTxt);
        
        
        
        JTextArea AlamatTxt = new JTextArea();
        AlamatTxt.setBounds(150, 350, 200, 60);
        j.add(AlamatTxt);

        JButton PesanButton = new JButton();
        PesanButton.setText("Pesan");
        PesanButton.setBounds(200, 450, 100, 30);
        j.add(PesanButton);
        

        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);

    }
}
