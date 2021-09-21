
package prolab2proje;

public class Basketbolcu extends Sporcu {

    int ikilik, ucluk, SerbestAtis;

    public Basketbolcu() {

    }

    public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int SerbestAtis) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.SerbestAtis = SerbestAtis;
    }

    @Override
    public int sporcuPuaniGoster() {
        return super.sporcuPuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }

}
