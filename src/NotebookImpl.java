import java.util.HashMap;
import java.util.Map;

public class NotebookImpl implements Notebook {

    private Map<String, String> titleToNote = new HashMap<>();

    @Override
    public void createNote(String title, String note) {
        titleToNote.put(title, note);
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
    public String getNotesCatalog() {
        return titleToNote.toString();
    }
}
