package main;

import service.IplStatService;
import service.IplStatServiceImpl;
import util.JsonReaderUtil;

public class Driver {

    public static void main(String[] args) {
        
        //System.out.println("hello");
        //JsonReaderUtil.loadFromJsonFile();
        
        IplStatService statService = IplStatServiceImpl.getInstance();
        System.out.println(statService.getTeamLabels());
        System.out.println(statService.getAllTeams());
        System.out.println(statService.getAllPlayers());
        System.out.println(statService.getTeamByLabel("KKR"));
    }

}
