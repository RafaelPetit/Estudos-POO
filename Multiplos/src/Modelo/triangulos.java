package Modelo;

import java.util.Objects;

public class triangulos extends absPropriedades{

    public triangulos(Double l1, Double l2, Double l3) {
        super(l1, l2, l3);
    }

    @Override
    public void executar() {
        if(Objects.equals(this.l1, this.l2) & Objects.equals(this.l2, this.l3) )
        {
            this.resposta="Triangulo Equilátero";
        }
        
        else
        {
            if(!Objects.equals(this.l1, this.l2) & !Objects.equals(this.l1, this.l3) & !Objects.equals(this.l2, this.l3))
                this.resposta="Triangulos Escaleno";
            else
                this.resposta="Triangulos isóceles";
        }
    }

    @Override
    public String toString() {
        return this.resposta;
    }
    
}
