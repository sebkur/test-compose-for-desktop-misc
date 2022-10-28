import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SimpleTestJunit {
    @Test
    fun testSomething() {
        println("foo")
        assertTrue(true)
    }
}
