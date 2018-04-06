package mum.mpp_lab.lab3;

public class Ups extends Carrier{

    @Override
    public double costOfPackage(Package pack){
        double rate = 0.04 * pack.getWeight();
        return rate;
    }
}
