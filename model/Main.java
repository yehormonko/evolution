package model;

import model.properties.Big;
import model.properties.Camouflage;
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
            Animal d = new Animal(me);
            Animal f = new Animal(me);
            d.addProperty(new Sharp());
            f.addProperty(new Camouflage());
            System.out.println(f.attackedBy(a));

        }
    }

