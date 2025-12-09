package com.example.jpa_h2_demo.model;
@Entity
@Table(name = "enderecos")
public class Endereco {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        @Column(nullable = false)
        private String logradouro;

        private String endereco;
        
        @Column(nullable = false)
        private String numero;
        
        
        @Column(nullable = false)
        private String bairro;
        
        @Column(nullable = false)
        private String cidade;
        
        @Column(nullable = false)
        private String estado;        
        
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "cliente_id", nullable = false)
        private Cliente cliente;
        
        // Construtores
        public Endereco() {}
        
       
        // Getters e Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getLogradouro() { return logradouro; }
        public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
        
        public String getNumero() { return numero; }
        public void setNumero(String numero) { this.numero = numero; }
        
        public String getComplemento() { return complemento; }
        public void setComplemento(String complemento) { this.complemento = complemento; }
        
        public String getBairro() { return bairro; }
        public void setBairro(String bairro) { this.bairro = bairro; }
    }