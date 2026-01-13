package org.example.Repo;

import org.example.Model.SponsorGeschenk;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SponsorGeschenkRepo {

    private final String filename;
    ObjectMapper mapper = new ObjectMapper();
    public SponsorGeschenkRepo(String filename) {
        this.filename = filename;
    }
    public List<SponsorGeschenk> readAllSponsorGeschenk(){
        List<SponsorGeschenk> list = new ArrayList<>();
        return list = new ArrayList<>(Arrays.asList(mapper.readValue(new File(filename), SponsorGeschenk[].class)));
    }

}
