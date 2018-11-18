package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

@Setter
@Getter
public class FlowerBucket {
    private ArrayList<FlowerGroup> flowerGroups;
    private String ownId = UUID.randomUUID().toString();;

    public FlowerBucket(){
        flowerGroups = new ArrayList<FlowerGroup>();
    }

    public FlowerBucket(ArrayList<FlowerGroup> flowerGroups){
        this.flowerGroups = flowerGroups;
    }

    public void addFlowerGroup(FlowerGroup group){
        flowerGroups.add(group);
    }

    public double getPrice(){
        double price = 0;

        for(FlowerGroup fl: flowerGroups)
            price += fl.getPrice();

        return price;
    }
}
