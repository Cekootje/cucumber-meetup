package nl.codedvalue;

import lombok.Data;

/**
 * Created by cesarkoot on 26/06/15.
 *
 * Game object to be presented in JSON.
 */
@Data
public class Game {

    private String title;
    private int year;
    private String console;

}
