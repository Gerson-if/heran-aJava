
package aula11heranca;
public class Bolsista extends Aluno {
    private float bolsa;
    
    
    public void renovarBolsa(){
        System.out.println("ronovando bolsa de " + this.getNome());
    
    }
    
    
    @Override //aqui estamos sobrepondo o metodo, pois essa clase e filha de aluno
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " e bolsista pagamento melhor pra ele");
    
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
