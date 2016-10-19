package lt.vcs.paskaita5;

/**
 * Created by aurimas on 2016.10.19.
 */
public class User {
    private String vardas;
    private String pavarde;
    private final String klasesVardas;
    private int amzius = 77;

    public int getAmzius() {
        return amzius;
    }
    public  int getAmzius(int plius) {
        return amzius + plius;
    }
    public  int getAmzius(String plius) {
        return amzius + new Integer(plius);
    }



    public String toString() {
        String result = "super: " + super.toString() +
                this.klasesVardas + ": " +
                "vardas - " + this.vardas +
                "pavarde - " + this.pavarde;
        return result;
    }

    /**
     * User klases konstruktorius
     * @param argl vardas
     * @param arg2 pavarde
     */

    public User(String vardas, String pavarde){
        this(vardas);
        this.pavarde = pavarde;
    }
    public User(String vardas){
        super();
        this.vardas = vardas;
        this.klasesVardas = this.getClass().getName();
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlasesVardas() {
        return klasesVardas;
    }

}

