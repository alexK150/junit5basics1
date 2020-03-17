import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Test started...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Alex"));
    }

    @AfterEach
    void afterTest() {
        System.out.println("After each test...");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("After all tests");
    }
}