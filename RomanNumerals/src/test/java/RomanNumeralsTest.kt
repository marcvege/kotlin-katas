import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test


class RomanNumeralsTest {
    private val converter: RomanNumerals = RomanNumerals()

    @Test
    fun should_return_arabic_numeral_from_roman_number() {
        assertThat(converter.toArabic("I"), `is`(1))
        assertThat(converter.toArabic("II"), `is`(2))
        assertThat(converter.toArabic("III"), `is`(3))
        assertThat(converter.toArabic("IV"), `is`(4))
        assertThat(converter.toArabic("V"), `is`(5))
        assertThat(converter.toArabic("VI"), `is`(6))
        assertThat(converter.toArabic("VII"), `is`(7))
        assertThat(converter.toArabic("VIII"), `is`(8))
        assertThat(converter.toArabic("IX"), `is`(9))
        assertThat(converter.toArabic("X"), `is`(10))
        assertThat(converter.toArabic("XI"), `is`(11))
        assertThat(converter.toArabic("XII"), `is`(12))
        assertThat(converter.toArabic("XIII"), `is`(13))
        assertThat(converter.toArabic("XIV"), `is`(14))
        assertThat(converter.toArabic("XV"), `is`(15))
        assertThat(converter.toArabic("XVI"), `is`(16))
        assertThat(converter.toArabic("XIX"), `is`(19))
        assertThat(converter.toArabic("XX"), `is`(20))
        assertThat(converter.toArabic("XXIV"), `is`(24))
        assertThat(converter.toArabic("XXV"), `is`(25))
        assertThat(converter.toArabic("XLI"), `is`(41))
        assertThat(converter.toArabic("L"), `is`(50))
        assertThat(converter.toArabic("LV"), `is`(55))
        assertThat(converter.toArabic("LXXXVIII"), `is`(88))
        assertThat(converter.toArabic("XCIX"), `is`(99))
        assertThat(converter.toArabic("C"), `is`(100))
    }

    @Test
    fun should_return_roman_numeral_from_arabic_number() {
        assertThat(converter.toRoman(1), `is`("I"))
        assertThat(converter.toRoman(2), `is`("II"))
        assertThat(converter.toRoman(3), `is`("III"))
        assertThat(converter.toRoman(4), `is`("IV"))
        assertThat(converter.toRoman(5), `is`("V"))
        assertThat(converter.toRoman(6), `is`("VI"))
        assertThat(converter.toRoman(7), `is`("VII"))
        assertThat(converter.toRoman(9), `is`("IX"))
        assertThat(converter.toRoman(10), `is`("X"))
        assertThat(converter.toRoman(11), `is`("XI"))
        assertThat(converter.toRoman(14), `is`("XIV"))
        assertThat(converter.toRoman(15), `is`("XV"))
        assertThat(converter.toRoman(16), `is`("XVI"))
        assertThat(converter.toRoman(19), `is`("XIX"))
        assertThat(converter.toRoman(20), `is`("XX"))
        assertThat(converter.toRoman(21), `is`("XXI"))
        assertThat(converter.toRoman(21), `is`("XXI"))
        assertThat(converter.toRoman(24), `is`("XXIV"))
        assertThat(converter.toRoman(50), `is`("L"))
        assertThat(converter.toRoman(55), `is`("LV"))
        assertThat(converter.toRoman(88), `is`("LXXXVIII"))
        assertThat(converter.toRoman(99), `is`("XCIX"))
        assertThat(converter.toRoman(100), `is`("C"))
    }
}