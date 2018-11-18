package store;

import flowers.FlowerBucket;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Store {
    private ArrayList<FlowerBucket> flowerBuckets;

    public Store(){
        flowerBuckets = new ArrayList<FlowerBucket>();
    }

    public Store(ArrayList<FlowerBucket> flowerBuckets){
        this.flowerBuckets = flowerBuckets;
    }

    public void addBucket(FlowerBucket bucket){
        this.flowerBuckets.add(bucket);
    }

    public void deleteBucket(String id){
        this.flowerBuckets.removeIf((FlowerBucket bucket) -> bucket.getOwnId().equals(id));
    }

    public FlowerBucket getBucket(String id){
        return this.flowerBuckets.stream().filter(flowerBucket -> flowerBucket.getOwnId().equals(id)).findFirst().get();
    }

    public void submit(Order order) {
        // here is the order submission
    }
}
