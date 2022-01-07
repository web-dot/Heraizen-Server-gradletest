package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDto {
    
    public String name;
    public String price;
    public String team;
    public PlayerDto(String name, String price, String team) {
        super();
        this.name = name;
        this.price = price;
        this.team = team;
    }
    
    
    
    
}
