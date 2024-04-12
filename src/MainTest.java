import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testTask1() {
        assertEquals("correct", Main.task1(0));
        assertEquals("incorrect", Main.task1(1));
        assertEquals("incorrect", Main.task1(-3));
    }

    @Test
    public void testTask2() {
        assertEquals("correct", Main.task2(1));
        assertEquals("incorrect", Main.task2(0));
        assertEquals("incorrect", Main.task2(-3));
    }

    @Test
    public void testTask3() {
        assertEquals("correct", Main.task3(-3));
        assertEquals("incorrect", Main.task3(0));
        assertEquals("incorrect", Main.task3(1));
    }

    @Test
    public void testTask4() {
        assertEquals("correct", Main.task4(0));
        assertEquals("correct", Main.task4(1));
        assertEquals("incorrect", Main.task4(-3));
    }

    @Test
    public void testTask5() {
        assertEquals("correct", Main.task5(0));
        assertEquals("incorrect", Main.task5(1));
        assertEquals("correct", Main.task5(-3));
    }

    @Test
    public void testTask6() {
        assertEquals("incorrect", Main.task6(0));
        assertEquals("correct", Main.task6(1));
        assertEquals("correct", Main.task6(-3));
    }

    @Test
    public void testTask7() {
        assertEquals("correct", Main.task7("test"));
        assertEquals("incorrect", Main.task7("test1"));
    }

    @Test
    public void testTask8() {
        assertEquals("correct", Main.task8(1));
        assertEquals("incorrect", Main.task8(0));
        assertEquals("incorrect", Main.task8(-1));
    }

    @Test
    public void testTask9() {
        assertEquals("correct", Main.task9(true));
        assertEquals("incorrect", Main.task9(false));
    }

    @Test
    public void testTask10() {
        assertEquals("correct", Main.task10(false));
        assertEquals("incorrect", Main.task10(true));
    }

    @Test
    public void testTask11() {
        assertEquals("correct", Main.task11(2));
        assertEquals("correct", Main.task11(4));
        assertEquals("incorrect", Main.task11(5));
    }

    @Test
    public void testTask12() {
        assertEquals(12, Main.task12(5));
        assertEquals(7, Main.task12(0));
        assertEquals(-3, Main.task12(-3));
        assertEquals(9, Main.task12(2));
    }


    @Test
    public void testTask13() {
        assertEquals("sum:4", Main.task13(1, 3));
        assertEquals("sub:-6", Main.task13(0, 6));
        assertEquals("sub:-2", Main.task13(3, 5));
    }

    @Test
    public void testTask14() {
        assertEquals("correct", Main.task14(7, 6));
        assertEquals("correct", Main.task14(0, 2));
        assertEquals("incorrect", Main.task14(43, 35));
    }

    @Test
    public void testTask15() {
        assertNotNull(Main.task15());
    }

    @Test
    public void testTask16() {
        assertNotNull(Main.task16());
    }

    @Test
    public void testTask17() {
        assertNotNull(Main.task17());
    }

    @Test
    public void testTask18() {
        assertEquals("yup", Main.task18("abcde"));
        assertEquals("nah", Main.task18("bcde"));
    }

    @Test
    public void testTask19() {
        assertEquals("yup", Main.task19("12345"));
        assertEquals("nah", Main.task19("67890"));
        assertEquals("pustota", Main.task19(""));
    }

    @Test
    public void testTask20() {
        assertEquals("Сумма цифр: 6", Main.task20("123"));
        assertEquals("Строка не содержит 3 цифры", Main.task20("12"));
    }

    @Test
    public void testTask21() {
        assertEquals("yup", Main.task21("123123"));
        assertEquals("nah", Main.task21("123456"));
        assertEquals("Строка не содержит 6 цифр", Main.task21("123"));
    }
}
