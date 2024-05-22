import TD11.XML.ChargeurMagasin;
import TD11.donnees.ComparateurAlbum;
import TD11.donnees.ComparateurArtiste;
import TD11.donnees.ComparateurCd;
import TD11.donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class MagasinTest {


    //Test du trie par album
//    @Test
//    public void testTrieAlbum() throws FileNotFoundException {
//        // methode testee
//        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimple/");
//        Magasin magasin = cm.chargerMagasin();
//        // verification
//        magasin.trierAlbum();
//        assertEquals("Believe", magasin.getCd(0).getNomCD());
//        assertEquals("Bénabar", magasin.getCd(1).getNomCD());
//        assertEquals("Demon Days", magasin.getCd(2).getNomCD());
//        assertEquals("Essence ordinaire", magasin.getCd(3).getNomCD());
//        assertEquals("Gorillaz", magasin.getCd(4).getNomCD());
//        assertEquals("Les Risques du métier", magasin.getCd(5).getNomCD());
//        assertEquals("Let's Talk About Love", magasin.getCd(6).getNomCD());
//        assertEquals("My Worlds", magasin.getCd(7).getNomCD());
//        assertEquals("Rejuvenation", magasin.getCd(8).getNomCD());
//        assertEquals("The Meters", magasin.getCd(9).getNomCD());
//        assertEquals("The Rolling Stones", magasin.getCd(10).getNomCD());
//        assertEquals("Whitney Houston", magasin.getCd(11).getNomCD());
//    }
//
//
//    //Test du trie par artiste
//    @Test
//    public void testTrieArtiste() throws FileNotFoundException {
//        // methode testee
//        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimple/");
//        Magasin magasin = cm.chargerMagasin();
//        // verification
//        magasin.trierArtiste();
//        assertEquals("Bénabar", magasin.getCd(0).getNomArtiste());
//        assertEquals("Bénabar", magasin.getCd(1).getNomArtiste());
//        assertEquals("Céline Dion", magasin.getCd(2).getNomArtiste());
//        assertEquals("Gorillaz", magasin.getCd(3).getNomArtiste());
//        assertEquals("Gorillaz", magasin.getCd(4).getNomArtiste());
//        assertEquals("Justin Bieber", magasin.getCd(5).getNomArtiste());
//        assertEquals("Justin Bieber", magasin.getCd(6).getNomArtiste());
//        assertEquals("The Meters", magasin.getCd(7).getNomArtiste());
//        assertEquals("The Meters", magasin.getCd(8).getNomArtiste());
//        assertEquals("The Rolling Stones", magasin.getCd(9).getNomArtiste());
//        assertEquals("Whitney Houston", magasin.getCd(10).getNomArtiste());
//        assertEquals("Zebda", magasin.getCd(11).getNomArtiste());
//    }


    //Test du trie generique avec les comparateurs

    @Test
    public void testTrieComparateurArtiste() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimple/");
        Magasin magasin = cm.chargerMagasin();
        ComparateurArtiste cp = new ComparateurArtiste();

        magasin.trier(cp);

        assertEquals("Bénabar", magasin.getCd(0).getNomArtiste());
        assertEquals("Bénabar", magasin.getCd(1).getNomArtiste());
        assertEquals("Céline Dion", magasin.getCd(2).getNomArtiste());
        assertEquals("Gorillaz", magasin.getCd(3).getNomArtiste());
        assertEquals("Gorillaz", magasin.getCd(4).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCd(5).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCd(6).getNomArtiste());
        assertEquals("The Meters", magasin.getCd(7).getNomArtiste());
        assertEquals("The Meters", magasin.getCd(8).getNomArtiste());
        assertEquals("The Rolling Stones", magasin.getCd(9).getNomArtiste());
        assertEquals("Whitney Houston", magasin.getCd(10).getNomArtiste());
        assertEquals("Zebda", magasin.getCd(11).getNomArtiste());
    }

    @Test
    public void testTrieComparateurAlbum() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimple/");
        Magasin magasin = cm.chargerMagasin();
        ComparateurAlbum cp = new ComparateurAlbum();

        magasin.trier(cp);

        assertEquals("Believe", magasin.getCd(0).getNomCD());
        assertEquals("Bénabar", magasin.getCd(1).getNomCD());
        assertEquals("Demon Days", magasin.getCd(2).getNomCD());
        assertEquals("Essence ordinaire", magasin.getCd(3).getNomCD());
        assertEquals("Gorillaz", magasin.getCd(4).getNomCD());
        assertEquals("Les Risques du métier", magasin.getCd(5).getNomCD());
        assertEquals("Let's Talk About Love", magasin.getCd(6).getNomCD());
        assertEquals("My Worlds", magasin.getCd(7).getNomCD());
        assertEquals("Rejuvenation", magasin.getCd(8).getNomCD());
        assertEquals("The Meters", magasin.getCd(9).getNomCD());
        assertEquals("The Rolling Stones", magasin.getCd(10).getNomCD());
        assertEquals("Whitney Houston", magasin.getCd(11).getNomCD());
    }


}
