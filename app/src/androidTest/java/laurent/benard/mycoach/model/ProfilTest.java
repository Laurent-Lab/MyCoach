package laurent.benard.mycoach.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfilTest {

    //Création d'un profil ; mon model
    private Profil mProfil = new Profil(67, 165, 35, 0);
    //Résultats que je dois obtenir
    //Le résultat du float est volontairement une erreur
    private float valeurImg = (float) 32.4;
    private String message = "trop eleve";


    @Test
    public void getValeurImg(){

        assertEquals(valeurImg, mProfil.getValeurImg(), (float) 0.01);
    }

    @Test
    public void getMessage() {
        //Comparer le retour réel de la méthode et la variable que l'on a initialisé
        //Est ce que la méthode getMessage, donne bien le message voulu
        assertEquals(message, mProfil.getMessage());
    }
}