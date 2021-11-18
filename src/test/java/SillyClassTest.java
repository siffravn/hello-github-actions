import static org.junit.jupiter.api.Assertions.*;

class SillyClassTest {

    @org.junit.jupiter.api.Test
    void sayHello() {
        SillyClass silly = new SillyClass();

        String str = silly.sayHello();

        assertEquals("Hello", str);
    }

    @org.junit.jupiter.api.Test
    void saySomething() {
        SillyClass silly = new SillyClass();

        String something = "Greetings SillyClass";

        String str = silly.saySomething(something);

        assertEquals(something, str);
    }
}