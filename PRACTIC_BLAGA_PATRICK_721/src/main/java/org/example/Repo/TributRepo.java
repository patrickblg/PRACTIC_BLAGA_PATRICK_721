package org.example.Repo;

import org.example.Model.Tribut;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TributRepo {

    private final String filename;
    ObjectMapper mapper = new ObjectMapper();
    public TributRepo(String filename) {
        this.filename = filename;
    }
    public List<Tribut> readAllTribut(){
        List<Tribut> list = new ArrayList<>();
        return list = new ArrayList<>(Arrays.asList(mapper.readValue(new File(filename), Tribut[].class)));
    }

    public void persist(List<Tribut> list){
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("PRACTIC_BLAGA_PATRICK_721/src/main/resources/output.json"),list);
    }


}
