//
// Utilisation nominale des classes td3.Buffer, Killring et td3.Editor
//
////////////////////////////////////////////////////////////////

import fr.einfolearning.tp2.metiers.EmacsKillRing;
import fr.einfolearning.tp2.metiers.TextBuffer;
import fr.einfolearning.tp2.metiers.TextEditor;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;
import fr.einfolearning.tp2.utilitaires.EmacsAnalyze;

public class App {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor("je suis un editeur de texte");

        System.out.println("Initial buffer: " + editor.getBuffer());

        try {
            // On sélectionne la partie "suis" (positions 3..7)
            editor.setCursor(3);
            editor.setMark(7);
            editor.killRingBackup();
            System.out.println("After killRingBackup: " + editor.getBuffer());

            // Couper la section sélectionnée et la sauvegarder dans le kill-ring
            editor.setCursor(11);
            editor.setMark(16);
            editor.killSection();
            System.out.println("After killSection: " + editor.getBuffer());

            // Coller (yank) l'élément courant du kill-ring à la position courante
            editor.setCursor(8);
            editor.yank();
            System.out.println("After yank: " + editor.getBuffer());

            // Remplacer le dernier yank par l'élément suivant du kill-ring (yank-pop)
            editor.yankPop();
            System.out.println("After yankPop: " + editor.getBuffer());

        } catch (EmacsKillRingOverflowException e) {
            System.err.println("KillRing overflow: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.err.println("Illegal operation: " + e.getMessage());
        }
    }
}
