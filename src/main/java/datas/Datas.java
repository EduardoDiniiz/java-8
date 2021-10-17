package datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataFutura = LocalDate.of(2021, Month.OCTOBER, 25);

        int anos = dataFutura.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, dataFutura);

        System.out.println(periodo.getDays());

        LocalDate maisQuatroAnos = dataFutura.plusYears(4);

        System.out.println(maisQuatroAnos);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = maisQuatroAnos.format(formatador);

        System.out.println(valorFormatado);

        DateTimeFormatter formatadorDataMinutos = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora.format(formatadorDataMinutos));

        LocalTime intervalo = LocalTime.of(15, 30);

        System.out.println(intervalo);
    }
}
