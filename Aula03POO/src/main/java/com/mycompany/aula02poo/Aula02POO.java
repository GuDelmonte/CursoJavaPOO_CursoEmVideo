
package com.mycompany.aula02poo;


public class Aula02POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f; // Referência ao atributo criado na classe Caneta
        c1.tampar(); // Referência ao método status criado na classe Caneta, por isso os () 
        c1.status(); // Referência ao método status criado na classe Caneta, por isso os ()
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Vermelha";
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
        
    }
}
