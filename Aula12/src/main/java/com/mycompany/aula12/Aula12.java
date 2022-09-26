package com.mycompany.aula12;

public class Aula12 {

    public static void main(String[] args) {

        //Animal a1 = new Animal(); vai dar erro pois está tentando instanciar uma classe abstrata
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldenFish g = new GoldenFish();
        Arara e = new Arara();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        
    }
}
