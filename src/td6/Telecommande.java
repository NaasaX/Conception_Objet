package td6;

import java.util.ArrayList;

public class Telecommande {
    public ArrayList<td6.Lampe> tab = new ArrayList<td6.Lampe>();

    public Telecommande() {
        this.tab = new ArrayList<td6.Lampe>();
    }

    public void ajouterLampe(td6.Lampe lampe) {
        this.tab.add(lampe);
    }


    public void ajouterLampes(td6.Lampe lampe) {
        this.tab.add(lampe);
    }

    public void activerLampe(int indice) {
        for (int i = 0; i < this.tab.size(); i++) {
            if (i == indice) {
                this.tab.get(i).allumer();
            }
        }
    }


    public void desactiverLampe(int indice) {
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

}