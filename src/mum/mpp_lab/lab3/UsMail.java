package mum.mpp_lab.lab3;

public class UsMail extends Carrier {

    @Override
    public double costOfPackage(Package pack) {
        double rate = 0.0;
        if (pack.getWeight() < 3) {
            rate = pack.getWeight() * 1.00;
        } else {
            rate = pack.getWeight() * 0.55;
        }
        return rate;
    }
}
