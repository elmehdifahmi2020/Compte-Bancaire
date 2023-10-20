import java.util.Date;
import java.util.ArrayList;

public class Compte {
   private int code;
   protected double solde;
   private StCompte statut;
   public  int nbOperation;
   static int nbComptes;
   private  double totalretier;
   ArrayList<Operation> liste=new ArrayList<>();

   enum StCompte {
    CREATE, SUSPEND, DELETE, BLOCK
   }

   public Compte(double solde) {
        this.code = ++nbComptes;
        this.solde = solde;
        this.statut = statut;
   }
   public Compte(){
        StCompte statut = StCompte.CREATE;
        this.solde = 0;
        this.code = ++nbComptes;
    }

   public int getCode() {
      return this.code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public double getSolde() {
      return this.solde;
   }

   public void setSolde(double solde) {
      this.solde = solde;
   }

   
   double totalverser = 0;
   public void verser(double mt){
               solde += mt;
               totalverser += mt;
               ++nbOperation;
               liste.add(new Versement(nbOperation,new Date(),mt));
            }
         
   
   public void retirer(double mt) {
        if (mt <= solde) {
                 solde -= mt;
                 totalretier +=mt;
                 ++nbOperation;
                 liste.add(new Retrait(nbOperation,new Date(),mt));

            }
        }

   public void Versement(double mt, Compte C){
    this.retirer(mt);
    C.verser(mt);
    totalverser += mt;
   }

   public String totalRetrait(){
        return "le total de retrait est : "+totalretier;
    }

    public String  totalVersment(){
        return "le totqle de versment est : "+ totalverser;
    }

   public void getOperationLIst() {
        for (Operation e : liste) {
            System.out.println(e.toString());
        }

    }
   public Double updateSolde() {
      return this.solde;
   }

    
   public String toString() {
      return "le code est :" + this.getCode() + " et solde :" + this.getSolde();
   }
}