
package com.mycompany.aula06poo;

public interface Controlador {
    
    public abstract void ligar(); //void é colocado quando o método não retorna nada
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
