
package prolab2proje;

public class Kullanici extends Oyuncu {

    String[][] kartListesi = new String[8][2];

    String bOyuncuAd, bTakimAd;
    int iki, uc, serbestb;
    
    public Kullanici() {
    }

    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }
    
    public void setSkor(int skor) {
        this.skor +=skor;
    }
    public int getSkor() {
        return skor;
    }

    
    @Override
    public Sporcu kartSec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
