package Entity;

import java.util.Date;

public class AdminEntity07183 extends CostumerAbstractEntity07183{
    private String kamar;
    public AdminEntity07183(String email, String password, String nama, String no_telp, Date tglLahir, String kamar) {
        super(email, password, nama, no_telp, tglLahir);
        this.kamar = kamar;
    }
    @Override
    public String getEmail() {
        return this.email;
    }

    public String getKamar() {
        return kamar;
    }
    
    public void setKamar(String kamar) {
        this.kamar = kamar;
    }
}
