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
public class Emplacement {
    private int id;
    private String nom;
    private ArrayList<Vin> vins;
    private ArrayList<Emplacement> sousEmplacements;

    public Emplacement() {
        this.vins = new ArrayList<>();
    }

    public Emplacement(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.vins = new ArrayList<>();
        this.sousEmplacements = new ArrayList<>();
    }
    
    public Emplacement(int id, String nom, ArrayList<Vin> vins, ArrayList<Emplacement> sousEmplacements) {
        this.id = id;
        this.nom = nom;
        this.vins = vins;
        this.sousEmplacements = sousEmplacements;
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

    public ArrayList<Emplacement> getSousEmplacements() {
        return sousEmplacements;
    }

    public void setSousEmplacements(ArrayList<Emplacement> sousEmplacements) {
        this.sousEmplacements = sousEmplacements;
    }
    
    public ArrayList<Vin> getVins() {
        return vins;
    }

    public void setVins(ArrayList<Vin> vins) {
        this.vins = vins;
    }
}
