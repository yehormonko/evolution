package model;

import java.util.ArrayList;

/**
 * Created by Monko on 15.02.2017.
 */
public class Animal extends Card {

    public Animal(Player owner){
        PropertyList = new ArrayList<>();
       Owner=owner;

    }


    private Player Owner;
    private int Food;
    private int NeedFood;
    private ArrayList<SingleProperty> PropertyList ;



    public boolean attackedBy(Animal animal){
        for (SingleProperty property : PropertyList) {
            if (!property.attackedBy(animal)) {
                return  false;
                }
        }
            Owner.removeAnimal(this);
            animal.addFood(2);
            return true;



    }
    public void addFood(int addFood){
        Food = Food+addFood;
    }
    public void addProperty(SingleProperty property){
        property.setOwner(this);
        NeedFood= NeedFood +property.increaseNeedFood();
        PropertyList.add(property);
    }
    public boolean isBig(){
return false;
    }
    public void clearOwner(){
        Owner = null;
    }
    public Player getOwner(){
        return Owner;
    }
    public ArrayList<SingleProperty> getPropertyList(){
        return  PropertyList;
    }
    public int getFood(){
        return Food;
    }
}
