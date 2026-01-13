package org.example.Controller;

import org.example.Repo.EreignisRepo;
import org.example.Service.EreignisService;

public class EreignisController {
    private final EreignisService ereignisService;

    public EreignisController(EreignisService ereignisService) {
        this.ereignisService = ereignisService;
    }

    public void showAllEreignis(){
        System.out.println(ereignisService.listAllEreignis().toString());
    }
}
