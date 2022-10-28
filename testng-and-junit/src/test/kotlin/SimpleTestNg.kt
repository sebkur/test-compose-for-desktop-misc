import org.testng.Assert
import kotlin.test.Test

class SimpleTestNg {
    @Test
    fun testSomething() {
        println("foo")
        Assert.assertTrue(true)
    }
}
