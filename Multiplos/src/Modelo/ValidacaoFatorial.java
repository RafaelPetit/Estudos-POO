package Modelo;

public class ValidacaoFatorial extends absPropriedades{

    public ValidacaoFatorial(String numero) {
        super(numero);
    }

    @Override
    public void executar() {
        try {
            Estaticos.mensagem="";
            
            this.num=Integer.valueOf(numero);
            
            if(this.num<0)
                Estaticos.mensagem="Numero negativo";
        } 
        
        catch (NumberFormatException e) {
            Estaticos.mensagem="Erro de conversão";
        }
    }
    
}
