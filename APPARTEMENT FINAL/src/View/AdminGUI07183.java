package View;

import Controller.AllObjectModel07183;
import Controller.CostumerController07183;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class AdminGUI07183 {
    private static CostumerController07183 costumer = new CostumerController07183();
    JFrame Admin = new JFrame();
    JTable tabelcostumer = new JTable();
    JScrollPane scrolladmin = new JScrollPane(tabelcostumer);
    JButton back,verif;
    JLabel admin,emaillabel,passlabel;
    JTextField emailtext,passtext;
    public AdminGUI07183(){
        Admin.setSize(650,500);
        Admin.setLayout(null);
        Admin.getContentPane().setBackground(Color.RED);
        admin = new JLabel("Admin");
        admin.setBounds(250, 30, 200, 30);
        admin.setFont(new Font("Timer New Roman",Font.BOLD,40));
        Admin.add(admin);
        scrolladmin.setBounds(30, 100, 570, 200);
        tabelcostumer.setModel(costumer.daftarcostumer());
        Admin.add(scrolladmin);
        emaillabel = new JLabel("Email");
        emaillabel.setBounds(50, 320, 100, 30);
        Admin.add(emaillabel);
        emailtext = new JTextField();
        emailtext.setBounds(50, 350, 100, 30);
        Admin.add(emailtext);
        passlabel = new JLabel("Password");
        passlabel.setBounds(200, 320, 100, 30);
        Admin.add(passlabel);
        passtext = new JTextField();
        passtext.setBounds(200, 350, 100, 30);
        Admin.add(passtext);
        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GREEN);
        Admin.add(verif);
        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.red);
        Admin.add(back);
        Admin.setLocationRelativeTo(null);
        Admin.setVisible(true);
        Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Admin.dispose();
                GUI07183 men = new GUI07183();
            }
        });
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String email = emailtext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel07183.daftarCostumerModel.cekData(email, pass);
                Allobjctrl07183.admin.updateIsVerified(index, Allobjctrl07183.Costumer.showDaftarCostumer(index).getIndexCostumer(),Allobjctrl07183.Costumer.showDaftarCostumer(index).getCostumer());
                tabelcostumer.setModel(costumer.daftarcostumer());
            }
        });
        tabelcostumer.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelcostumer.getSelectedRow();
                emailtext.setText(Allobjctrl07183.Costumer.daftarcostumer().getValueAt(i, 0).toString());
                passtext.setText(Allobjctrl07183.Costumer.daftarcostumer().getValueAt(i, 1).toString());
            }
        });
    }
}
