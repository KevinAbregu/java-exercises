package com.timbuchalka2;

public class Planet extends  HeavenlyBody2{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody2 satellite) {
        if(satellite.getBodyType().equals(BodyTypes.MOON)){
            return super.addSatellite(satellite);
        }else{
            return false;
        }
    }
}
