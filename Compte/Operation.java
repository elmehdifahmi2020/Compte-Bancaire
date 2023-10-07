import java.util.Date;

public  class  Operation{

    private  int numero;
    private Date dateOp ;
    private double montant ;


    public Operation(Integer numero, Date dateOp,double montant){
       
        this.numero = numero;
        this.dateOp = dateOp;
        this.montant = montant;
    }
    public Operation(){
        this.numero = 0;
        this.dateOp = new Date();
        this.montant = 0 ;
    }

    public  String toString(){

        return ("le code est :"+numero+"et le montant est :"+montant+" et la date est "+dateOp);
    }
}
