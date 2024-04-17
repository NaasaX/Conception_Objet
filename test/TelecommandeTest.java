import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {
    @Test
    public void testAjoutATelecommandeVide() {
        //preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.ajouterLampes(l);

        //verification
        assertEquals("lampe1: Off", t.tab.get(0).toString());
    }

    @Test
    public void testAjoutATelecommandeAvec1element() {
        //preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampes(l);

        //methode testee
        t.ajouterLampes(l2);

        //verification
        assertEquals(t.tab.size(), 2);
    }

    @Test
    public void testActiverLampePosition0() {
        //preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);

        //methode testee
        t.activerLampe(0);

        //verification
        boolean res = t.tab.get(0).isAllume();
        assertEquals(res, true);


    }

    @Test
    public void testActiverLampePosition1() {
        //preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        //methode testee
        t.activerLampe(1);

        //verification
        boolean res = t.tab.get(1).isAllume();
        assertEquals(res, true);


    }
//    @Test
//    public void testActiverLampeInexistante(){
//        //preparation des donnees
//        Telecommande t = new Telecommande();
//        Lampe l = new Lampe("lampe1");
//        t.ajouterLampe(l);
//
//        //methode testee
//        t.activerLampe(1);
//
//        //verification
//        boolean res=t.tab.get(1).isAllume();
//        assertEquals(res, "la lampe n'existe pas" );
//    }

}
