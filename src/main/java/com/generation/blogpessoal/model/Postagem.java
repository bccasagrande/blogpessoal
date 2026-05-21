package com.generation.blogpessoal.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
@EntityListeners(AuditingEntityListener.class)
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório!")
    @Size(min = 5, max = 100, message = "O título deve ter entre 5 e 100 caracteres")
    private String titulo;

    @NotBlank(message = "O texto é obrigatório!")
    @Size(min = 10, max = 1000, message = "O texto deve ter entre 10 e 1000 caracteres")
    private String texto;

    @CreatedDate
    private LocalDateTime data;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
}
