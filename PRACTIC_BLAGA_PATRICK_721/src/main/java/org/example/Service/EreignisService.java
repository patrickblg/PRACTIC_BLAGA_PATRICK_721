package org.example.Service;

import org.example.Model.Ereignis;
import org.example.Repo.EreignisRepo;

import java.util.List;

public class EreignisService {

    private final EreignisRepo ereignisRepo;

    public EreignisService(EreignisRepo ereignisRepo) {
        this.ereignisRepo = ereignisRepo;
    }
    public List<Ereignis> listAllEreignis(){
        return ereignisRepo.readAllEreignis();
    }
}
