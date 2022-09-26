
package com.mycompany.aula11;

public class Aula11 {

    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa();
       
       Visitante v1= new Visitante();
      
      /* v1.setNome("Raimundo");
       v1.setIdade(22);
       v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        
       /* a1.setNome ("Gustavo");
        a1.setMatricula(403);
        a1.setCurso("Desenvolvimento de Sistemas");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();*/
       
       Professor p1 = new Professor();
       
        
      /* p1.setNome("Maligno");
       p1.setIdade(45);
       p1.setSexo("M"); 
       System.out.println(p1.toString());
       p1.setSalario(500.0f);
       p1.receberAumento();*/
    
       Técnico t1 = new Técnico();
       
       t1.setNome("Guanabara");
       t1.setIdade(40);
       t1.setSexo("M");       
       t1.setCurso("Desenvolvimento de Sistemas");
       System.out.println(t1.toString());
       t1.praticar();
    
    }
}
