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

    
    public Double updateSolde() {
        return solde;
    }
    // @Override
    // public void updatSolde(double newSolde) {
    //     setSolde(newSolde);
    // }

    public String toString() {
        return super.toString() + " " + decouvert;
    }
    
    
}