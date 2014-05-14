/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.metier;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Morvan
 */
@Entity
@Table(name = "VINS")
public class Vin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VIN")
    @SequenceGenerator(name = "SEQ_VIN", sequenceName = "SEQ_VINS", initialValue = 1, allocationSize = 1)
    @Column(name = "NUMERO")
    private int id;
    @Column(name = "REFERENCE")
    private String ref;
    @Column(name = "NOM")
    private String nom;
    @Transient
    private double prix;
    @Column(name = "DESCRIPTION")
    private String description;
    @Transient
    private ArrayList<Etoile> etoiles;

    public Vin() {
        this.etoiles = new ArrayList<>();
    }

    public Vin(int id, String ref, String nom, double prix, String description) {
        this.id = id;
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.etoiles = new ArrayList<>();
    }

    public Vin(String ref, String nom, String description) {
        this.ref = ref;
        this.nom = nom;
        this.description = description;
        this.etoiles = new ArrayList<>();
    }

    public Vin(int id, String ref, String nom, double prix, String description, ArrayList<Etoile> etoiles) {
        this.id = id;
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.etoiles = etoiles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Etoile> getEtoiles() {
        return etoiles;
    }

    public void setEtoiles(ArrayList<Etoile> etoiles) {
        this.etoiles = etoiles;
    }

}
