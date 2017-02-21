import java.util.ArrayList;

/**
 * Created by Monko on 15.02.2017.
 */
public class Player {
    Big name = new Big();
    public Player() {

        ArrayList<Card> pleyersCards = new ArrayList<>();
        ArrayList<Animal> pleyersAnimals = new ArrayList<>();
        pleyersCards=Cards;
        Animals = pleyersAnimals;
    }

    private ArrayList<Card> Cards = new ArrayList<>();
    private ArrayList<Animal> Animals = new ArrayList<>();

    public void abbCard(Card card){
        Cards.add(card);

    }
    public void addAnimal(Animal animal){
        Animals.add(animal);
    }
    public void removeCard(Card card){

    }
    public void removeAnimal(Animal animal){
        Animals.remove(animal);
        animal.clearOwner();
    }


}
