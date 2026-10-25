package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity = capacity;
        documents = new ArrayList<Document>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }
    void displayDocuments(){
        System.out.println("The documents in the library are: ");
        for(Document doc : documents){
            System.out.println(doc);
        }
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("The library of capacity ").append(capacity).append(" has: ");
        for(Document doc : documents){
            s.append(doc);
        }
        return s.toString();
    }

    public boolean add(Document doc){
        if(documents.contains(doc) || documents.size() == capacity){
            return false;
        }
        documents.add(doc);
        return true;
    }

    public boolean delete(Document doc){
        if(documents.isEmpty() || !documents.contains(doc)){
            return false;
        }
        documents.remove(doc);
        return true;
    }

    public Document document(int numRec){
        for(Document doc : documents){
            if(doc.getNumRec() == numRec){
                return doc;
            }
        }
        return null;
    }

    public void displayAuthors(){
        System.out.println("The authors are: ");
        for(Document doc : documents){
            if(doc instanceof Book){
                System.out.println(((Book) doc).getAuthor());
            }
        }
    }
}