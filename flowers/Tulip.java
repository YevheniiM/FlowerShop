package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tulip extends Flower{
    private String name = "Tulip";

    public Tulip(double price, Color color, Country country) {
        this.getProperties().setPrice(price);
        this.getProperties().setCountry(country);
        this.getProperties().setColor(color);
    }
}
