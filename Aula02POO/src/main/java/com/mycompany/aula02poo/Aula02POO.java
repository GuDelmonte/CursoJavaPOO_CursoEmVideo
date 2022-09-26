
package com.mycompany.aula02poo;


public class Aula02POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; /*por mais que a classe de carga seja protected eu con
                         consegui altera-la pois dentro da clase "Aula02POO"
                         eu tenho um método principal que está utilizando o 
                         objeto "c1" que é da classe "Caneta"*/ 
         // c1.tampada = false;
         c1.tampar();
        c1.status(); // Referência ao método status criado na classe Caneta, por isso os ()
        c1.rabiscar();
       
        
        
        
        
    }
}
