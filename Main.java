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
            Big m = new Big();
           b.addProperty(m);
            a.addProperty(m);
            me.addAnimal(a);
            me.addAnimal(b);

          System.out.println(a.attack(b));
            a.attack(b);
            System.out.println(a.getOwner());

        }
    }

