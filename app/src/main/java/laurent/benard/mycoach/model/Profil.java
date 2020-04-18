package laurent.benard.mycoach.model;

public class Profil {

    //Constantes
    private static final int MIN_FEMME = 15; //maigre si en dessous
    private static final int MAX_FEMME = 30; //gros si au dessus
    private static final int MIN_HOMME = 10; //maigre si en dessous
    private static final int MAX_HOMME = 25; //gros si au dessus

    //Propriétés par défaut en private
    private int poids;
    private int taille;
    private int age;
    private int sexe;

    private float valeurImg;
    private String message;

    //Création du constructeur
        public Profil(int poids, int taille, int age, int sexe) {
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.sexe = sexe;

        this.resultMessage();
        this.calculImg();
    }

    //Création des geteurs
    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public int getSexe() {
        return sexe;
    }

    public float getValeurImg() {
        return valeurImg;
    }

    public String getMessage() {
        return message;
    }

    private void calculImg(){
        //Calcul de la taille en metres
        float tailleEnMetres = (float) taille/100;
        this.valeurImg = (float) ((1.2*poids/(tailleEnMetres*tailleEnMetres)) + (0.23*age) - (10.83*sexe)-5.4);
    }

    private void resultMessage(){
            int min;
            int max;

            if (sexe == 0){
                // Femme
                min = MIN_FEMME;
                max = MAX_FEMME;
            }else {
                // Homme
                min = MIN_HOMME;
                max = MAX_HOMME;
            }
            //Message correspondant
            message = "normal";
            if (valeurImg < min){
                message = "trop eleve";
            }else {

                if (valeurImg > max){
                    message = "trop faible";
                }
            }
    }
}
