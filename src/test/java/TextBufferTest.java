import fr.einfolearning.tp2.metiers.TextBuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class TextBufferTest {

    @Test
    public void should_return_initial_text_when_calling_toString() {
        // Arrange
        TextBuffer buffer = new TextBuffer("je suis un editeur de texte");

        // Act
        String result = buffer.toString();

        // Assert
        Assertions.assertEquals("je suis un editeur de texte", result);
    }
}