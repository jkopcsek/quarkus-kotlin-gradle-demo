package qkg.demo

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

@QuarkusTest
class PingResourceTest {
    @Test
    fun yo() {
        fail("i want to fail")
    }
}