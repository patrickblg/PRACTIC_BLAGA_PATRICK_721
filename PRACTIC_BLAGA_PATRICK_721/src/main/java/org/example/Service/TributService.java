package org.example.Service;

import org.example.Model.Status;
import org.example.Model.Tribut;
import org.example.Repo.TributRepo;

import java.util.List;

public class TributService {

    private final TributRepo tributRepo;

    public TributService(TributRepo tributRepo) {
        this.tributRepo = tributRepo;
    }
    public List<Tribut> listAllTribut(){
        return tributRepo.readAllTribut();
    }
    public List<Tribut> filterTributByDistriktAndStatus(int distrikt){
        List<Tribut>data = tributRepo.readAllTribut();
       return data.stream().filter(e -> e.getDistrikt()==distrikt).toList()
        .stream().filter(e -> e.getStatus()== Status.ALIVE).toList();

    }
}
