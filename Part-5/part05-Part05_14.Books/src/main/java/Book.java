
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        // check if the variables refer to the same object
        if (this == compared) {
            return true;
        }
        // compare to see if objects are of same class
        if(getClass() != compared.getClass()){
            return false;
        }
        // cast the Object type comparison object into a Book type comparsionBook object
        Book comparedBook = (Book) compared;
        
        // could also have typed as: return this.name.equals(comparisonBook.name) && this.publicationYear == comparisonBook.getPublicationyear();
        
        if(this.name.equals(comparedBook.name) &&
           this.publicationYear == comparedBook.publicationYear){
           return true;
                    
        }
        return false;
    }

}
