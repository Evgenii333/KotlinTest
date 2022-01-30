import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WorkNumbersTest {
    @Test
    fun getAndValidateMessageArray() {
        val str = getAndValidateMessageArray("1632165983")

        assertEquals("Первое число: 1", str[0])
        assertEquals("Последнее число: 3", str[1])
        assertEquals("Сумма цифр - четное число", str[2])
    }
    @Test
    fun getAndValidateMessageArrayIncorrectCountNumbers() {
        val str = getAndValidateMessageArray("16321659838")

        assertEquals("Введите не более 10 цифр", str[0])
    }

    @Test
    fun getAndValidateMessageArrayIncorrectInput() {
        val str = getAndValidateMessageArray("163216Х5938")

        assertEquals("Введены не корректные данные", str[0])
    }
}