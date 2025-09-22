package tugaspraktikumpertemuan4;

/**
 *
 * @author regina
 */

import bangunruang.BangunRuang;
import balok.Balok;
import kubus.Kubus;

public class TugasPraktikumPertemuan4 {

    public static void main(String[] args) {
        BangunRuang balok = new Balok(2,7,5);
        BangunRuang kubus = new Kubus(7);
        
        BangunRuang[] daftar = {balok, kubus};
        
        for (BangunRuang b : daftar) {
            System.out.println("Volume: " + b.Volume());
            System.out.println("Luas Permukaan: " + b.LuasPermukaan());
            System.out.println("___________");
        }
    }
}