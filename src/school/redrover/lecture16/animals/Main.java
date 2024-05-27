package school.redrover.lecture16.animals;

import school.redrover.lecture16.Comparators;

import java.security.cert.CertificateParsingException;
import java.util.List;

import static school.redrover.lecture16.animals.Animals.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Comparators.findUltimateGeneric(List.of(TIGER, BEAR, ANT, ELEPHANT, DUNG_BEETLE), HEAVIEST).getName());
    }
}
