package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    public Magazine(String title, Library library, String month, int year){
        super(title, library);
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Magazine of id ").append(super.getNumRec())
                .append(" and of title: ").append(super.getTitle());
        s.append("\nIts release month is: ").append(month)
                .append(" and the release year is: ").append(year);
        return s.toString();
    }
}