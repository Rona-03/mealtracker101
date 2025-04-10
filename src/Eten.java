public class Eten {
    private String etenID;
    private String etenNaam;
    private int etenCalorie;
    private int etenGewicht;

    public Eten(String etenID,String etenNaam, int etenCalorie, int etenGewicht) {
        this.etenID = etenID;
        this.etenNaam = etenNaam;
        this.etenCalorie = etenCalorie;
        this.etenGewicht = etenGewicht;
    }

    public String getEtenNaam() {
        return etenNaam;
    }

    public int getEtenCalorie() {
        return etenCalorie;
    }
}
