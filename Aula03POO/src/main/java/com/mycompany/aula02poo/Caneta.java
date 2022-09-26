
package com.mycompany.aula02poo;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        
        if (this.tampada == true){
            
            System.out.println("Erro, não posso rabiscar");
        } 
        
        else {
        
            System.out.println("Estou rabiscando");
            
        }
}
    // o void siginifica "SEM RETORNO"
    
    void tampar() {
        
        this.tampada = true; //this é uma referência ao próprio objeto que chamouo método
        
    }
    
    void destampar(){
        
        this.tampada = false;
        
    }
}    