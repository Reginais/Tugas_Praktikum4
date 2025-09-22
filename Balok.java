package balok;

/**
 *
 * @author regina
 */

import bangunruang.BangunRuang;

public class Balok extends BangunRuang {
    private int panjang, lebar, tinggi;
    
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public int Volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public int LuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
}
