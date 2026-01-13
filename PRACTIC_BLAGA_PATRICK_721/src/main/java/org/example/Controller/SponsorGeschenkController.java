package org.example.Controller;

import org.example.Repo.SponsorGeschenkRepo;
import org.example.Service.SponsorGeschenkService;

public class SponsorGeschenkController {
    private final SponsorGeschenkService sponsorGeschenkService;

    public SponsorGeschenkController(SponsorGeschenkService sponsorGeschenkService) {
        this.sponsorGeschenkService = sponsorGeschenkService;
    }

    public void showAllSponsorGeschenk(){
        System.out.println(sponsorGeschenkService.listAllSponsorGeschenk());
    }
}
