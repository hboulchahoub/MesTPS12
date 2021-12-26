package models;

public class ExtractAnnotation {
    public static void main(String[] args) {
        Class c = SubFacture.class;
        Auteur auteur = (Auteur) c.getAnnotation(Auteur.class);
        System.out.println(auteur);
    }
}
