package excecoes;

import java.util.Date;

public class ExcecaoDominio extends Exception {
    private Date dataEntrada;
    private Date dataSaida;

    public ExcecaoDominio(Date dataEntrada, Date dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
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
    public String toString() {
        return "A data de entrada é igual ou depois da data de saída!";
    }
}
