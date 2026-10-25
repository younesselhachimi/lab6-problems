package problem3;

import java.util.ArrayList;

public class Book extends Document{
    private String author;
    private int nbrPages;
    public Book(String title , String author, int nbrPages, Library library){
        super(title,library);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Book of id ").append(super.getNumRec())
                .append(" and of title: ").append(super.getTitle());
        s.append("\nThe author is ").append(author)
                .append(" and the number of pages is: ").append(nbrPages);
        return s.toString();
    }
}