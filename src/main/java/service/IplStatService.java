package service;

import java.util.List;

import dto.PlayerDto;

public interface IplStatService {
    
    List<String> getTeamLabels();
    List<String> getAllTeams();
    List<String> getAllPlayers();
    String getTeamByLabel(String label);
    List<String> getPlayersByLabel(String label);
    PlayerDto getPlayerInfo(String name);
}
