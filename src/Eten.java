public class Eten {
    private int etenID;
    private String etenNaam;
    private int etenCalorie;
    private int etenGewicht;

    public Eten(int etenID, String etenNaam, int etenCalorie, int etenGewicht) {
        this.etenID = etenID;
        this.etenNaam = etenNaam;
        this.etenCalorie = etenCalorie;
        this.etenGewicht = etenGewicht;
    }

    public int getEtenID() {
        return etenID;
    }

    public String getEtenNaam() {
        return etenNaam;
    }

    public int getEtenCalorie() {
        return etenCalorie;
    }

    public int getEtenGewicht() {
        return etenGewicht;
    }
}
