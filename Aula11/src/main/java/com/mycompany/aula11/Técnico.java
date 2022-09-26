package com.mycompany.aula11;

public final class Técnico extends Aluno {
    private String registroProfissional;
    
    public void praticar(){
        System.out.println("o Aluno " + this.nome + " Matriculado no curso de "
        + this.curso + " Está praticando");
    }
}
