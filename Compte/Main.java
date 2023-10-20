public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Compte C1 = new Compte(4000);
      Compte C2 = new CompteCourant(300,100);
      // C2.retirer(300);
      
      C2.verser(300);
      System.out.println(C2.toString());
      C2.getOperationLIst();


      // C1.Versement(100,C2);
      // C1.verser(600);
      // C1.verser(600);   
      // C1.retirer(700);
      // C1.retirer(700);

      // System.out.println(C2.updateSolde());
      // System.out.println(C1.updateSolde());
      
      // // System.out.println(C1.toString());
      // C1.getOperationLIst();
      // // System.out.println(C1.totalRetrait());
      // System.out.println(C1.totalVersment());
      
   }
}