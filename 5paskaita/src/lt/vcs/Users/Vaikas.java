package lt.vcs.Users;

import lt.vcs.paskaita5.User;

/**
 * Created by aurimas on 2016.10.19.
 */
public class Vaikas extends User {

    private String spalva;
    public Vaikas(String spalva) {
        super("Vaikas ");
        this.spalva = spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    @Override
    public String toString() {
        return super.toString() + " megsta " + this.spalva;
    }
}
