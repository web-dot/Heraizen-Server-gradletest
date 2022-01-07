package service;

import java.util.List;

public interface IplStatService {
    
    List<String> getTeamLabels();
    List<String> getAllTeams();
    List<String> getAllPlayers();
    String getTeamByLabel(String label);
}
