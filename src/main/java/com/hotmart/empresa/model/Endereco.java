package com.hotmart.empresa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Endereco{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;

        @Column(nullable = false, length = 200)
        private String pais;

        @Column(nullable = false, length = 200)
        private String uf;

        @Column(nullable = false, length = 200)
        private String cidade;

        @Column(nullable = false, length = 200)
        private String rua;

        @Column(nullable = false, length = 200)
        private String cep;

}
