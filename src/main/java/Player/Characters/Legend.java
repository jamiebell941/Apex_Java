package Player.Characters;

public enum Legend {

    PATHFINDER("Path Finder", "Zipline", "Grapple", "Survey Beacon"),
    WRAITH("Wraith", "Void Tear", "Rift Walk", "Voices From The Void"),
    BLOODHOUND("Bood Hound", "Beast of Hunt", "Eye of the Allfather", "Tracker"),
    CAUSTIC("Caustic", "Nox Gas Grenade", "Nox Gas Trap", "Nox Vision"),
    CRYPTO("Crypto", "Drone EMP", "Surveillance Drone", "Nuerolink"),
    MIRAGE("Mirage", "Vanishing Act", "Psyche Out", "Encore"),
    BANGALORE("Bangalore", "Rolling Thunder", "Smoke Launcer", "Double Time"),
    GIBRALTAR("Gibraltar", "Defensive Bombardment", "Dome of Protection", "Gun Shield"),
    REVENANT("Revenant", "Death Totem", "Silence", "Stalker"),
    WATSON("Wattson", "Interception Pylon", "Perimeter Security", "Spark of Genius"),
    OCTANE("Octane", "Launch Pad", "Stim", "Swift Mend"),
    LIFELINE("Life Line", "Care Package", "D.O.C Heal Drone", "Combat Medic");
    private final String charName;
    private final String ult;
    private final String tactical;
    private final String passive;

    Legend(String charName, String ult, String tactical, String passive) {
        this.charName = charName;
        this.ult = ult;
        this.tactical = tactical;
        this.passive = passive;
    }

    public String getCharName() {
        return charName;
    }

    public String getUlt() {
        return ult;
    }

    public String getTactical() {
        return tactical;
    }

    public String getPassive() {
        return passive;
    }
}
