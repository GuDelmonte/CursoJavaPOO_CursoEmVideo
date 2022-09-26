 package com.mycompany.aula11;

public class Bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
   @Override //sobreposição de método 
    public void pagarMensalidade(){
       System.out.println(this.nome + " é bolsista! Pagamento diferenciado");
    }
    
}
