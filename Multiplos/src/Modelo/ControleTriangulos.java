package Modelo;

public class ControleTriangulos extends absPropriedades{

    public ControleTriangulos(String lado1, String lado2, String lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void executar() {
        absPropriedades validacaoT = new ValidacaoTriangulo(this.lado1, this.lado2, this.lado3);
        if(Estaticos.mensagem.equals(""))
        {
            absPropriedades triangulos = new triangulos(validacaoT.l1, validacaoT.l2, validacaoT.l3);
            this.lado1=triangulos.toString();
            
        }
    }

    @Override
    public String toString() {
        return this.lado1;
    }
    
}
