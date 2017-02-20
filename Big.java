/**
 * Created by Monko on 19.02.2017.
 */
public class Big extends SingleProperty {
  public Big(){
            int  food = 1;
            SFood = food;
            boolean protecrive=true;
            Protective=protecrive;
        }
  int SFood;
  boolean Protective;
  public boolean Protect(){
      return Protective;
  }
  public int getFood(){
      return SFood;
  }

}
