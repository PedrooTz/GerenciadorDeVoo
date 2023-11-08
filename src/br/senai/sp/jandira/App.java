package br.senai.sp.jandira;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;
import br.senai.sp.jandira.model.VooGol;

public class App {
    public static void main(String[] args) {

    VooDelta vooDelta1 = new VooDelta("São Paulo", "Grécia", "Delta", "12-02-2032", "12:32", "2023-12-22", "2023-12-22", 200, 12);
        System.out.println("Companhia: " +vooDelta1.getCompanhia());
        System.out.println("Origem: " +vooDelta1.getOrigem());
        System.out.println("Destino: " + vooDelta1.getDestino());
        System.out.println("Data Partida: " +vooDelta1.getDataPartida());
        System.out.println("Data Chegada: " +vooDelta1.getDataChegada());
        System.out.println("_____________________________________________________________________________");
    VooGol vooGol1 = new VooGol("Carapicuíba", "São José dos Campos", "Gol","09:00", "13:00","2023-09-32","2023-09-32", 100, 13);
        System.out.println("Companhia: " +vooGol1.getCompanhia());
        System.out.println("Origem: " +vooGol1.getOrigem());
        System.out.println("Destino: " +vooGol1.getDestino());
        System.out.println("Data Partida: " +vooGol1.getDataPartida());
        System.out.println("Data Chegada: " +vooGol1.getDataChegada());
        System.out.println("_____________________________________________________________________________");
    VooEmirates vooEmirates1 = new VooEmirates("Sergipe","Miami","Emirates","23:59","06:00", "2023-04-24","2023-04-24",150, 15);
        System.out.println("Companhia: " +vooEmirates1.getCompanhia());
        System.out.println("Origem: " + vooEmirates1.getOrigem());
        System.out.println("Destino: " +vooEmirates1.getDestino());
        System.out.println("Data partida: " +vooEmirates1.getDataPartida());
        System.out.println("Data Chegada: " +vooEmirates1.getDataChegada());
        System.out.println("_____________________________________________________________________________");
    }
}