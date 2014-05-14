/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.utils;

import java.io.StringWriter;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import ch.hearc.ig.vinovivo.metier.Etoile;
import ch.hearc.ig.vinovivo.metier.Vin;

/**
 *
 * @author Morvan
 */
public class Services {

    public static ArrayList<Vin> peupleVins() {
        ArrayList<Vin> listVins = new ArrayList<>();
        Vin vin1 = new Vin(1, "","Vin1", 10.50, "");
        Vin vin2 = new Vin(2,"", "Vin2", 20.50, "");
        Vin vin3 = new Vin(3,"", "Vin3", 30.50, "");

        ArrayList<Etoile> etoiles1 = new ArrayList<>();
        etoiles1.add(new Etoile(1, 4));
        etoiles1.add(new Etoile(2, 3));
        etoiles1.add(new Etoile(3, 4));

        ArrayList<Etoile> etoiles2 = new ArrayList<>();
        etoiles2.add(new Etoile(1, 2));
        etoiles2.add(new Etoile(2, 3));
        etoiles2.add(new Etoile(3, 2));

        ArrayList<Etoile> etoiles3 = new ArrayList<>();
        etoiles3.add(new Etoile(1, 4));
        etoiles3.add(new Etoile(2, 4));
        etoiles3.add(new Etoile(3, 4));

        vin1.setEtoiles(etoiles1);
        vin2.setEtoiles(etoiles2);
        vin3.setEtoiles(etoiles3);

        listVins.add(vin1);
        listVins.add(vin2);
        listVins.add(vin3);
        calcmoyenne(vin1);
        return listVins;
    }

    public static String getVinstoJson() {
        ArrayList<Vin> list = peupleVins();
        StringWriter swriter = new StringWriter();
        try (JsonWriter jsonWrite = Json.createWriter(swriter)) {
            JsonObjectBuilder vin = Json.createObjectBuilder();
            JsonObjectBuilder builder = Json.createObjectBuilder();
            JsonArrayBuilder array = Json.createArrayBuilder();
            for (Vin vinSelect : list) {
                vin.add("id", vinSelect.getId());
                vin.add("nom", vinSelect.getNom());
                vin.add("prix", vinSelect.getPrix());
                vin.add("note", calcmoyenne(vinSelect));
                array.add(vin);
            }
            builder.add("vins", array);
            jsonWrite.writeObject(builder.build());
        }
        return swriter.toString();
    }

    public static double calcmoyenne(Vin vin) {
        int compteur = 0;
        double somme = 0;
        double moyenne = 0;
        for (int i = 0; i < vin.getEtoiles().size(); i++) {
            compteur++;
            somme += vin.getEtoiles().get(i).getNote();
        }
        //Moyenne sous forme XX.XXXXXX...
        moyenne = somme / compteur;
        //On récupère la partie "entier"
        int partieEntier = new Double(moyenne).intValue();
        //On récupère la partie "décimale"
        double decimale = moyenne - (new Double(partieEntier).doubleValue());
        //On arrondi à 1 décimale et on multiplie par 10 pour l'avoir sous forme d'un entier
        double dec = (Math.round(decimale * 10.0) / 10.0)*10;
        //On le met sous à 0, 5 ou 10
        double arrondi = (((int)dec + 2) / 5) * 5;
        //On additionne la partie "Entier" avec la décimale
        double moyenneFinale = partieEntier+(arrondi/10);
        System.out.println(moyenneFinale);
        return moyenneFinale;
    }
}
