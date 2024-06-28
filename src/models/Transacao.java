package models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {
    private LocalDateTime dataHora;
    private String descricao;
    private double valor;
    private Conta conta;

    public void imprimirDetalhes() {
        System.out.printf("Data/Hora: %s%n", this.dataHora.toString());
        System.out.printf("Descrição: %s%n", this.descricao);
        System.out.printf("Valor: %.2f%n", this.valor);
        System.out.printf("Conta: %d%n", this.conta.getNumero());
    }
}

