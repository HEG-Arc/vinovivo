/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.vinovivo.metier;

/**
 *
 * @author Morvan
 */
public class Etoile {
    private int id;
    private double note;

    public Etoile() {
    }

    public Etoile(int id, double note) {
        this.id = id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
}
