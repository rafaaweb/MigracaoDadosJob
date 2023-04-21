package com.springbatch.migracaodados.dominio;

import lombok.Data;

import java.util.Date;

@Data
public class Pessoa {

    private int id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private int idade;
}
