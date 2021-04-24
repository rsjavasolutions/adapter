public class NotebookAdapter implements Notebook, NewNotebook {

    NewNotebookImpl newNotebook = new NewNotebookImpl();

    @Override
    public void createNote(String title, String note) {
        newNotebook.createNote(title, note, null);
    }

    @Override
    public void createNote(String title, String note, String recipient) {
        newNotebook.createNote(title, note, recipient);
    }

    @Override
    public String getNoteByTitle(String title) {
        return newNotebook.getNoteByTitle(title);
    }

    @Override
    public String removeNoteByTitle(String title) {
        return newNotebook.removeNoteByTitle(title);
    }

    @Override
    public String getNotesList() {
        return newNotebook.getNotesList();
    }

    @Override
    public String getNotesCatalog() {
        return newNotebook.getNotesList();
    }
}
