package TD_telecommande;

import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Appareil> tab;

    public Telecommande() {
        this.tab = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil ap) {
        this.tab.add(ap);
    }


//    public void ajouterLampes(TD_telecommande.Lampe lampe) {
//        this.tab.add(lampe);
//    }

    public void activerAppareil(int indice) {
        for (int i = 0; i < this.tab.size(); i++) {
            if (i == indice) {
                this.tab.get(i).allumer();
            }
        }
    }


    public void desactiverAppareil(int indice) {
        for (int i = 0; i < this.tab.size(); i++) {
            if (i == indice) {
                this.tab.get(i).eteindre();
            }
        }
    }

    public void activerTout() {
        for (int i = 0; i < this.tab.size(); i++) {
            this.tab.get(i).allumer();
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < this.tab.size(); i++) {
            r += this.tab.get(i).toString() + "\n";
        }
        return r;

    }

    public void changerIntensite(int i) {
        for (int j = 0; j < this.tab.size(); j++) {
            if (this.tab.get(j) instanceof Adapter) {
                ((Adapter) this.tab.get(j)).changerIntensite(i);
            }
        }
    }

}