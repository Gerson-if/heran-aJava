
package aula11heranca;
public class Professor {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float salario){
    
        System.out.println("recebendo aumento de");
        this.setSalario(salario);
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
