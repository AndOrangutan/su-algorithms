package intro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void helloTest() {
        assertEquals("Hello World", HelloWorld.hello());
    }

}
