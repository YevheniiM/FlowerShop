package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rose extends Flower{
    private String name = "Rose";

    public Rose(double price, Color color, Country country) {
        this.getProperties().setPrice(price);
        this.getProperties().setCountry(country);
        this.getProperties().setColor(color);
    }
}