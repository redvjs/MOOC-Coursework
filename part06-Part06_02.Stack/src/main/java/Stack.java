import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stacks;
    
    public Stack(){
        this.stacks = new ArrayList<>();
    }
    public boolean isEmpty(){
        if(this.stacks.size() == 0){
            return true;
        }
        return false;
    }
    public void add(String value){
        this.stacks.add(value);
        
    }
    public ArrayList<String> values(){
        for(String stack: this.stacks){
            System.out.println(stack);
        }
        return stacks;
    }
    
    public String take(){
        String taken = this.stacks.get(this.stacks.size()-1);   
        this.stacks.remove(this.stacks.size()-1);
        return taken;
            
    }
            
}
