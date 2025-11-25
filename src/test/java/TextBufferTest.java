import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class TextBufferTest {

    @Test
    public void should_return_initial_text_when_calling_toString() {
        // Arrange : on prépare un TextBuffer avec un texte connu
        TextBuffer buffer = new TextBuffer("je suis un editeur de texte");

        // Act : on appelle toString()
        String result = buffer.toString();

        // Assert : on vérifie que le résultat est bien le texte attendu
        Assertions.assertEquals("je suis un editeur de texte", result);
    }
}