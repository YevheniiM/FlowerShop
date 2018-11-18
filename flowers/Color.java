package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    RED("red", "#FF0000"), BLUE("blue", "#0000FF"), GREEN("green", "#00FF00");

    private final String name;
    private final String code;

    Color(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
