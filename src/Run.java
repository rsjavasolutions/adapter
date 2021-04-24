public class Run {
    public static void main(String[] args) {

        //podmiana na NotebookAdapter
        NotebookAdapter notebook = new NotebookAdapter();

        notebook.createNote("Title_1", "First_Note");
        notebook.createNote("Title_2", "Second_Note");
        notebook.createNote("Title_3", "Third_Note");

        System.out.println(notebook.getNotesCatalog());

        //użycie w starym systemie metod z nowego interfejsu

        notebook.createNote("New_Title_1", "New_Fourth_Note", "New_Recipient");

        System.out.println(notebook.getNotesList());
    }
}
