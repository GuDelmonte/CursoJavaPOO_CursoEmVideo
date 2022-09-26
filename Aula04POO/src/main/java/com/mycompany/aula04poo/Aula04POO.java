
package com.mycompany.aula04poo;


public class Aula04POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC",0.8f,"Verde");
        
        System.out.println("DETALHES DA CANETA: ");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: " + c1.getPonta());
        System.out.println("Cor: " + c1.getCor());
        
    }
        
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //------------------Aprendendo Geters e Seters---------------------
        
        
        /* os métodos get e set servem para proteger o atributo de ser alterado 
        diretamente "por qulquer pessoa". Eles são os responsáveis por acessar
        o atributo */
        
        //c1.setModelo("Bic Cristal"); //utilização do método acessor do atributo
        /*c1.modelo = "BIC"; -> tentativa de acesso direto ao atributo, 
                                Não vai funcionar pois "modelo" é private*/
        
        //c1.setPonta(0.5f);
        /*c1.ponta = 0.5f; -> tentativa de acesso direto ao atributo, 
                              não vai funcionar pois "ponta" é private*/
        
        /* System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " +
        c1.getPonta());*/
    

