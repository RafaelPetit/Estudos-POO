package Modelo;

public class ValidacaoTriangulo extends absPropriedades{

    public ValidacaoTriangulo(String lado1, String lado2, String lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void executar() {
        Estaticos.mensagem="";
        try {
            this.l1=Double.valueOf(this.lado1);
            this.l2=Double.valueOf(this.lado2);
            this.l3=Double.valueOf(this.lado3);
            
            if(this.l1+this.l2<this.l3 || this.l1+this.l3<l2 || this.l2+this.l3<this.l1)
                Estaticos.mensagem="Não é um triangulo";
            
        } 
        
        catch (NumberFormatException e) {
            Estaticos.mensagem="Erro de conversão";
        }
    }
    
           
}
