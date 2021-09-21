
package prolab2proje;

public class Futbolcu extends Sporcu {

    int penalti, serbestVurus, kaleciKarsiKarsiya;

    public Futbolcu() {
    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestVurus = serbestVurus;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    @Override
    public int sporcuPuaniGoster() {
        return super.sporcuPuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }

}
