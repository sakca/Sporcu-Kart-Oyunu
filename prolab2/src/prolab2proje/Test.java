package prolab2proje;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Test {

    ArrayList<Sporcu> sporcuListesi = new ArrayList<>();
    ArrayList<ImageIcon> sporcuImages = new ArrayList<>();

    Basketbolcu b = new Basketbolcu();
    Futbolcu f = new Futbolcu();

    public Test() {

    }

    public static void main(String[] args) {

        new Menu().setVisible(true);
    }

    public ArrayList<Sporcu> sporcu_olustur() {
        sporcuListesi.add(new Basketbolcu("Michael Jordan", "Chicago Bulls", 95, 85, 92));
        sporcuListesi.add(new Basketbolcu("Lebron James", "Lakers", 90, 84, 74));
        sporcuListesi.add(new Basketbolcu("Stephen Curry", "Golden State Warriors", 90, 85, 93));
        sporcuListesi.add(new Basketbolcu("Kobe Bryant", "Lakers", 92, 90, 92));
        sporcuListesi.add(new Basketbolcu("Karl Malone", "Utah Jazz", 93, 90, 93));
        sporcuListesi.add(new Basketbolcu("Kevin Garnett", "Boston Celtics", 90, 80, 82));
        sporcuListesi.add(new Basketbolcu("Dwayne Wade", "Miami Heat", 90, 80, 90));
        sporcuListesi.add(new Basketbolcu("Jimmy Butler", "Miami Heat", 95, 88, 90));

        sporcuListesi.add(new Futbolcu("Diego Maradona", "Napoli", 92, 90, 95));
        sporcuListesi.add(new Futbolcu("Pelé", "Santos FC", 95, 90, 95));
        sporcuListesi.add(new Futbolcu("Zinedine Zidane", "Real Madrid", 85, 95, 90));
        sporcuListesi.add(new Futbolcu("Alex de Souza", "Fenerbahçe", 85, 90, 85));
        sporcuListesi.add(new Futbolcu("Sergen Yalçın", "Beşiktaş", 90, 85, 90));
        sporcuListesi.add(new Futbolcu("Lionel Messi", "Barcelona", 93, 90, 95));
        sporcuListesi.add(new Futbolcu("İlhan Mansız", "Beşiktaş", 90, 80, 85));
        sporcuListesi.add(new Futbolcu("Andrea Pirlo", "Juventus", 85, 95, 85));

        return sporcuListesi;

    }

    public ArrayList<ImageIcon> sporcu_kartOlustur() {
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\jordan.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\lebronjames.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\stephencurry.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\kobebryant.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\karlmalone.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\kevingarnett.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\dwaynewade.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\jimmybutler.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));

        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\maradona.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\pele.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\zidane.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\alex.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\sergen.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\messi.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\ilhanmansız.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));
        sporcuImages.add(new ImageIcon(new ImageIcon("D:\\Java kod\\ProLab2Proje\\kartlar\\pirlo.jpg").getImage().getScaledInstance(320, 450, Image.SCALE_DEFAULT)));

        return sporcuImages;

    }

    int[] randomlar1 = new int[8];
    int[] randomlar2 = new int[8];

    public void kartAtaKullanici(Kullanici kullanici) {

        sporcu_olustur();
        Random r = new Random();

        //basektçiler arasından random seçim
        randomlar1[0] = r.nextInt(7);//0-7 arasında sayı oluştur ve dizinin ilk karakterine ata

        randomlar1[1] = r.nextInt(7);
        while (randomlar1[1] == randomlar1[0]) {
            randomlar1[1] = r.nextInt(7);
        }

        randomlar1[2] = r.nextInt(7);
        while (randomlar1[2] == randomlar1[0] || randomlar1[2] == randomlar1[1]) {
            randomlar1[2] = r.nextInt(7);
        }

        randomlar1[3] = r.nextInt(7);
        while (randomlar1[3] == randomlar1[0] || randomlar1[3] == randomlar1[1] || randomlar1[3] == randomlar1[2]) {
            randomlar1[3] = r.nextInt(7);
        }

        /*
        for (int i = 0; i < 4; i++) {
            kullanici.kartListesi[i][0] = sporcuListesi.get(randomlar1[i]).getSporcuIsim(); // ilk random kartı ata
            kullanici.kartListesi[i][1] = sporcuListesi.get(randomlar1[i]).getSporcuTakim();

        }
        
         */
        //futbolcular arasından random seçim
        randomlar1[4] = 8 + (int) (Math.random() * (8));

        randomlar1[5] = 8 + (int) (Math.random() * (8));
        while (randomlar1[5] == randomlar1[4]) {
            randomlar1[5] = 8 + (int) (Math.random() * (8));
        }

        randomlar1[6] = 8 + (int) (Math.random() * (8));
        while (randomlar1[6] == randomlar1[4] || randomlar1[6] == randomlar1[5]) {
            randomlar1[6] = 8 + (int) (Math.random() * (8));
        }

        randomlar1[7] = 8 + (int) (Math.random() * (8));
        while (randomlar1[7] == randomlar1[4] || randomlar1[7] == randomlar1[5] || randomlar1[7] == randomlar1[6]) {
            randomlar1[7] = 8 + (int) (Math.random() * (8));
        }

        for (int i = 0; i < 8; i++) {
            kullanici.kartListesi[i][0] = sporcuListesi.get(randomlar1[i]).getSporcuIsim(); // ilk random kartı ata
            kullanici.kartListesi[i][1] = sporcuListesi.get(randomlar1[i]).getSporcuTakim();

        }

        /*
        randomlar1[0] = (int) (Math.random() * (7)); //0-7 arasında sayı oluştur ve dizinin ilk karakterine ata
        kullanici.kartListesi[0][0] = sporcuListesi.get(randomlar1[0]).getSporcuIsim(); // ilk random kartı ata
        kullanici.kartListesi[0][1] = sporcuListesi.get(randomlar1[0]).getSporcuTakim();
        //1.kartı yukarıdkai
        for (int i = 1; i < 4; i++) { //2,3,4. kartlar bu forda oluşacak

            random1 = (int) (Math.random() * (7)); //0-7 arası sayı oluştur

            while (randomlar1[i - 1]==random1) { //oluşan sayı, dizinin ilk karakterine eşitse
                random1 = (int) (Math.random() * (7)); //başka sayı oluştur,,, eşit olmayana kadar 

            }

            if (random1 != randomlar1[i - 1]) {
                randomlar1[i] = random1; //dizinin sıradaki karakteirni eşit olmayan sayı olarak kaydet
                kullanici.kartListesi[i][0] = sporcuListesi.get(randomlar1[i]).getSporcuIsim(); //sirayla random kartları ata
                kullanici.kartListesi[i][1] = sporcuListesi.get(randomlar1[i]).getSporcuTakim();
            }

        }*/

 /*
        randomlar1[4] = 8 + (int) (Math.random() * (8)); //5.kartın sporculistesinden değerini 8-16 arasında oluştur
        kullanici.kartListesi[4][0] = sporcuListesi.get(randomlar1[4]).getSporcuIsim(); //5.kartı ata
        kullanici.kartListesi[4][1] = sporcuListesi.get(randomlar1[4]).getSporcuTakim();

        for (int j = 5; j < 8; j++) {//6,7,8.kartlar bu forda oluşacak

            random2 = 8 + (int) (Math.random() * (8)); // 8-16 arası random sayi

            while (random2 == randomlar1[j - 1]) { //random sayi 5.karta eşitse
                random2 = 8 + (int) (Math.random() * (8)); //eşit olmayana kadar sayi üret

            }
            randomlar1[j] = random2; //sayiyi listeye ata
            kullanici.kartListesi[j][0] = sporcuListesi.get(randomlar1[j]).getSporcuIsim(); //listedeki değere denk gelen sporcuyu karta ata
            kullanici.kartListesi[j][1] = sporcuListesi.get(randomlar1[j]).getSporcuTakim();

        }
         */
        for (int z = 0; z < 8; z++) {
            System.out.println(randomlar1[z]);
        }
    }

    public void kartAtaBilgisayar(Bilgisayar bilgisayar) {

        sporcu_olustur();

        Random r = new Random();

        randomlar2[0] = (int) (Math.random() * (8));

        while (randomlar2[0] == randomlar1[0] || randomlar2[0] == randomlar1[1] || randomlar2[0] == randomlar1[2] || randomlar2[0] == randomlar1[3] || randomlar2[0] == randomlar1[4] || randomlar2[0] == randomlar1[5] || randomlar2[0] == randomlar1[6] || randomlar2[0] == randomlar1[7]) {
            randomlar2[0] = (int) (Math.random() * (8));
        }

        randomlar2[1] = (int) (Math.random() * (8));

        while (randomlar2[1] == randomlar1[0] || randomlar2[1] == randomlar1[1] || randomlar2[1] == randomlar1[2] || randomlar2[1] == randomlar1[3] || randomlar2[1] == randomlar1[4] || randomlar2[1] == randomlar1[5] || randomlar2[1] == randomlar1[6] || randomlar2[1] == randomlar1[7] || randomlar2[1] == randomlar2[0]) {
            randomlar2[1] = (int) (Math.random() * (8));
        }

        randomlar2[2] = (int) (Math.random() * (8));

        while (randomlar2[2] == randomlar1[0] || randomlar2[2] == randomlar1[1] || randomlar2[2] == randomlar1[2] || randomlar2[2] == randomlar1[3] || randomlar2[2] == randomlar1[4] || randomlar2[2] == randomlar1[5] || randomlar2[2] == randomlar1[6] || randomlar2[2] == randomlar1[7] || randomlar2[2] == randomlar2[0] || randomlar2[2] == randomlar2[1]) {
            randomlar2[2] = (int) (Math.random() * (8));
        }

        randomlar2[3] = (int) (Math.random() * (8));

        while (randomlar2[3] == randomlar1[0] || randomlar2[3] == randomlar1[1] || randomlar2[3] == randomlar1[2] || randomlar2[3] == randomlar1[3] || randomlar2[3] == randomlar1[4] || randomlar2[3] == randomlar1[5] || randomlar2[3] == randomlar1[6] || randomlar2[3] == randomlar1[7] || randomlar2[3] == randomlar2[0] || randomlar2[3] == randomlar2[1] || randomlar2[3] == randomlar2[2]) {
            randomlar2[3] = (int) (Math.random() * (8));
        }

        randomlar2[4] = 8 + (int) (Math.random() * (8));

        while (randomlar2[4] == randomlar1[0] || randomlar2[4] == randomlar1[1] || randomlar2[4] == randomlar1[2] || randomlar2[4] == randomlar1[3] || randomlar2[4] == randomlar1[4] || randomlar2[4] == randomlar1[5] || randomlar2[4] == randomlar1[6] || randomlar2[4] == randomlar1[7] || randomlar2[4] == randomlar2[0] || randomlar2[4] == randomlar2[1] || randomlar2[4] == randomlar2[2] || randomlar2[4] == randomlar2[3]) {
            randomlar2[4] = 8 + (int) (Math.random() * (8));
        }

        randomlar2[5] = 8 + (int) (Math.random() * (8));

        while (randomlar2[5] == randomlar1[0] || randomlar2[5] == randomlar1[1] || randomlar2[5] == randomlar1[2] || randomlar2[5] == randomlar1[3] || randomlar2[5] == randomlar1[4] || randomlar2[5] == randomlar1[5] || randomlar2[5] == randomlar1[6] || randomlar2[5] == randomlar1[7] || randomlar2[5] == randomlar2[0] || randomlar2[5] == randomlar2[1] || randomlar2[5] == randomlar2[2] || randomlar2[5] == randomlar2[3] || randomlar2[5] == randomlar2[4]) {
            randomlar2[5] = 8 + (int) (Math.random() * (8));
        }

        randomlar2[6] = 8 + (int) (Math.random() * (8));

        while (randomlar2[6] == randomlar1[0] || randomlar2[6] == randomlar1[1] || randomlar2[6] == randomlar1[2] || randomlar2[6] == randomlar1[3] || randomlar2[6] == randomlar1[4] || randomlar2[6] == randomlar1[5] || randomlar2[6] == randomlar1[6] || randomlar2[6] == randomlar1[7] || randomlar2[6] == randomlar2[0] || randomlar2[6] == randomlar2[1] || randomlar2[6] == randomlar2[2] || randomlar2[6] == randomlar2[3] || randomlar2[6] == randomlar2[4] || randomlar2[6] == randomlar2[5]) {
            randomlar2[6] = 8 + (int) (Math.random() * (8));
        }

        randomlar2[7] = 8 + (int) (Math.random() * (8));

        while (randomlar2[7] == randomlar1[0] || randomlar2[7] == randomlar1[1] || randomlar2[7] == randomlar1[2] || randomlar2[7] == randomlar1[3] || randomlar2[7] == randomlar1[4] || randomlar2[7] == randomlar1[5] || randomlar2[7] == randomlar1[6] || randomlar2[7] == randomlar1[7] || randomlar2[7] == randomlar2[0] || randomlar2[7] == randomlar2[1] || randomlar2[7] == randomlar2[2] || randomlar2[7] == randomlar2[3] || randomlar2[7] == randomlar2[4] || randomlar2[7] == randomlar2[5] || randomlar2[7] == randomlar2[6]) {

            randomlar2[7] = 8 + (int) (Math.random() * (8));
        }

        for (int i = 0; i < 8; i++) {
            bilgisayar.kartListesi[i][0] = sporcuListesi.get(randomlar2[i]).getSporcuIsim(); // ilk random kartı ata
            bilgisayar.kartListesi[i][1] = sporcuListesi.get(randomlar2[i]).getSporcuTakim();

        }
        for (int z = 0; z < 8; z++) {
            System.out.println(randomlar2[z]);
        }

    }

    int skor_kullanici = 0;
    int skor_bilgisayar = 0;

    public String karsilastir_basketbolcu(int bilgsec, int kullsec)//secilen kartlar futbolcuysa gir ve istenen pozisyonu karsilastir
    {

        Random random = new Random();
        int rastgele = random.nextInt(3);

        Kullanici kull = new Kullanici();
        Bilgisayar bilg = new Bilgisayar();

        Basketbolcu basketbolcubilg = (Basketbolcu) sporcuListesi.get(bilgsec);
        Basketbolcu basketbolcukull = (Basketbolcu) sporcuListesi.get(kullsec);

        if (rastgele == 0) {
            System.out.println("secilen ozellik ikilik");
            if (basketbolcubilg.ikilik < basketbolcukull.ikilik) {
                skor_kullanici += 10;
               // kull.setSkor(skor_kullanici);

            } else if (basketbolcubilg.ikilik == basketbolcukull.ikilik) {

                return null;
            } else {
                skor_bilgisayar += 10;
              //  bilg.setSkor(skor_bilgisayar);
            }
            System.out.println("skooor" + skor_kullanici);
           // kull.setSkor(skor_kullanici);
           //bilg.setSkor(skor_bilgisayar);
            String secilenozellik2 = "ikilik";
            return secilenozellik2;
        }

        if (rastgele == 1) {
            System.out.println("secilen ozellik ucluk");
            if (basketbolcubilg.ucluk < basketbolcukull.ucluk) {
                skor_kullanici += 10;
               // kull.setSkor(skor_kullanici);

            } else if (basketbolcubilg.ucluk == basketbolcukull.ucluk) {
                return null;
            } else {
                skor_bilgisayar += 10;
               // bilg.setSkor(skor_bilgisayar);
            }
            System.out.println("skooor" + skor_kullanici);
           // kull.setSkor(skor_kullanici);
           // bilg.setSkor(skor_bilgisayar);
            String secilenozellik2 = "ucluk";
            return secilenozellik2;
        }

        if (rastgele == 2) {
            System.out.println("secilen ozellik serbset atis");
            if (basketbolcubilg.SerbestAtis < basketbolcukull.SerbestAtis) {
                skor_kullanici += 10;
              //  kull.setSkor(skor_kullanici);

            } else if (basketbolcubilg.SerbestAtis == basketbolcukull.SerbestAtis) {
                return null;
            } else {
                skor_bilgisayar += 10;
               // bilg.setSkor(skor_bilgisayar);
            }
            System.out.println("skooor" + skor_kullanici);
           // kull.setSkor(skor_kullanici);
          //  bilg.setSkor(skor_bilgisayar);
            String secilenozellik2 = "Serbest Atis";
            return secilenozellik2;
        }
        return null;

    }

    public String karsilastir_futbolcu(int bilgsec, int kullsec)//secilen kartlar futbolcuysa gir ve istenen pozisyonu karsilastir
    {
        // degerler 8-16 arasında kesin

        Kullanici kull = new Kullanici();
        Bilgisayar bilg = new Bilgisayar();

        Futbolcu futbolcubilg = (Futbolcu) sporcuListesi.get(bilgsec);
        Futbolcu futbolcukull = (Futbolcu) sporcuListesi.get(kullsec);

        Random random = new Random();
        int rastgele = random.nextInt(3);

        if (rastgele == 0) {

            if (futbolcubilg.penalti < futbolcukull.penalti) {
                skor_kullanici += 10;
               // kull.setSkor(skor_kullanici);
            } else if (futbolcubilg.penalti == futbolcukull.penalti) {
                return null;
            } else {
                skor_bilgisayar += 10;
               // bilg.setSkor(skor_bilgisayar);
            }
            //kull.setSkor(skor_kullanici);
            //bilg.setSkor(skor_bilgisayar);
            String secilenozellik = "Penalti";
            return secilenozellik;

            
        }
        if (rastgele == 1) {
            System.out.println("secilen ozellik serbest vurus");
            if (futbolcubilg.serbestVurus > futbolcukull.serbestVurus) {
                skor_bilgisayar += 10;
                //bilg.setSkor(skor_bilgisayar);
            } else if (futbolcubilg.serbestVurus == futbolcukull.serbestVurus) {
                return null;
            } else {
                skor_kullanici += 10;
                //kull.setSkor(skor_kullanici);
                
            }
            
           // kull.setSkor(skor_kullanici);
           // bilg.setSkor(skor_bilgisayar);
            String secilenozellik = "Serbest Vurus";
            return secilenozellik;

        }
        if (rastgele == 2) {
            System.out.println("secilen ozellik kaleciyle karsi karsiya");
            if (futbolcubilg.kaleciKarsiKarsiya > futbolcukull.kaleciKarsiKarsiya) {
                skor_bilgisayar += 10;
               // bilg.setSkor(skor_bilgisayar);
            } else if (futbolcubilg.kaleciKarsiKarsiya == futbolcukull.kaleciKarsiKarsiya) {
                return null;
            } else {
                skor_kullanici += 10;
               // kull.setSkor(skor_kullanici);
            }

           // kull.setSkor(skor_kullanici);
            //bilg.setSkor(skor_bilgisayar);
            String secilenozellik = "Kaleciyle Karşı Karşıya";
            return secilenozellik;
        }
        return null;

    }


    /*
    
    //kartsecte kullanici ekrandan secince veya kartseçte bilg random kart secince
    public int randomPozisyonKull(int secilenkartinindexi) {

        Kullanici kull = new Kullanici();

        for (int j = 0; j < 16; j++) {
            if (kull.kartListesi[secilenkartinindexi][0].equals(sporcuListesi.get(j).getSporcuIsim())) {
                //secilenkarttaki isim, sporculistesindeki kaçıncı isimle aynı
                if (j < 8) {   //basketbolcu
                   return randpoz_b(j);
                } else {   //futbolcu
                   return randpoz_f(j);
                }
            }
        }
        return 0;
    }

    public int randomPozisyonBilg(int secilenkartinindexi) {

        Bilgisayar bilg = new Bilgisayar();

        for (int j = 0; j < 16; j++) {
            if (bilg.kartListesi[secilenkartinindexi][0].equals(sporcuListesi.get(j).getSporcuIsim())) {
                //secilenkarttaki isim, sporculistesindeki kaçıncı isimle aynı
                if (j < 8) {   //basketbolcu
                    return randpoz_b(j);
                } else {   //futbolcu
                    return randpoz_f(j);
                }
            }
        }
        return 0;
    }

    public int randpoz_b(int i) {

        Basketbolcu basketci = (Basketbolcu) sporcuListesi.get(i);

        int[] b_ozellik = {basketci.ikilik, basketci.ucluk, basketci.SerbestAtis};
        Random random = new Random();
        int secilenb = random.nextInt(b_ozellik.length);

        //basketbolcuadindan arraylistten ikilik üclük değerini döndür
        return secilenb;

    }

    public int randpoz_f(int j) { //futbolcu icin random pozisyom

        Futbolcu futbolcu = (Futbolcu) sporcuListesi.get(j);
        int[] f_ozellik = {futbolcu.penalti, futbolcu.serbestVurus, futbolcu.kaleciKarsiKarsiya};
        Random random = new Random();
        int secilenf = random.nextInt(f_ozellik.length);

        System.out.println(f_ozellik[secilenf]);

        return secilenf;

    }
     */
    int temp, temp1, temp2, secilen;

    public int bilgKartSec(int deger) {//0-16
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            if (deger == randomlar1[i]) {

                temp = i;
                System.out.print("randoomm: " + temp);
            }
        }

        // temp= 0-4 basketçi, 4-8 futbolcu
        if (temp < 4) {
            System.out.println("basketbol");
            temp1 = random.nextInt(4);
            secilen = randomlar2[temp1];
        } else if (temp > 3 && temp < 8) {
            System.out.println("futbol");
            temp2 = 4 + (int) (Math.random() * (4));

            secilen = randomlar2[temp2];
        }

        return secilen; //0-8 8
    }

}
