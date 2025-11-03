import java.util.HashMap;

public class Assessment {
    private HashMap<String,Integer> pairs;
    public Assessment(){
        pairs= new HashMap<>();
    }

    public HashMap<String, Integer> getPairs() {
        return pairs;
    }

    public void addAssessment(String var, int value){
        //Pre: var is not empty.
        //Post: If var already has a value, it is replaced. If not, the new assessment is added.
        pairs.put(var,value);
    }
    public void removeAssessment(String var){
        //Pre:
        //Post: Assessment var is removed if it exists
        pairs.remove(var);
    }
    public int getAssessment(String var){
        //Pre:
        //Post: It returns value from var given, if var doesn´t exists, it returns null.
        return pairs.get(var);
    }
    public boolean hasValue(String var){
        //Pre:
        //Post: Returns true if there is a var in the assessment table; false in contrary case.
        return pairs.containsKey(var);
    }
    public boolean areCompatible(Assessment a){
        //Pre: Assessment given is not null.
        //Post: It returns true if equals vars in both assessment have the same value; false in contrary case.
        for(String var:a.pairs.keySet()){
            if (pairs.get(var)!=null){
                if(pairs.get(var)!=a.getAssessment(var)) return false;
            }
        }
        return true;
    }
    public Assessment union(Assessment a){
        //Pre: Assessment given must be compatible.
        //Post: It returns the union of the both assessment (this and given).
        Assessment union = new Assessment();
        for(String var:a.pairs.keySet()){
           union.pairs.put(var,pairs.get(var));
        }
        for(String var2:this.pairs.keySet()){
            union.pairs.put(var2,pairs.get(var2));
        }
        return union;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
