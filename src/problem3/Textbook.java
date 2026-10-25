package problem3;

public class Textbook extends Book{
    private String level;
    public Textbook(String title,String author , int nbrPages, Library lib , String level){
        super(title,author,nbrPages,lib);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Textbook of id ").append(super.getNumRec())
                .append(" and of title: ").append(super.getTitle());
        s.append("\nThe author is ").append(super.getAuthor())
                .append(" and the number of pages is: ").append(super.getNbrPages())
                .append("\nIts level is: ").append(level);
        return s.toString();
    }
}
