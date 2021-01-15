package Model;

import Entity.AdminEntity07183;
import Entity.CostumerEntity07183;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CostumerModel07183 implements ModelInterfaces07183 {

    private ArrayList<CostumerEntity07183> costumerEntityArrayList;

    public CostumerModel07183() {
        costumerEntityArrayList = new ArrayList<CostumerEntity07183>();
    }

    public void insert(CostumerEntity07183 costumerEntity07183) {
        costumerEntityArrayList.add(costumerEntity07183);
    }

    public int size() {
        return costumerEntityArrayList.size();
    }

    @Override
    public void view() {
        for (CostumerEntity07183 costumerEntity07183 : costumerEntityArrayList) {
            System.out.println("========================================");
            System.out.println("Email : " + costumerEntity07183.getEmail() + "\nNama : " + costumerEntity07183.getNama()
                    + "\nPassowrd : " + costumerEntity07183.getPassword() + "\nNo.Telp : " + costumerEntity07183.getNo_telp()
                    + "\nTanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(costumerEntity07183.getTglBooking()));
            System.out.println("========================================");
        }
    }

    @Override
    public int cekData(String email, String password) {
        int loop = 0;
        while (!costumerEntityArrayList.get(loop).getEmail().equals(email)
                && !costumerEntityArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }

    public CostumerEntity07183 getCostumerEntityArrayList(int index) {
        return costumerEntityArrayList.get(index);
    }
}
