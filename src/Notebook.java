public interface Notebook {

    void createNote(String title, String note);

    String getNoteByTitle(String title);

    String removeNoteByTitle(String title);

    String getNotesCatalog();
}
