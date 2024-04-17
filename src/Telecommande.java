import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Lampe> tab = new ArrayList<Lampe>();

    public Telecommande() {
        this.tab = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.tab.add(lampe);
    }


    public void ajouterLampes(Lampe lampe) {
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

    //Methode pour gerer les chaine hifi
    public void activerChaineHifi(int indice) {
        for (int i = 0; i < this.tab.size(); i++) {
            if (i == indice) {
                this.tab.get(i).allumer();
            }
        }
    }

    public void desactiverChaineHifi(int indice) {
        for (int i = 0; i < this.tab.size(); i++) {
            if (i == indice) {
                this.tab.get(i).eteindre();
            }
        }
    }

    public void activerToutChaineHifi() {
        for (int i = 0; i < this.tab.size(); i++) {
            this.tab.get(i).allumer();
        }
    }



}