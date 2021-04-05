package serie1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import parte1.hIndex

class HIndexClass {

    @Test
    fun hIndex_OnEmptyArray() {
        val v1 = IntArray(0)
        val hIndex: Int = hIndex(v1)
        assertEquals(-1, hIndex)
    }

    @Test
    fun hIndex_SingleElementArray() {
        val v1 = intArrayOf(3)
        val hIndex: Int = hIndex(v1)
        assertEquals(1, hIndex)
    }

    @Test
    fun hIndex_WithSmallerElementsOrdered() {
        val v1 = intArrayOf(7, 8, 10, 15, 17)
        val hIndex: Int = hIndex(v1)
        assertEquals(5, hIndex)
    }

    @Test
    fun hIndex_WithSmallerElementsUnOrdered() {
        val v1 = intArrayOf(10, 8, 7, 17, 5)
        val hIndex: Int = hIndex(v1)
        assertEquals(5, hIndex)
    }

    @Test
    fun hIndex_WithGreaterElementsAndWithEquals() {
        val v1 = intArrayOf(8, 17, 15, 10, 8)
        val hIndex: Int = hIndex(v1)
        assertEquals(5, hIndex)
    }

    @Test
    fun hIndex_WithGreaterElements() {
        val v1 = intArrayOf(2, 8, 6, 5, 7)
        val hIndex: Int = hIndex(v1)
        assertEquals(4, hIndex)
    }

    @Test
    fun hIndex_WithSmallerElementsAndWithEquals() {
        val v1 = intArrayOf(1, 2, 2, 3, 3)
        val hIndex: Int = hIndex(v1)
        assertEquals(2, hIndex)
    }


    @Test
    fun hIndex_On_An_Array() {
        val v1 = intArrayOf(3, 7, 2, 10, 6, 9, 1, 8)
        val hIndex: Int = hIndex(v1)
        assertEquals(5, hIndex)
    }
}