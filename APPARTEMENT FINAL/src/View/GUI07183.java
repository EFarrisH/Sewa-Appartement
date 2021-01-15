package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI07183 {
    JFrame TampilanAwal = new JFrame();
    JLabel login,daftar,top;
    JRadioButton radioadmin,radiocostumer;
    JTextField textemaillogin,textnama,textnotelp,texttglbooking,textemaildaftar,textkamar;
    JLabel labelemaillogin,labelnama,labelpasswordlogin,labelnotelp,labeltglbooking,labelemaildaftar,labelpassworddaftar,kelaslabel;
    JButton check,reg;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    public GUI07183(){
        TampilanAwal.setSize(700, 630);
        TampilanAwal.setLayout(null);
        TampilanAwal.getContentPane().setBackground(Color.RED);
        top = new JLabel("Persewaan Appartement");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        TampilanAwal.add(top);
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        TampilanAwal.add(login);
        radioadmin = new JRadioButton("admin");
        radioadmin.setBounds(30, 150, 100, 30);
        radioadmin.setBackground(Color.WHITE);
        TampilanAwal.add(radioadmin);
        radiocostumer = new JRadioButton("member");
        radiocostumer.setBounds(140, 150, 100, 30);
        radiocostumer.setBackground(Color.WHITE);
        TampilanAwal.add(radiocostumer);
        labelemaillogin = new JLabel("Email");
        labelemaillogin.setBounds(30, 180, 30, 30);
        TampilanAwal.add(labelemaillogin);
        textemaillogin = new JTextField();
        textemaillogin.setBounds(30, 210, 200, 30);
        TampilanAwal.add(textemaillogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        TampilanAwal.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        TampilanAwal.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GREEN);
        TampilanAwal.add(check);
        daftar = new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        TampilanAwal.add(daftar);
        labelemaildaftar = new JLabel("Email");
        labelemaildaftar.setBounds(400, 150, 30, 30);
        TampilanAwal.add(labelemaildaftar);
        textemaildaftar = new JTextField();
        textemaildaftar.setBounds(400, 180, 200, 30);
        TampilanAwal.add(textemaildaftar);
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        TampilanAwal.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        TampilanAwal.add(textnama);
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        TampilanAwal.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        TampilanAwal.add(passworddaftar);
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 330, 100, 30);
        TampilanAwal.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 360, 200, 30);
        TampilanAwal.add(textnotelp);
        labeltglbooking = new JLabel("Tanggal Booking (dd/mm/yyyy)");
        labeltglbooking.setBounds(400, 390, 200, 30);
        TampilanAwal.add(labeltglbooking);
        texttglbooking = new JTextField();
        texttglbooking.setBounds(400, 420, 200, 30);
        TampilanAwal.add(texttglbooking);
        kelaslabel = new JLabel("Appartement");
        kelaslabel.setBounds(400, 450, 200, 30);
        TampilanAwal.add(kelaslabel);
        textkamar = new JTextField();
        textkamar.setBounds(400, 480, 200, 30);
        TampilanAwal.add(textkamar);
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        TampilanAwal.add(reg);
        TampilanAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanAwal.setVisible(true);
        TampilanAwal.setLocationRelativeTo(null);
        radioadmin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radioadmin.isSelected()){
                    radiocostumer.setSelected(false);
                    ceklogin=true;
                }
            }
        });
        radiocostumer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radiocostumer.isSelected()){
                    radioadmin.setSelected(false);
                    ceklogin=false;
                }
            }
        });
        check.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(ceklogin==true){
                    try{
                        Allobjctrl07183.admin.dataAdmin();
                        Allobjctrl07183.admin.login(textemaillogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl07183.admin.adminEntity07103().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                        AdminGUI07183 asisten = new AdminGUI07183();
                        TampilanAwal.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Email atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                        kosong();
                }else{
                    try{
                       Allobjctrl07183.Costumer.login(textemaillogin.getText(),passwordlogin.getText());
                       String nama = Allobjctrl07183.Costumer.costumerEntity().getNama();
                       JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                       CostumerGUI07183 costumer = new CostumerGUI07183();
                       TampilanAwal.dispose();
                    }catch(Exception eception){
                        JOptionPane.showMessageDialog(null, "Email atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String email = textemaildaftar.getText();
                    String pass = passworddaftar.getText();
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    Date tglbooking = new Date(texttglbooking.getText());
                    String kelas = textkamar.getText();
                    Allobjctrl07183.Costumer.insert(email, pass, nama, notelp, tglbooking, kelas);
                    JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    void kosong(){
        textemaildaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        texttglbooking.setText(null);
        textemaillogin.setText(null);
        passwordlogin.setText(null);
        textkamar.setText(null);
    }
}
