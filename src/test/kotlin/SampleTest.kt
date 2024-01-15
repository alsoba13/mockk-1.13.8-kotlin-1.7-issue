import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import java.time.Clock

class SampleTest {

    @Test
    fun sampleTest() {
        val mock = mockk<Clock> {
            every {
                millis()
            } returns 42L
        }

        assert(mock.millis() == 42L)
    }
}