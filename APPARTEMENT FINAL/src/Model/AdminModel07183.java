package Model;

import Entity.AdminEntity07183;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AdminModel07183 implements ModelInterfaces07183{
    private ArrayList<AdminEntity07183> adminEntityArrayList;
    
    public AdminModel07183() {
        adminEntityArrayList = new ArrayList<AdminEntity07183>();
    }
    
    public void insertAdmin(AdminEntity07183 admin) {
        adminEntityArrayList.add(admin);
    }

    @Override
    public void view() {
        for (AdminEntity07183 adminEntity07183 : adminEntityArrayList) {
            System.out.println(adminEntity07183.getEmail());
            System.out.println(adminEntity07183.getNama());
            System.out.println(adminEntity07183.getPassword());
            System.out.println(adminEntity07183.getNo_telp());
            System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(adminEntity07183.getTglBooking()));
        }
    }

    @Override
    public int cekData(String email, String password) {
        int loop = 0;
        for (AdminEntity07183 adminEntity07183 : adminEntityArrayList) {
            if (adminEntity07183.getEmail().equals(email) && adminEntity07183.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public AdminEntity07183 showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }
}
