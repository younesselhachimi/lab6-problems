package problem3;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int capacity;
        do {
            capacity = number("Library capacity (at least 2): ");
        } while (capacity < 2);

        Library library = new Library(capacity);
        library.add(new Novel("The Hobbit", "J.R.R. Tolkien", 310, library, 15.50));
        library.add(new Dictionary("English-French Dictionary", library, "English/French"));

        while (true) {
            System.out.println("\n1 Add  2 Display  3 Delete  4 Search  5 Authors  0 Exit");
            switch (number("Choice: ")) {
                case 0:
                    return;
                case 1:
                    if (library.getDocuments().size() == library.getCapacity()) {
                        System.out.println("Library full.");
                        break;
                    }
                    Document added = createDocument(library);
                    if (added != null) {
                        System.out.println(library.add(added)
                                ? "Added record " + added.getNumRec() : "Could not add document.");
                    }
                    break;
                case 2:
                    library.displayDocuments();
                    break;
                case 3:
                    Document toDelete = library.document(number("Record number: "));
                    System.out.println(library.delete(toDelete) ? "Deleted." : "Not found.");
                    break;
                case 4:
                    Document found = library.document(number("Record number: "));
                    System.out.println(found == null ? "Not found." : found);
                    break;
                case 5:
                    library.displayAuthors();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static Document createDocument(Library library) {
        int type = number("Type (1 Book, 2 Novel, 3 Textbook, 4 Magazine, 5 Dictionary): ");
        if (type < 1 || type > 5) {
            System.out.println("Invalid type.");
            return null;
        }
        String title = text("Title: ");
        if (type <= 3) {
            String author = text("Author: ");
            int pages = number("Pages: ");
            if (type == 1) return new Book(title, author, pages, library);
            if (type == 2) return new Novel(title, author, pages, library, decimal("Price: "));
            return new Textbook(title, author, pages, library, text("Level: "));
        }
        if (type == 4) return new Magazine(title, library, text("Month: "), number("Year: "));
        return new Dictionary(title, library, text("Language: "));
    }

    private static String text(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    private static int number(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(text(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer.");
            }
        }
    }

    private static double decimal(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(text(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.");
            }
        }
    }
}
