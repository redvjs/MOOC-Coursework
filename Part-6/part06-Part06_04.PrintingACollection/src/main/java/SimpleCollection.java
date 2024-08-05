
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        String printOutput = "The collection " + this.name +  " has " + this.elements.size() + " element:";
        String printOutputMulti = "The collection " + this.name +  " has " + this.elements.size() + " elements:" + "\n";
        if(this.elements.isEmpty()){
            return "The collection " + this.name +  " is empty.";
        }
        String elementOnList = "";
        
        String elementsOnList = "";
        for(String element: this.elements){
            elementsOnList = elementsOnList + element + "\n";
        }
        if(this.elements.size() == 1){
            for(String element: this.elements){
                elementOnList = elementOnList + element;
            }
            
            return printOutput + "\n" + elementOnList;
        }
        
        return printOutputMulti + elementsOnList;
        
 
    }

    
}
