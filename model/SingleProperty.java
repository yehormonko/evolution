package model;

/**
 * Created by Monko on 15.02.2017.
 */
public abstract class SingleProperty {

    protected int Food;
    protected boolean Protective;
    protected Animal owner;
    public  abstract boolean attackedBy(Animal hunter);
    public boolean Protect(){
        return Protective;
    }
    public  int increaseNeedFood(){
        return Food ;
    }
    public void setOwner(Animal animal){
       owner=animal;
    }

}
