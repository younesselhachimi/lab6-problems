package problem3;

public class Novel extends Book{
    private double price;
    public Novel(String title,String author , int nbrPages, Library lib ,double price ){
        super(title,author,nbrPages,lib);
        this.price= price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Novel of id ").append(super.getNumRec())
                .append(" and of title: ").append(super.getTitle());
        s.append("\nThe author is ").append(super.getAuthor())
                .append(" and the number of pages is: ").append(super.getNbrPages())
                .append("\nIts price is: ").append(price);
        return s.toString();
    }
}