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

    }

}
