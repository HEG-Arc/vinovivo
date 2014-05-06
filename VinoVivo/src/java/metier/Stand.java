/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.ArrayList;

/**
 *
 * @author Morvan
 */
public class Stand {
    private ArrayList<Vin> vins;

    public Stand() {
        this.vins = new ArrayList<>();
        this.vins.add(new Vin("vin 1 blanc"));
        this.vins.add(new Vin("vin 2 blanc"));
        this.vins.add(new Vin("vin 3 rosé"));
        this.vins.add(new Vin("vin 4 rosé"));
        this.vins.add(new Vin("vin 5 rouge"));
        this.vins.add(new Vin("vin 6 rouge"));
    }

    public Stand(ArrayList<Vin> vins) {
        this.vins = vins;
    }

    public ArrayList<Vin> getVins() {
        return vins;
    }

    public void setVins(ArrayList<Vin> vins) {
        this.vins = vins;
    }
}
