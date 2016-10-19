package lt.vcs;


import lt.vcs.Users.Aurimas;
import lt.vcs.Users.Vaikas;
import lt.vcs.paskaita5.User;

public class Main {

    public static void main(String[] args) {
        User Vaikas = new Vaikas("juoda");
        User Aurimas = new Aurimas("tinginiauti");
        User useris = new User("vardauskas ","pavardauskas ");
        User pk = new Aurimas("tekstas");


        if (Aurimas instanceof Aurimas){
            VcsUtils.println("Aurimas valio");
            Aurimas tikraiAurimas = (Aurimas)Aurimas;
            VcsUtils.println(tikraiAurimas.getHobis());
        }
        if (pk instanceof  User){
            VcsUtils.println("Paketas valio");
        }

        VcsUtils.println(
                (Aurimas).toString()
        );
        VcsUtils.println(
                (Vaikas).toString()
        );

    }
}
