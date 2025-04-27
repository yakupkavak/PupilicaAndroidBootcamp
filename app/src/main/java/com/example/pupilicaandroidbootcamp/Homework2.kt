package com.example.pupilicaandroidbootcamp

import java.math.BigInteger
import kotlin.math.max
import kotlin.math.min

object Utils {

    // 1. Celsius → Fahrenheit
    fun celsiusToFahrenheit(celsius: Double): Double =
        celsius * 1.8 + 32.0

    // 2. Dikdörtgen çevresi
    fun rectanglePerimeter(edgeA: Double, edgeB: Double): Double =
        2 * (edgeA + edgeB)

    // 3. Faktöriyel
    fun factorial(n: Int): BigInteger {
        var result = BigInteger.ONE
        for (i in 2..n) result *= BigInteger.valueOf(i.toLong())
        return result
    }

    // 4. Kelimedeki ‘a’ harfi sayısı (büyük/küçük bağımsız)
    fun countLetterA(text: String): Int =
        text.lowercase().count { it == 'a' }

    // 5. Çokgen iç açıları toplamı
    fun interiorAngleSum(sideCount: Int): Int =
        (sideCount - 2) * 180

    // 6. Maaş hesabı (gün sayısına göre)
    fun salary(dayCount: Int): Int {
        val totalHours = dayCount * 8
        val normalHours = min(totalHours, 160)
        val overtimeHours = max(0, totalHours - 160)
        return normalHours * 10 + overtimeHours * 20
    }

    // 7. Kota ücreti (GB cinsinden)
    fun quotaCost(quotaGb: Int): Int =
        100 + max(0, quotaGb - 50) * 4
}
