
/**
 * Write a description of class Rabbit here.
 *
 * @author winda naff
 * @version 26 Nov 2024
 */

import java.util.List;

public class Rabbit extends Animal {
    public Rabbit(Field field, Location location) {
        super(field, location);
    }
    @Override
    public void act(List<Animal> newAnimals){
        if(isAlive()){
            Location newLocation = getField().freeAdjacentLocation(getLocation());
            if(newLocation != null){
                setLocation(newLocation);
            }
            else {
                setDead();
            }
        }
    }
}
