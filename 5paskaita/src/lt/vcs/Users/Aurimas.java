package lt.vcs.Users;

import lt.vcs.paskaita5.User;

/**
 * Created by aurimas on 2016.10.19.
 */
public class Aurimas extends User {

    private String hobis;

    public Aurimas(String hobis) {
        super("Aurimas ");
        this.hobis = hobis;
    }

    public String getHobis() {
        return hobis;
    }

    public void setHobis(String hobis) {
        this.hobis = hobis;
    }

    @Override
    public String toString() {
        return super.toString() + " megsta " + this.hobis;
    }
}

