package models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Cartao {

    private String numero;
    private String titular;
    private String validade;
    private String cvv;
    private Conta conta;

    public void realizarPagamento(double valor) {
        conta.sacar(valor);
    }
}
