package org.example.Service;

import org.example.Model.Ereignis;
import org.example.Model.EventType;
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

    public int computeEreignis(){
        int computed = 0;
        List<Ereignis> list = listAllEreignis();
        for(Ereignis re : list){
            if(re.getEventType().equals(EventType.FOUND_SUPPLIES)){
                computed= re.getPoints()+2*re.getDay();
            }
        }
        return computed;
    }
}
