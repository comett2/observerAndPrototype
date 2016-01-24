package composite;

public class Book extends Literature {
    private String title;
    private String author;
    private String dateOfCreation;

    public Book(String title, String author, String dateOfCreation) {
        this.title = title;
        this.author = author;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public void literatureDescription() {
        System.out.println("Title is: " + title + " and the author: " + author);
    }

    @Override
    public void dateOfCreation() {
        System.out.println("Date of creation: " + dateOfCreation);
    }
}
