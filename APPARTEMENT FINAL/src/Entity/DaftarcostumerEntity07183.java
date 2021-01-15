package Entity;

public class DaftarcostumerEntity07183 {
    private CostumerEntity07183 costumer;
    private boolean isVerified;
    private int indexAppartemen;

    public DaftarcostumerEntity07183(CostumerEntity07183 costumer, boolean isVerified, int indexCostumer) {
        this.costumer = costumer;
        this.isVerified = isVerified;
        this.indexAppartemen = indexCostumer;
    }
    
    public CostumerEntity07183 getCostumer() {
        return costumer;
    }

    public boolean IsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexCostumer() {
        return indexAppartemen;
    }

    public void setIndexAppartemen(int indexAppartemen) {
        this.indexAppartemen = indexAppartemen;
    }
}
