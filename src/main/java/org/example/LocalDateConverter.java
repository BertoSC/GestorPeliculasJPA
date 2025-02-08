package org.example;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter <LocalDate, Integer> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    @Override
    public Integer convertToDatabaseColumn(LocalDate localDate) {
        /*String [] fecha= localDate.toString().split("-");
        String fechaString = fecha[0]+fecha[1]+fecha[2];
        return Integer.parseInt(fechaString);*/
        String fecha = localDate.format(FORMATTER);
        return Integer.parseInt(fecha);

    }

    @Override
    public LocalDate convertToEntityAttribute(Integer integer) {

        LocalDate fecha = LocalDate.parse(integer.toString(), FORMATTER);
        return fecha;
    }
}
