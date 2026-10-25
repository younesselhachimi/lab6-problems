package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,Library lib , String language){
        super(title,lib);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Dictionary of id ").append(super.getNumRec())
                .append(" and of title: ").append(super.getTitle());
        s.append("\nIts language is : ").append(language);
        return s.toString();
    }
}