/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cumulative.poetry;

import org.junit.Test;
import static org.junit.Assert.*;

public class PoetTest {
    @Test public void shouldSaySomething() {
        Poet poet = new Poet();
        assertFalse("Poet should say something, but said nothing",poet.recite().isEmpty());
    }
}
