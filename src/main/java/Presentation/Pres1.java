package Presentation;

import DAO.DaoImplement;
import METIER.IMetierImplement;
import ext.DaoImplementV2;

public class Pres1 {
    public static void main(String[] args) {
        DAO.DaoImplement d = new DaoImplement(); // manière statique car je connais déja la classe que je veux instancier
        //DaoImplementV2 d = new DaoImplementV2(); // manière statique car je connais déja la classe que je veux instancier
        IMetierImplement metier = new IMetierImplement(d);//Injection des dépendances via le constructeur
        //metier.setDao(d);// injection des dépendences
        System.out.println("Res = "+metier.calcul());
    }
}
