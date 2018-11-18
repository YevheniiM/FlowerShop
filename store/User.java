package store;

import flowers.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {
    private static long id = 0;
    private String ownId = UUID.randomUUID().toString();;
    private String name;

    public User(String name){
        this.name = name;
    }
}
