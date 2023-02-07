package lesson06;

import Cache.CacheLimitations;
import OldClass.View;
import Serializator.Serializator;
import VIVI.ViewNew;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        /*
        Вызываем экземпляры класса
         */
        Designer_Human designer_human = new Designer_Human();  //Вызов  экземпляр класса

        Family_Tree family_tree = new Family_Tree();//Вызов  экземпляр класса
        family_tree.enumerationСollection(family_tree); //метод перебора коллекции

        Serializator serializator = new Serializator();//Вызов  экземпляр класса
        serializator.serializatorMetod(designer_human); //вызываем серализотор

        ViewNew viewNew = new ViewNew();
        viewNew.ViewvNEW();

        CacheLimitations cacheLimitations = new CacheLimitations(); //Вызов  экземпляр класса
        cacheLimitations.cacheMetod(family_tree);//вызываем метод кэширования
    }
}
