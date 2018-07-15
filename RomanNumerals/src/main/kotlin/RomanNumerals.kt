class RomanNumerals {
    enum class Romans(val value: Int) {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),
        XC(90),
        C(100);

        fun isStartOf(romanNumber: String): Boolean = romanNumber.startsWith(this.name)
        fun drop(romanNumber: String): String = romanNumber.drop(this.name.length)
        fun containedIn(arabicNumber: Int): Boolean = arabicNumber >= this.value

        companion object {
            val sortedByValue = values().sortedByDescending { it.value }
            val sortedByLength = values().sortedByDescending { it.name.length }
        }
    }

    fun toArabic(romanNumber: String): Int =
            if (romanNumber.isEmpty()) 0
            else {
                val roman = Romans.sortedByLength.first { r -> r.isStartOf(romanNumber) }
                roman.value + toArabic(roman.drop(romanNumber))
            }

    fun toRoman(arabicNumber: Int): String =
            if (arabicNumber == 0) ""
            else {
                val roman = Romans.sortedByValue.first { r -> r.containedIn(arabicNumber)}
                roman.name + toRoman(arabicNumber - roman.value)
            }
}