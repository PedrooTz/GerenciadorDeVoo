package br.senai.sp.jandira;


import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooGol;

public class App {
    public static void main(String[] args) {

        VooDelta vooDelta = new VooDelta("São Paulo", "Grécia", "Delta", "23:00");
        VooGol vooGol = new VooGol("RJ", "SP", "Gol","23:12", "1:00", "2023-12-25", "2023-09-23","210","12");
    }
}
