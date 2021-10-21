package test.Servicios;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestarLibroQueNoHaPrestado (){
        Libro miLibro = new Libro ("Mob Dick", "Hnernan Melville");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            assertTrue(true);
        } catch (Exception ex){
            fail();
        }
    }
    @Test
    public void testPrestarLibroPrestado (){
        Libro miLibro = new Libro ("Mob Dick", "Hnernan Melville");
        miLibro.setPrestado(true);
        Libreria mLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            fail();
        } catch (Exception ex){
            assertTrue(true);
        }
    }
@Test
    public void testDevolver (){
        Libro miLibro = new Libro ("Mob Dick", "Hnernan Melville");
        Libreria mLibreria = new Libreria();
        try{
            miLibreria.devolver(miLibro);
            fail();
        } catch (Exception ex){
            assertTrue(true);
        }

    }
}
