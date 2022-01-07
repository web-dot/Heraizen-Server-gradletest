package service;

import java.util.ArrayList;
import java.util.List;

import Domain.Player;
import Domain.Team;
import util.JsonReaderUtil;



//Singleton class
public class IplStatServiceImpl implements IplStatService {
    
    private List<Team> teamList;
    
    private static transient IplStatService obj = null;
    
    
    private IplStatServiceImpl() {
        teamList = JsonReaderUtil.loadFromJsonFile();
        //System.out.println(teamList);
    }
    
    //will return instane of this class
    public static IplStatService getInstance() {
        if(obj == null) {
            synchronized (IplStatServiceImpl.class) {
                obj=new IplStatServiceImpl();
                System.out.println("Object created");
            }
        }
        return obj;
    }

    
    @Override
    public List<String> getTeamLabels() {
        
        List<String> teamlabels = new ArrayList<>();
        for(Team team : teamList) {
            teamlabels.add(team.label);
        }
        return teamlabels;
    }


    @Override
    public List<String> getAllTeams() {
        List<String> teams = new ArrayList<>();
        for(Team team : teamList) {
            teams.add(team.name);
        }
        return teams;
    }

    @Override
    public List<String> getAllPlayers() {
        List<String> playerNames = new ArrayList<>();
        List<Player> o = null;
        for(Team team : teamList) {
            o = team.players;
            for(Object obj : o) {
                Player p = (Player)obj;
                playerNames.add(p.name);
            }
        }
        return playerNames;
    }

}
