package me.matthew_mbg.ocos.settings;

public enum PriorityCapeType {
    LABYMOD("LabyMod"),
    OPTIFINE("Optifine");

    private final String prioritycapeName;

    private PriorityCapeType(String prioritycapeName) {
        this.prioritycapeName = prioritycapeName;
    }

    public String getPriorityCapeName() {
        return this.prioritycapeName;
    }
}
