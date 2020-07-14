package ru.job4j.oop.proffesions;

public class AircraftEngineer extends Engineer {
    boolean planeCreate = false;

    public boolean isHelicopterCreate() {
        return planeCreate;
    }

    public EngineTrust engineCalculate(Aircraft plane) {
        EngineTrust engineTrust = new EngineTrust();
        return engineTrust;
    }
}
