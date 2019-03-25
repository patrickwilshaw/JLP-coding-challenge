import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FormatTimeTest {
    @Test
    fun `check that none is returned when seconds are 0`() {
        assertEquals("none",formatTime(0))
    }

    @Test
    fun `check that 1 second returns 1 second`() {
        assertEquals( "1 second",formatTime(1))
    }

    @Test
    fun `check that 62 seconds returns 1 minute and 2 seconds`() {
        assertEquals( "1 minute and 2 seconds",formatTime(62))
    }

    @Test
    fun `check that 94609440 seconds is 3 years and 24 minutes`() {
        assertEquals("3 years and 24 minutes",formatTime(94609440) )
    }

    @Test
    fun `check that 94609440 seconds is 3 days, 4 hours and 1 minute`() {
        assertEquals("3 years, 4 hours and 24 minutes",formatTime(94623840))
    }
}
