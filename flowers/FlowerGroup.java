package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerGroup {
    private final Flower flower;
    private int quantity;

    public FlowerGroup(Flower flower, int quantity){
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.flower.getPrice() * quantity;
    }
}
