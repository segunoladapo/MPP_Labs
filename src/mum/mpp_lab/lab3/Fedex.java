package mum.mpp_lab.lab3;

import java.util.HashMap;

public class Fedex extends Carrier {
    HashMap<String, Double> zones;
    public final static String IA = "IA";
    public final static String MT = "MT";
    public final static String OR = "OR";
    public final static String CA = "CA";
    public final static String TX = "TX";
    public final static String UT = "UT";
    public final static String FL = "FL";
    public final static String MA = "MA";
    public final static String OH = "OH";


    public Fedex() {
        zones = new HashMap<>();
        zones.put(IA, 0.35);
        zones.put(MT, 0.35);
        zones.put(OR, 0.35);
        zones.put(CA, 0.35);
        zones.put(TX, 0.30);
        zones.put(UT, 0.30);
        zones.put(FL, 0.55);
        zones.put(MA, 0.55);
        zones.put(OH, 0.55);
    }

    @Override
    public double costOfPackage(Package pack) {
        Double zoneValue = zones.get(pack.getZone());
        double rate;
        if (zoneValue == null) {
            //Zone not available, may use the default value for unavailable zones
            rate = 0.43 * pack.getWeight();
        } else {
            rate = zoneValue * pack.getWeight();
        }
        return rate;
    }
}