package service;

import java.util.ArrayList;
import java.util.List;

import Domain.Team;
import util.JsonReaderUtil;



//Singleton class
public class IplStatServiceImpl implements IplStatService {
    
    private List<Team> teamList;
    
    private static transient IplStatService obj = null;
    
    
    private IplStatServiceImpl() {
        teamList = JsonReaderUtil.loadFromJsonFile();
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

}
