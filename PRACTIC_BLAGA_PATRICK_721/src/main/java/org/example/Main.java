package org.example;

import org.example.Controller.EreignisController;
import org.example.Controller.SponsorGeschenkController;
import org.example.Controller.TributController;
import org.example.Repo.EreignisRepo;
import org.example.Repo.SponsorGeschenkRepo;
import org.example.Repo.TributRepo;
import org.example.Service.EreignisService;
import org.example.Service.SponsorGeschenkService;
import org.example.Service.TributService;

import java.util.Scanner;

public class Main {
    static void main() {

        String ereignisFile = "PRACTIC_BLAGA_PATRICK_721/src/main/resources/events.json";
        String giftFile = "PRACTIC_BLAGA_PATRICK_721/src/main/resources/gifts.json";
        String tributFile = "PRACTIC_BLAGA_PATRICK_721/src/main/resources/tributes.json";

        EreignisRepo ereignisRepo = new EreignisRepo(ereignisFile);
        SponsorGeschenkRepo giftRepo = new SponsorGeschenkRepo(giftFile);
        TributRepo tributRepo = new TributRepo(tributFile);

       EreignisService ereignisService = new EreignisService(ereignisRepo);
       SponsorGeschenkService giftService = new SponsorGeschenkService(giftRepo);
       TributService tributService = new TributService(tributRepo);

        EreignisController ereignisController = new EreignisController(ereignisService);
        SponsorGeschenkController  giftController = new SponsorGeschenkController(giftService);
        TributController tributController = new TributController(tributService);

        ereignisController.showAllEreignis();
        giftController.showAllSponsorGeschenk();
        tributController.showAllTribut();

        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();

        tributController.showFilteredTributByDistriktAndStatus(s1);
        tributController.sortBySkillLevel();
        tributController.addTributs(tributService.sortBySkillLevel());

    }
}
