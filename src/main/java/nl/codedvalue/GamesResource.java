package nl.codedvalue;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by cesarkoot on 26/06/15.
 *
 * This class will create a RESTful resource on the path /games. It will give you a list of games.
 */
@Path("game")
public class GamesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Game getGame() {
        Game fzero = new Game();
        fzero.setTitle("F-Zero GX");
        fzero.setYear(2003);
        fzero.setConsole("GameCube");
        return fzero;
    }

}
