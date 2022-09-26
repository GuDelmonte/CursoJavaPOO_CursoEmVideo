 package com.mycompany.aula11;

public class Aluno extends Pessoa {
   
    protected int matricula;
    protected String curso;
    
    public void pagarMensalidade(){
        System.out.println("pagando a mensalidade do aluno " + this.nome);
        }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
