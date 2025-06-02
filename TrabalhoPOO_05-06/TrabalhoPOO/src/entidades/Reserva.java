package entidades;

public class Reserva {
    private int idReserva;
    private double valor;
    private String dataEntrada;
    private String dataSaida;
    private boolean checkIn;
    private boolean checkOut;
    private Quarto quarto;
    private Hospede hospede;

    public Reserva(int idReserva, double valor, String dataEntrada, String dataSaida, boolean checkIn, boolean checkOut,
            Quarto quarto, Hospede hospede) {
        this.idReserva = idReserva;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.quarto = quarto;
        this.hospede = hospede;
    }

    public void mostrar() {
        System.out.println("ID da Reserva: " + idReserva);
        System.out.println("Valor: R$" + valor);
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("Data de Saída: " + dataSaida);

        String statusCheckin = checkIn ? "Sim" : "Não";
        String statusCheckout;

        if (checkOut && checkIn) {
            statusCheckout = "Sim";
        } else {
            statusCheckout = "Não";
        }
        System.out.println("Status Check-in: " + statusCheckin);
        System.out.println("Status Check-out: " + statusCheckout);
        hospede.mostrar();
        quarto.mostrar();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public double getValor() {
        return valor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}
