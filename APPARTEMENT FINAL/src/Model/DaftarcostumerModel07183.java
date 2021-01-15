package Model;

import Entity.DaftarcostumerEntity07183;
import Entity.AppartEntity07183;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarcostumerModel07183 implements ModelInterfaces07183 {
    private ArrayList<DaftarcostumerEntity07183> daftarcostumerArrayList;

    public DaftarcostumerModel07183() {
        daftarcostumerArrayList = new ArrayList<DaftarcostumerEntity07183>();
    }

    public void insertDataDaftarcostumer(DaftarcostumerEntity07183 daftarcostumer) {
        daftarcostumerArrayList.add(daftarcostumer);
    }

    public ArrayList<DaftarcostumerEntity07183> getDaftarcostumerArrayList() {
        return daftarcostumerArrayList;
    }

    public int size() {
        return daftarcostumerArrayList.size();
    }

    @Override
    public void view() {
        for (DaftarcostumerEntity07183 daftarcostumer : daftarcostumerArrayList) {
            System.out.println("========================================");
            System.out.println("Email : " + daftarcostumer.getCostumer().getEmail() + "\nNama : " + daftarcostumer.getCostumer().getNama()
                    + "\nPassword : " + daftarcostumer.getCostumer().getPassword() + "\nNo.Telp : " + daftarcostumer.getCostumer().getNo_telp()
                    + "\nTanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarcostumer.getCostumer().getTglBooking())
                    + "\nPraktikum : " + AppartEntity07183.kamar[daftarcostumer.getIndexCostumer()] + "\nIsVerified : ");
            if (daftarcostumer.IsVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("========================================");
        }
    }

    @Override
    public int cekData(String email, String password) {
        int loop = 0;
        if (daftarcostumerArrayList.size() == 0) {
            loop = -1; // data kosong
        } else {
            for (int i = 0; i < daftarcostumerArrayList.size(); i++) {
                if (daftarcostumerArrayList.get(i).getCostumer().getEmail().equals(email)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarcostumerEntity07183 showDaftarcostumer(int index) {
        return daftarcostumerArrayList.get(index);
    }

    public void updateIsVerified(int index, DaftarcostumerEntity07183 daftarcostumerEntity07183) {
        daftarcostumerArrayList.set(index, daftarcostumerEntity07183);
    }
    public ArrayList <DaftarcostumerEntity07183> alldatacostumer(){
        return daftarcostumerArrayList;
    }
}
