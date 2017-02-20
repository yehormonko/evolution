/**
 * Created by Monko on 15.02.2017.
 */
public class SingleProperty {

    private int Food;
    private boolean Protective;



    public boolean isProtective(){
        if (Protective) {
            return true;
        }
        return false;
    }
    public  int increaseNeedFood(){
        return Food ;
    }
}
