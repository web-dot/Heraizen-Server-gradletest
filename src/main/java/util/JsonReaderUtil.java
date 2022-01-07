package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Domain.Team;

public class JsonReaderUtil {
    
    public static List<Team> loadFromJsonFile(){
        
        List<Team> teamList = new ArrayList<>();
        
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            teamList = objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream("/ipl.json"), new TypeReference<List<Team>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(Team team : teamList) {
//            System.out.println(team.label);
//        }
        return teamList;
    }
    
    
}
