package laurent.benard.mycoach.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewProfilTest {

    Profil profil = new Profil(67, 165, 35, 0);

    private float valeurImg = (float) 32.2;

    private String message = "trop eleve";

    @Test
    public void getValeurImg() {

        assertEquals( valeurImg, profil.getValeurImg(),  0.1);
    }

    @Test
    public void getMessage() {

        assertEquals(message, profil.getMessage());
    }
}