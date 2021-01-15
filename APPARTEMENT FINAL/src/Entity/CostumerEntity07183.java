package Entity;

import java.util.Date;

public class CostumerEntity07183 extends CostumerAbstractEntity07183{
    private String kamar;
    public CostumerEntity07183(String email, String password, String nama, String no_telp, Date tglBooking, String kelas) {
        super(email, password, nama, no_telp, tglBooking);
        this.kamar = kelas;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }
}
