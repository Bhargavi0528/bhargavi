package test.example;

import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator_Test {
    @Test
    public void Testadd(){
        Main calculator = new Main();
        assertEquals(4,Main.add(2,2));
    }
    @Test
    public void Testsub(){
        Main calculator = new Main();
        assertEquals(6,Main.sub(8,2));
    }
    @Test
    public void Testmul(){
        Main calculator = new Main();
        assertEquals(8,Main.mul(2,4));
    }
    @Test
    public void Testdiv(){
        Main calculator = new Main();
        assertEquals(2,Main.div(6,3));
    }
    @Test
    public void Testdiv1(){
        Main calculator=new Main();
//        assertEquals(8,Main.div(6,0));
        assertThrows(ArithmeticException.class, () -> Main.div(6, 0));
    }

}
