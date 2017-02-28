package model;

import model.properties.Big;
import model.properties.Camouflage;
import model.properties.Hibernation;
import model.properties.Sharp;

/**
 * Created by Monko on 16.02.2017.
 */
public class Main {

        public static void main(String[] args) {
            Player me = new Player();
            Animal a = new Animal(me);
            Animal b = new Animal(me);
            Player you =  new Player();
            Animal c = new Animal(you);
            you.removeAnimal(c);
            a.addProperty(new Big());
            b.addProperty(new Big());
            System.out.println(b.getFood());
            System.out.println(a.attackedBy(b));
            System.out.println(b.getFood());
            System.out.println(b.getNeedFood());
            Animal f =new Animal(me);
            Animal s = new Animal(me);
           f.addProperty(new Hibernation());
            Animal r = new Animal(me);
            r.attackedBy(f);
            System.out.println(f.getNeedFood());
            System.out.println(f.getFood());

            System.out.println(f.attackedBy(s));
        }
    }

