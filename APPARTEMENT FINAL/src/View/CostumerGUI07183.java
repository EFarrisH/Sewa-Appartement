package View;

import Entity.AppartEntity07183;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class CostumerGUI07183 {
    JFrame Costumer = new JFrame();
    JButton back,daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri,daftarappartement;
    JComboBox pilcos = new JComboBox(AppartEntity07183.kamar);
    int cek = Allobjctrl07183.Costumer.cekDaftarCostumer(Allobjctrl07183.Costumer.costumerEntity().getEmail());
    public CostumerGUI07183(){
        Costumer.setSize(720, 600);
        Costumer.setLayout(null);
        Costumer.getContentPane().setBackground(Color.RED);
        datadiri = new JLabel("Data Costumer");
        datadiri.setFont(new Font("Timer New Roman",Font.BOLD,30));
        datadiri.setBounds(90, 30, 200, 30);
        Costumer.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        Costumer.add(area);
        daftarappartement = new JLabel("Daftar Appartement");
        daftarappartement.setBounds(450, 30, 250, 30);
        daftarappartement.setFont(new Font("Times New Roman",Font.BOLD,30));
        Costumer.add(daftarappartement);
        pilcos.setBounds(450, 90, 230, 30);
        Costumer.add(pilcos);
        daftarbtn = new JButton("Daftar");
        daftarbtn.setBounds(500, 200, 100, 30);
        daftarbtn.setBackground(Color.GREEN);
        Costumer.add(daftarbtn);
        back = new JButton("Back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.red);
        Costumer.add(back);
        Costumer.setVisible(true);
        Costumer.setLocationRelativeTo(null);
        Costumer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(cek==-1){
            JOptionPane.showMessageDialog(null, "Anda Belum Menyewa", "Information", JOptionPane.INFORMATION_MESSAGE);        
        }else if(cek==-2){
            JOptionPane.showMessageDialog(null,"Anda Belum Menyewa", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            area.setText(datacostumer());
        }
        daftarbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            int indexcostum = pilcos.getSelectedIndex();
            Allobjctrl07183.Costumer.daftarCostumer(indexcostum, Allobjctrl07183.Costumer.getData(), false);
            area.setText(datacostumer());
        }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Costumer.dispose();
                GUI07183 men = new GUI07183();
            }
        });
    }
    String datacostumer(){
        int cek = Allobjctrl07183.Costumer.cekDaftarCostumer(Allobjctrl07183.Costumer.costumerEntity().getEmail());
        String cekverif;
        if(Allobjctrl07183.Costumer.showDaftarCostumer(cek).IsVerified()==false){
            cekverif = "belum diverifikasi";
        }else{
            cekverif = "sudah diverifikasi";
        }
        String text = "Email = "+Allobjctrl07183.Costumer.showDaftarCostumer(cek).getCostumer().getEmail()+"\n"
                +"Nama = "+Allobjctrl07183.Costumer.showDaftarCostumer(cek).getCostumer().getNama()+"\n"
                +"No Telp = "+Allobjctrl07183.Costumer.showDaftarCostumer(cek).getCostumer().getNo_telp()+"\n"
                +"Tanggal Booking = "+new SimpleDateFormat("dd-MM-yyyy").format(Allobjctrl07183.Costumer.showDaftarCostumer(cek).getCostumer().getTglBooking())+"\n"
                +"Verifikasi = "+cekverif+"\n"
                +"Appartement = "+Allobjctrl07183.Costumer.showDaftarCostumer(cek).getCostumer().getKamar()+"\n"
                +"Kamar = "+AppartEntity07183.kamar[Allobjctrl07183.Costumer.showDaftarCostumer(cek).getIndexCostumer()];
        return text;
    }
}
