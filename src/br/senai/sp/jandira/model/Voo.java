package br.senai.sp.jandira.model;

import java.time.LocalDate;

abstract class Voo {

    private String origem, destino, companhia, horaPartida, horaChegada;
    private LocalDate dataPartida, dataChegada;
    private int capacidadePsg, numeroVoo;



     public Voo(String origem, String destino, String companhia, String horaPartida, String horaChegada, LocalDate dataPartida, LocalDate dataChegada, int capacidadePsg, int numeroVoo){
        this.origem = origem;
        this.destino = destino;
        this.companhia = companhia;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.dataPartida = dataChegada;
        this.capacidadePsg = capacidadePsg;
        this.numeroVoo = numeroVoo;

    }


    }
