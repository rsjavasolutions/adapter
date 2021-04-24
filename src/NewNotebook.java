public interface NewNotebook {

    void createNote(String title, String note, String recipient);

    String getNoteByTitle(String title);

    String removeNoteByTitle(String title);

    String getNotesList();
}
