package Entity;

import java.util.Date;

public abstract class CostumerAbstractEntity07183 {
    protected String email, password, nama, no_telp;
    protected Date tglBooking;

    public CostumerAbstractEntity07183(String email, String password, String nama, String no_telp, Date tglBooking) {
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.tglBooking = tglBooking;
    }
    
    public CostumerAbstractEntity07183(){
    }
    
    public abstract String getEmail();

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setTglBooking(Date tglBooking) {
        this.tglBooking = tglBooking;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public Date getTglBooking() {
        return tglBooking;
    }
}
