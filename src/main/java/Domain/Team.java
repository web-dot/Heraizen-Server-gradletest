package Domain;

import java.util.List;

import lombok.Data;

@Data
public class Team {
   
    
    public String city;
    public String home;
    public String coach;
    public String name;
    public String label;
    public List<Player> players;
    
}   
