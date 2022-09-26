
package com.mycompany.projetolivro;


public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa ("Julia",17,"F");
        p[1] = new Pessoa ("Gustavo", 18, "M");
        
        l[0] = new Livro ("O Mágico de Oz","L Franklin", 50, p[0]);
        l[1] = new Livro ("Casos criminais", "Gordão", 100, p[1]);
        l[0] = new Livro ("Barbie princesa", "Disney", 20, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(20);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
}
