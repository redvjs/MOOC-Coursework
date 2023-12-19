/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vico Schot
 */
public class Archive {
    private String identifier;
    private String name;
    
    
    public Archive (String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    public String getIdentifier() {
        return this.identifier;
    }
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        // check if variables refer to same object
        if (this == compared){
            return true;
        }
        // check if object is of class Archive
        if(getClass() != compared.getClass()){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        if(this.identifier.equals(comparedArchive.getIdentifier())){
            return true;
        }
        return false;
    }

        
    
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name ;

    }
}
