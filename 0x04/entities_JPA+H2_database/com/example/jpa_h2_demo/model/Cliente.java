package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String cpf;
    
    @Column(nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefone> telefones = new ArrayList<>();
    
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Endereco endereco;
    
    // Construtores
    public Cliente() {}
    
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public List<Telefone> getTelefones() { return telefones; }
    public void setTelefones(List<Telefone> telefones) { this.telefones = telefones; }
}