package com.timbuchalka2;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody2 {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody2> satellites;
    private final BodyTypes bodyType;
    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody2(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public Set<HeavenlyBody2> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite(HeavenlyBody2 satellite){
        return this.satellites.add(satellite);
    }

    @Override
    public final int hashCode() {
        return this.getName().hashCode() + this.bodyType.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof HeavenlyBody2){
            HeavenlyBody2 theObject = (HeavenlyBody2) obj;
            return (this.name.equals(theObject.getName()) && theObject.getBodyType().equals(this.getBodyType()));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType.name() + ": " + this.orbitalPeriod;
    }

}
