package org.example.Controller;

import org.example.Repo.TributRepo;
import org.example.Service.TributService;

public class TributController {
    private final TributService tributService;

    public TributController(TributService tributService) {
        this.tributService = tributService;
    }

    public void showAllTribut(){
        System.out.println(tributService.listAllTribut());
    }
    public void showFilteredTributByDistriktAndStatus(int distrikt){
        System.out.println(tributService.filterTributByDistriktAndStatus(distrikt));
    }
}
