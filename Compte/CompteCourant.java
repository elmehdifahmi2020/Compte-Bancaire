import java.util.Date;

public class CompteCourant extends Compte {
    public double decouvert;

    public CompteCourant() {
        solde = 0;
        this.decouvert = 500;
    }

    public CompteCourant(double solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    public String toString() {

        return super.toString() + " " + decouvert;
    }
    
    // @Override
    // public void updatSolde(double newSolde) {
    //     super.updatSolde(newSolde);
    // }


    // double totalretier=0;
    // public void retirer(double mt)  {
    //     if (mt <= solde + decouvert) {
    //         solde -= mt;
    //         nbOperation++;
    //         liste.add(new Retrait(nbOperation, new Date(), mt));
    //         totalretier += mt;
    //     }

    // }
}