package Controller;

import Entity.AdminEntity07183;
import Entity.DaftarcostumerEntity07183;
import Entity.CostumerEntity07183;
import java.util.Date;
import java.util.ArrayList;

public class AdminController07183 implements ControllerInterface07183{
    int indexLogin = 0;
    public AdminController07183() {    
    }
    
    public void dataAdmin() {
        String emailAdmin[] = {"erlyanfarris@gmail.com"};
        String passwordAdmin[] = {"faris123"};
        String namaAdmin[] = {"Faris"};
        String noTelpAdmin[] = {"01"};
        String tanggalLahirAdmin[] = {"20/07/1945"};
        String kamar[] = {"ALL"};
        for(int i = 0; i < emailAdmin.length; i++) {
            AllObjectModel07183.adminModel.insertAdmin(new AdminEntity07183(emailAdmin[i], passwordAdmin[i], namaAdmin[i], 
                    noTelpAdmin[i], new Date(tanggalLahirAdmin[i]), kamar[i]));
        }}

    @Override
    public void login(String email, String password) {
        indexLogin = AllObjectModel07183.adminModel.cekData(email, password);}
    
    public void viewAdmin() {
        AllObjectModel07183.adminModel.view();
    }
    
    public void listPendaftarAppartement() {
        AllObjectModel07183.daftarCostumerModel.view();
    }
       
   // @Override
    //public void loginn(String email, String password) {
    //    indexLogin = AllObjectModel07183.adminModel.cekData(email, password);
    //}
    
    public AdminEntity07183 adminEntity07103() {
        return AllObjectModel07183.adminModel.showDataAdmin(indexLogin);
    }
    
    public void updateIsVerified(int index, int indexAppart, CostumerEntity07183 costumerEntity) {
        AllObjectModel07183.daftarCostumerModel.updateIsVerified(index, new DaftarcostumerEntity07183(costumerEntity, true, indexAppart));
    }
    
    public ArrayList<DaftarcostumerEntity07183> cekDaftarcostumerModel() {
        return AllObjectModel07183.daftarCostumerModel.getDaftarcostumerArrayList();
    }
}
