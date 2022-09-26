package com.mycompany.aula11;

public final class Professor extends Pessoa{

    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        System.out.println("salário antigo: " + this.salario);
        this.salario = this.salario + (15.50f);
        System.out.println("Esse é o novo salário do professor " + 
                this.nome + ": " + this.salario);
        
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
