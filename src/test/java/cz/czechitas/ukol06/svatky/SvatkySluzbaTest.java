package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni
            SvatkySluzba seznamSvatku = new SvatkySluzba();
            assertEquals(List.of("Diana"), seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(1, 4)));
            assertEquals(List.of("Adam", "Eva", "Gaia", "Kračun"), seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(12, 24)));
            //assertNull(seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(2, 30)));
            //den bez svatku neni:(
    }
}
