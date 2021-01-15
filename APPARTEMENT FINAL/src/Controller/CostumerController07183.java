package Controller;

import Entity.DaftarcostumerEntity07183;
import Entity.CostumerEntity07183;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class CostumerController07183 implements ControllerInterface07183{
    int indexLogin = 0;
    public CostumerController07183() {
    }
    
    public CostumerEntity07183 getData() {
        return AllObjectModel07183.costumerModel.getCostumerEntityArrayList(indexLogin);
    }
    
    public void daftarCostumer(int indexCostumer, CostumerEntity07183 costumerEntity, boolean isVerified) {
        AllObjectModel07183.daftarCostumerModel.insertDataDaftarcostumer(new DaftarcostumerEntity07183(costumerEntity, isVerified, indexCostumer));
    }
    
    @Override
    public void login(String email, String password) {
        indexLogin = AllObjectModel07183.costumerModel.cekData(email, password);
    }
    
    public void insert(String email, String password, String nama, String no_telp, Date tglBooking, String kelas) {
        AllObjectModel07183.costumerModel.insert(new CostumerEntity07183(email, password, nama, no_telp, tglBooking, kelas));
    }
    
    public CostumerEntity07183 costumerEntity() {
        return AllObjectModel07183.costumerModel.getCostumerEntityArrayList(indexLogin);
    }
    
    public int cekDaftarCostumer(String email) {
        int cek = AllObjectModel07183.daftarCostumerModel.cekData(email, null);
        return cek;
    }
    
    public DaftarcostumerEntity07183 showDaftarCostumer(int index) {
        return AllObjectModel07183.daftarCostumerModel.showDaftarcostumer(index);
    }
    
    public DefaultTableModel daftarcostumer(){
        DefaultTableModel dtmdaftarcostumer = new DefaultTableModel();//object  dtmdaftarprak
        Object[] kolom ={"EMAIL","Nama","Password","No Telp","Tgl Booking","Appartement","Verified","Kamar"};
        dtmdaftarcostumer.setColumnIdentifiers(kolom);
        int size = AllObjectModel07183.daftarCostumerModel.alldatacostumer().size();
        String verif = null;
        for(int i=0;i<size;i++){
            if(AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).IsVerified()==false){
                verif = "no";
            }else{
                verif = "yes";
            }
            Object [] data = new Object[8];
            data[0] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getEmail();
            data[1] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getNama();
            data[2] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getPassword();
            data[3] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getNo_telp();
            data[4] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getTglBooking();
            data[5] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getIndexCostumer();
            data[6] = verif;
            data[7] = AllObjectModel07183.daftarCostumerModel.alldatacostumer().get(i).getCostumer().getKamar();
            dtmdaftarcostumer.addRow(data);
        }
        return dtmdaftarcostumer;
    }
}
