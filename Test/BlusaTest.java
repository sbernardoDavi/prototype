import org.junit.Test;
import static org.junit.Assert.*;

class BlusaTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Blusa blusa = new Blusa(1,"GG", new Marca("Adidas"));

        Blusa blusaClone = blusa.clone();
        blusaClone.setId(2);
        blusaClone.setTamanho("GG");
        blusaClone.getMarca().setNome("Nike");

        assertEquals("Blusa{id=1, tamanho='GG', marca=Marca{'Adidas'}", blusa.toString());
        assertEquals("Blusa{id=2, tamanho='GG', marca=Marca{'Nike'}", blusaClone.toString());
    }



}