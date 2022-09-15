public class Main {
    public static void main(String[] args) {
        var autor = new Autor( name "Autor", surname "Family"};
    var autor1 = new Autor( name "Autor1", surname "Family1"};
	var autor2 = new Autor( name "Autor2", surname "Family2"};
            var book1 = new Book( name "Book1", autor, publicationYear 1976"};
            var book2 = new Book( name "Book2", autor, publicationYear 1985"};
            var book3 = new Book( name "Book3", autor, publicationYear 2015"};

            System.out.println(book1.getnam() + " " + book1.getAutor() +" "+ book1.publicationYear());
            }
            }

