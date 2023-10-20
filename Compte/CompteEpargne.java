public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(){
        solde = 0;
        taux = 5;
    }
    public CompteEpargne(double solde){
        super(solde);
        taux = 5;
    }




    public Double calculInterets(){
      return  solde *= 1+taux/100;
    }

    
    public Double updateSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return super.toString()+" le taux est : "+taux+" et Interets est : "+calculInterets();
    }
}