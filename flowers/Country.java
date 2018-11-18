package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public enum Country {
    Italy("italy"), Ukraine("ukraine"), England("england"), Portugal("portugal");

    private String country;

    Country(String country){
        country = country.substring(0, 1).toUpperCase() + country.substring(1); // capitalize the first letter
        this.country = country;
    }
}
