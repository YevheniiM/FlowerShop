package store;

import flowers.Flower;
import flowers.FlowerBucket;
import flowers.FlowerGroup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Order {
    private ArrayList<FlowerBucket> buckets;
    private int currentBucket;
    private double price;
    private User user;

    public Order(User user){
        this.user = user;
        buckets = new ArrayList<FlowerBucket>();
        currentBucket = -1;
        price = 0;
    }

    public void addBucket(String id, Store store){
        buckets.add(store.getBucket(id));
        currentBucket++;
    }

    public void addFlowers(Flower flower, int quantity){
        buckets.get(currentBucket).addFlowerGroup(new FlowerGroup(flower, quantity));
    }

    public void submit(Store store) {
        for(FlowerBucket bucket: buckets){
            price += bucket.getPrice();
        }
        store.submit(this);
        System.out.println(String.format("Order for %s was submitted. Total price %s", user.getName(), price));
    }
}
