public class Adapter implements Appareil{
    @Override
    public void allumer() {

    }

    @Override
    public void eteindre() {

    }

    @Override
    public boolean isAllume() {
        return false;
    }

    private Cheminee cheminee;

    public Adapter(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    public void changerIntensite(int i) {
        this.cheminee.changerIntensite(i);
    }

    public int getLumiere() {
        return this.cheminee.getLumiere();
    }
}
