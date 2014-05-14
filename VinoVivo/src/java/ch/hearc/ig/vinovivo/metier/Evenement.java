/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.vinovivo.metier;

import java.util.ArrayList;

/**
 *
 * @author Morvan
 */
public class Evenement {
    private int id;
    private String nom;
    private ArrayList<Emplacement> emplacements;

    public Evenement() {
        this.emplacements = new ArrayList<>();
    }

    public Evenement(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.emplacements = new ArrayList<>();
    }

    public Evenement(int id, String nom, ArrayList<Emplacement> emplacements) {
        this.id = id;
        this.nom = nom;
        this.emplacements = emplacements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(ArrayList<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }
    
}
