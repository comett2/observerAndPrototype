package composite;

import java.util.ArrayList;
import java.util.List;

public class Thriller extends Literature {

    private String description;

    private String dateOfCreation;

    List<Literature> literatures = new ArrayList<Literature>();

    public Thriller(String description, String dateOfCreation) {
        this.description = description;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public void literatureDescription() {
        System.out.println(description);
        literatures.stream().forEach(literature -> literature.literatureDescription());
    }

    @Override
    public void dateOfCreation() {
        System.out.println("Date of creation" + dateOfCreation);

        literatures.stream().forEach(literature -> literature.dateOfCreation());
    }
    @Override
    public void add(Literature literature) {
        literature.add(literature);
    }
}
