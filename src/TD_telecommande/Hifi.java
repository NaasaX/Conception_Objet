package TD_telecommande;

/**
 * classe qui represente une chaine hifi
 */
public class Hifi implements Appareil{

    /**
     * l'intensite du son de la chaine on suppose que la chaine est eteinte si
     * le son vaut 0
     */
    private int son = 0;

    /**
     * permet d'allumer ou d'augmenter le son de la chaine
     */
    public void allumer() {
        this.son += 10;
        // son maximum
        if (this.son > 100)
            this.son = 100;
    }

    /**
     * permet d'eteindre la chaine (son mis a 0)
     */
    public void eteindre() {
        this.son = 0;

    }

    @Override
    public boolean isAllume() {
        boolean b = false;
        if(son>0)
            b=true;
        return b;
    }

    /**
     * surcharge de la methode affichage sous la forme "TD_telecommande.Hifi:10"
     *
     * @return descriptif sous forme de chaine
     */
    public String toString() {
        String r = "";
        r += "TD_telecommande.Hifi:" + son;
        return (r);
    }
}