package entidades;

import excecoes.ExcecaoDominio;

import java.util.Date;
import java.util.Objects;

public class Reserva {

    private int numeroQuarto;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(int numeroQuarto, Date dataEntrada) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
    }

    public Reserva(int numeroQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return numeroQuarto == reserva.numeroQuarto && Objects.equals(dataEntrada, reserva.dataEntrada) && Objects.equals(dataSaida, reserva.dataSaida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroQuarto, dataEntrada, dataSaida);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numeroQuarto=" + numeroQuarto +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                '}';
    }
}
