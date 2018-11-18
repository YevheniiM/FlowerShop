import flowers.*;
import store.Order;
import store.Store;
import store.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlowerBucket bucketRosesAndTulips = new FlowerBucket(
                new ArrayList<FlowerGroup>(){{
                    add(new FlowerGroup(new Rose(3.5, Color.RED, Country.England), 10));
                    add(new FlowerGroup(new Tulip(1.5, Color.BLUE, Country.Italy), 5));
                }}
            );

        FlowerBucket bucketRoses = new FlowerBucket(
                new ArrayList<FlowerGroup>(){{
                    add(new FlowerGroup(new Rose(5.0, Color.GREEN, Country.Portugal), 20));
                }}
        );

        FlowerBucket bucketTulips = new FlowerBucket(
                new ArrayList<FlowerGroup>(){{
                    add(new FlowerGroup(new Tulip(10.0, Color.RED, Country.Ukraine), 30));
                }}
        );

        Store store = new Store(new ArrayList<FlowerBucket>(){{add(bucketRoses); add(bucketTulips);}});
        User user = new User("Oles");
        Order order = new Order(user);
        order.addBucket(store.getFlowerBuckets().get(0).getOwnId(), store);
        order.addBucket(store.getFlowerBuckets().get(1).getOwnId(), store);
        order.submit(store);
    }
}
