package com.mycompany.exerciciosaula2poo;


public class Mouse {
    
    String marca;
    int qtdBotoes;
    float peso;
    boolean btnEsquerdo;
    
void ClicarEsquerdo(){
    
    if (this.btnEsquerdo == true){
        System.out.println("Aplicativo Aberto");
    }
    
    else {
        System.out.println("Configurações do aplicativo Abertas");
    }
}
 
void ApertarEsquerdo(){
    
    this.btnEsquerdo = true;
    
}

void ApertarDireito(){
    
    this.btnEsquerdo = false;
    
}
    
void Caracteristicas(){

    System.out.println("A marca do mouse é: " + this.marca);
    System.out.println("O mouse possui essa qtd de botões: " + this.qtdBotoes);
    System.out.println("O mouse pesa: " + this.peso);
    System.out.println("O botão esquerdo está pressionado? " + this.btnEsquerdo);
    
}

}