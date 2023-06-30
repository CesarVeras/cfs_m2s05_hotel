import entidades.Reserva;
import excecoes.ExcecaoDominio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        reservarQuarto();
        reservas.forEach(System.out::print);
    }

    public static void reservarQuarto() {
        Date dataEntrada, dataSaida;

        System.out.println("Cadastro de reserva");

        System.out.println("Informe o número do quarto: ");
        int numero = s.nextInt();

        System.out.println("Informe a data de entrada(dd/mm/aaaa):");
        String data = s.next();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            dataEntrada = sdf.parse(data);

            System.out.println("Informe a data de saída(dd/mm/aaaa):");
            data = s.next();
            dataSaida = sdf.parse(data);
            try {
                Reserva r = new Reserva(numero, dataEntrada, dataSaida);
                verificarDataValida(dataEntrada, dataSaida);
                reservas.add(r);
            } catch (ExcecaoDominio e) {
                System.out.println(e);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void verificarDataValida(Date d1, Date d2) throws ExcecaoDominio {
        if(d1.after(d2) || d1.equals(d2)){
            throw new ExcecaoDominio(d1, d2);
        }
    }
}
