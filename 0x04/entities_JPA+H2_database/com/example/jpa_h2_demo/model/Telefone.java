package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        @Column(nullable = false)
        private String numero;
        
        @Column(nullable = false)
        private String tipo; // Ex: "residencial", "comercial", "celular"
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "cliente_id", nullable = false)
        private Cliente cliente;
        
        // Construtores
        public Telefone() {}
        
        public Telefone(String numero, String tipo) {
            this.numero = numero;
            this.tipo = tipo;
        }
        
        // Getters e Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getNumero() { return numero; }
        public void setNumero(String numero) { this.numero = numero; }
        
        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
        
        public Cliente getCliente() { return cliente; }
        public void setCliente(Cliente cliente) { this.cliente = cliente; }
    }