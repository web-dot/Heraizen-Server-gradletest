package main;

import dto.PlayerDto;
import service.IplStatService;
import service.IplStatServiceImpl;

public class Driver {

    public static void main(String[] args) {
        
        //System.out.println("hello");
        //JsonReaderUtil.loadFromJsonFile();
        
        IplStatService statService = IplStatServiceImpl.getInstance();
        System.out.println(statService.getTeamLabels());
        System.out.println(statService.getAllTeams());
        System.out.println(statService.getAllPlayers());
        System.out.println(statService.getTeamByLabel("KKR"));
        System.out.println(statService.getPlayersByLabel("KKR"));
        
        
        PlayerDto pdto1 = statService.getPlayerInfo("Rohit");
        System.out.println(pdto1.name + ":" + pdto1.price + ":" + pdto1.team);
        
        PlayerDto pdto2 = statService.getPlayerInfo("Ajinkya");
        System.out.println(pdto2.name + ":" + pdto2.price + ":" + pdto2.team);
        
    }

}
