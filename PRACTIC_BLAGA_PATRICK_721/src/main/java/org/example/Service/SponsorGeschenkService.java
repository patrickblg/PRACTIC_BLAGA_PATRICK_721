package org.example.Service;

import org.example.Model.SponsorGeschenk;
import org.example.Repo.SponsorGeschenkRepo;

import java.util.List;

public class SponsorGeschenkService {

    private final SponsorGeschenkRepo sponsorGeschenkRepo;

    public SponsorGeschenkService(SponsorGeschenkRepo sponsorGeschenkRepo) {
        this.sponsorGeschenkRepo = sponsorGeschenkRepo;
    }
    public List<SponsorGeschenk> listAllSponsorGeschenk(){
        return sponsorGeschenkRepo.readAllSponsorGeschenk();
    }
}
