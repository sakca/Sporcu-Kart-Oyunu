
package prolab2proje;

import java.util.Random;

public class Bilgisayar extends Oyuncu {

    String[][] kartListesi = new String[8][2];
    Test t = new Test();

    public Bilgisayar() {
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor +=skor;
    }
    
    

    public String[][] getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(String[][] kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    public Sporcu kartSec() {
        return null;

    }
}
