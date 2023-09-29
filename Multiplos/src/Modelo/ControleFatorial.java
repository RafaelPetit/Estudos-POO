package Modelo;

public class ControleFatorial extends absPropriedades{

    public ControleFatorial(String numero) {
        super(numero);
    }

    @Override
    public void executar() {
        absPropriedades validacaoF = new ValidacaoFatorial(this.numero);
        if(Estaticos.mensagem.equals(""))
        {
            CalculoFatorial calculof = new CalculoFatorial(validacaoF.num);
            this.numero=calculof.toString();
        }
             
    }

    @Override
    public String toString() {
        return this.numero;
    }
    
}
