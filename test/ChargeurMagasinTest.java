

import TD11.donnees.Magasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TD11.XML.ChargeurMagasin;

import java.io.FileNotFoundException;

public class ChargeurMagasinTest {


    //test avec un répertoire valide
    @Test
    public void testChargeurMagasin() throws FileNotFoundException {
        // methode testee
        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimple/");
        Magasin magasin = cm.chargerMagasin();
        // verification
        assertEquals(12, magasin.getNombreCds());
    }

    //test avec un répertoire invalide
    @Test
    public void testChargeurMagasinInvalide() {
        // methode testee
        ChargeurMagasin cm = new ChargeurMagasin("src/TD11/XML/musicbrainzSimples/");
        // verification
        assertThrows(FileNotFoundException.class, () -> cm.chargerMagasin());
    }


}
