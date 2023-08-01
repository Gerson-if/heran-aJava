
package aula11heranca;

public class Aula11Heranca {

    public static void main(String[] args) {
       Visitante v1 = new Visitante();
       v1.setNome("juvenal");
       v1.setIdade(22);
       v1.setSexo("m");
       System.out.println(v1.toString());
       
       Aluno a1 = new Aluno();
       a1.setNome("claudia");
       a1.setMatricula(12345);
       a1.setCurso("informatica");
       a1.setIdade(23);
       a1.pagarMensalidade();
        System.out.println("" + a1.toString());
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1245);
       b1.setBolsa(12.5f);
       b1.setNome("jubileu");
       b1.setSexo("m");
       b1.pagarMensalidade();
        System.out.println("" + b1.toString());
       
       
        
    }
    
}
