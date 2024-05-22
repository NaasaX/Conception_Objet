package TD11.donnees;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 *
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 *
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter
     *            le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder � un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i)
    {
        CD res=null;
        if ((i>=0)&&(i<this.listeCds.size()))
            res=this.listeCds.get(i);
        return(res);
    }

    // TODO  ajouter une methode de tri

//    //methode de tri par artiste
//    public void trierArtiste() {
//
//        for (int i = 0; i < listeCds.size(); i++) {
//            for (int j = 0; j < listeCds.size(); j++) {
//                if (listeCds.get(i).getNomArtiste().compareTo(listeCds.get(j).getNomArtiste()) < 0) {
//                    CD temp = listeCds.get(i);
//                    listeCds.set(i, listeCds.get(j));
//                    listeCds.set(j, temp);
//                }
//            }
//        }
//
//
//    }
//
//    //methode de tri par album
//    public void trierAlbum() {
//        for (int i = 0; i < listeCds.size(); i++) {
//            for (int j = 0; j < listeCds.size(); j++) {
//                if (listeCds.get(i).getNomCD().compareTo(listeCds.get(j).getNomCD()) < 0) {
//                    CD temp = listeCds.get(i);
//                    listeCds.set(i, listeCds.get(j));
//                    listeCds.set(j, temp);
//                }
//            }
//        }
//    }


    public void trier(ComparateurCd comparateur) {
        for (int i = 0; i < listeCds.size(); i++) {
            for (int j = 0; j < listeCds.size(); j++) {
                if (comparateur.etreAvant(listeCds.get(i), listeCds.get(j))) {
                    CD temp = listeCds.get(i);
                    listeCds.set(i, listeCds.get(j));
                    listeCds.set(j, temp);
                }
            }
        }
    }

}
