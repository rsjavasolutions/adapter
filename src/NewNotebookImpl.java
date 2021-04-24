import java.util.HashMap;
import java.util.Map;

public class NewNotebookImpl implements NewNotebook {

    private Map<String, String> titleToNote = new HashMap<>();

    @Override
    public void createNote(String title, String note, String recipient) {
        if (recipient != null) {
            titleToNote.put(title, String.format("%s %s", note, recipient));
        } else {
            titleToNote.put(title, note);
        }
    }

    @Override
    public String getNoteByTitle(String title) {
        return titleToNote.get(title);
    }

    @Override
    public String removeNoteByTitle(String title) {
        return titleToNote.remove(title);
    }

    @Override
    public String getNotesList() {
        return titleToNote.toString();
    }
}
