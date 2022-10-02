package me.dio.MentoriaIFoodDevWeek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.MentoriaIFoodDevWeek.enumeration.FormaPagamento;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor // Criar construtor com todos os atributos
@Builder // Criar objetos de forma simples
@Data // Getters and Setters
@Entity // Converter classe para uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignorar alguns erros do console
@NoArgsConstructor // Criar um construtor vazio, para criação de objetos

public class Sacola {
    @Id // Criar ID
    @GeneratedValue(strategy = GenerationType.AUTO) // Indicar auto incremento nos ids
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)

    @JsonIgnore
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;
}
