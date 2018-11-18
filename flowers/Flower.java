package flowers;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private FlowerProperties properties = new FlowerProperties();

    public Flower(){

    }

    public Flower(Color color, double price, Country country){
        properties.setColor(color);
        properties.setPrice(price);
        properties.setCountry(country);
    }

    public Flower(Flower flower) {
        properties.setColor(flower.getColor());
        properties.setPrice(flower.getPrice());
        properties.setCountry(flower.getCountry());
    }

    public Color getColor(){ return properties.getColor(); }
    public double getPrice(){
        return properties.getPrice();
    }
    public Country getCountry(){
        return properties.getCountry();
    }
}
