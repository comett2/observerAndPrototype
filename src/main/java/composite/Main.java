package composite;

public class Main {

    public static void main(String args[]) {
        Literature novel = new Novel("Its novel literature", "1000r p.n.e");
        novel.add(new Book("Novel title", "Novel author", "2031-12-12"));
        novel.add(new Book("Another novel title", "Another novel author", "2000-10-10"));
        novel.add(new Thriller("Its thriller literature", "500r p.n.e"));

        novel.literatureDescription();
        novel.dateOfCreation();
    }
}
