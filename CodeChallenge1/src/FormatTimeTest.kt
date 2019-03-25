import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FormatTimeTest {
    @Test
    fun `check that none is returned when seconds are 0`() {
        assertEquals(formatTime(0), "none")
    }

    @Test
    fun `check that 1 second returns 1 second`() {
        assertEquals(formatTime(1), "1 second")
    }

    @Test
    fun `check that 62 seconds returns 1 minute and 2 seconds`() {
        assertEquals(formatTime(62), "1 minute and 2 seconds")
    }

    @Test
    fun `check that 94609440 seconds is 3 years and 24 minutes`() {
        assertEquals(formatTime(94609440), "3 years and 24 minutes")
    }

    @Test
    fun `check that 94609440 seconds is 3 days, 4 hours and 1 minute`() {
        assertEquals(formatTime(94609440), "3 years and 24 minutes")
    }
}
