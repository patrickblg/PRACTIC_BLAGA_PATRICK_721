package org.example.Service;

import org.example.Model.Status;
import org.example.Model.Tribut;
import org.example.Repo.TributRepo;

import java.util.Comparator;
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
       return data.stream().filter(e -> e.getDistrict()==distrikt && e.getStatus().equals(Status.ALIVE)).toList();

    }
    public List<Tribut> sortBySkillLevel(){
        List<Tribut>data = tributRepo.readAllTribut();
        return data.stream()
                .sorted(Comparator.comparingInt(Tribut::getSkillLevel).reversed())
                .sorted(Comparator.comparing(Tribut::getName)).toList();
        }
        public void addTributs(List<Tribut> list){
            tributRepo.persist(list);
        }
    }


