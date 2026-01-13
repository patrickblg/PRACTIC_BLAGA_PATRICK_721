package org.example.Repo;

import org.example.Model.Ereignis;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EreignisRepo {

    private final String filename;
    ObjectMapper mapper = new ObjectMapper();
    public EreignisRepo(String filename) {
        this.filename = filename;
    }
    public List<Ereignis> readAllEreignis(){
        List<Ereignis> list = new ArrayList<>();
        return list = new ArrayList<>(Arrays.asList(mapper.readValue(new File(filename), Ereignis[].class)));
    }

}
