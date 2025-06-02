package app;

import entidades.Hospede;
import entidades.Quarto;
import entidades.Reserva;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarto q1 = new Quarto(1, "001");
        Hospede h1 = new Hospede("111", "carlin", 19, "234234", true);
        Reserva reserva1 = new Reserva(1, 50.0, "25/05", "27/05", true, true, q1, h1);
        
        reserva1.mostrar();
    }
}
