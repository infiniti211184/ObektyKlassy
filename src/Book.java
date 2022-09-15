public class Book {
    private  String name;
    private Autor autor;
    private Integer publicationYear;
    public Book(String name, Autor autor, Integer publicationYear);
        this.name = name;
	    this.autor = autor;
	    this.publicationYear = publicationYear;
}
    public String getName() {
        returt name;
    }
    public String getAutor() {
        returt autor;
    }
    public String getPublicationYear() {
        returt publicationYear;
    }
    public voidpublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
}