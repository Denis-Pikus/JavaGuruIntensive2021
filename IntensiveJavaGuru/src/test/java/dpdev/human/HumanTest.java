package dpdev.human;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human = new Human("John", 20);

    @Test
    void greet() {
       human.greet();
    }
}