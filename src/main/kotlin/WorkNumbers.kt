/**
 * Дано целое число из консоли ^ (до 10 знаков).
 * Нужно:
 * 1) найти первую и последнюю цифры числа
 * 2) определить, является ли сумма цифр этого числа четным числом
 * 3) написать тест
 */
fun main(vararg args: String) {
    // val string = readLine()
    // if (string != null) {
    getAndValidateMessageArray(args[0] /*string*/).forEach { x -> println(x) }
}

fun getAndValidateMessageArray(str: String): Array<String> {
    return try {
        str.toLong()
        getMessageArray(str)
    } catch (ex: Exception) {
        arrayOf("Введены не корректные данные")
    }
}

private fun getMessageArray(str: String): Array<String> {
    if (str.length > 10) {
        return arrayOf("Введите не более 10 цифр")
    }
    return arrayOf(
        "Первое число: " + str.first(),
        "Последнее число: " + str.last().toString(),
        "Сумма цифр - " + if (countNumericValue(str))  "четное число" else "нечетное число"
    )
}

private fun countNumericValue(value: String): Boolean {
    return value.chars().map { x -> Character.getNumericValue(x) }.sum() % 2 == 0
}
