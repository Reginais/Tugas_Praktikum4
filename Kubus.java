package kubus;

/**
 *
 * @author regina
 */

import bangunruang.BangunRuang;

public class Kubus extends BangunRuang {
    private int sisi;
    
    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int Volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public int LuasPermukaan() {
        return 6 * sisi * sisi;
    }
    
}
