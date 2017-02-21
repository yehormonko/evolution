import java.util.ArrayList;

/**
 * Created by Monko on 15.02.2017.
 */
public class Animal extends Card {

    public Animal(Player owner){
        ArrayList<SingleProperty> Properties = new ArrayList<>();
        int food;
        int needFood;
        food = Food;
        needFood=1+ NeedFood;
        Properties =PropertyList  ;
        Owner=owner;
        boolean isProtected = Protect;
    }


    private Player Owner;
    private int Food;
    private int NeedFood;
    private ArrayList<SingleProperty> PropertyList = new ArrayList<>();
    private boolean Protect;

    public boolean serchBig(){
        for(int j=0;j<PropertyList.size();j++){
            if (PropertyList.get(j)instanceof Big)
                return true;
                break;
        }
        return false;
    }
    public boolean isProtected(){
        if (Protect) return true;
        return false;
    }
    public boolean attack(Animal animal){
       boolean ret = false;
        for(int j=0;j<PropertyList.size();j++){
            if ((!(PropertyList.get(j) instanceof Big)) && (animal.serchBig())) {
               ret= false;

                break;
            }else {
                ret = true;
                Owner.removeAnimal(animal);
                Food=Food+2;}
            }

       return ret;

    }
    public void addProperty(SingleProperty property){
        if (property.isProtective()) Protect= true;
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
}
