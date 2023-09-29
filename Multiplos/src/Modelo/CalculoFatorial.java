package Modelo;

public class CalculoFatorial extends absPropriedades{

    public CalculoFatorial(Integer num) {
        super(num);
    }

    @Override
    public void executar() {
        int Cont = this.num;
        for(int i = 1; i<Cont; i++)
            num *= i;
    }

    @Override
    public String toString() {
        return num.toString();
    }
    
    
}
