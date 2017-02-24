package model;

import model.properties.Big;

import java.util.ArrayList;

/**
 * Created by Monko on 15.02.2017.
 */
public class Player {

    public Player() {
        Cards = new ArrayList<>();
        Animals = new ArrayList<>();
    }

    private ArrayList<Card> Cards ;
    private ArrayList<Animal> Animals;

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

    }


}
