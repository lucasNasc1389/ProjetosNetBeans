
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Datas {
    public static void main(String[] args) {
        // Apenas Datas
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalDate olimpiadasRio = LocalDate.of(2022, Month.JUNE, 5);
        
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        
        System.out.println(anos);
        
        Period periodo = Period.between(hoje, olimpiadasRio);
        
        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        
        System.out.println(proximasOlimpiadas);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);
        
        //Datas e horário
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));
        ZonedDateTime horaLocal = ZonedDateTime.now();
        System.out.println(horaLocal);
              
    }
}
