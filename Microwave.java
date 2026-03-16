import java.util.ArrayList;
import java.util.List;
public class Microwave// Add your class name here!
{
    //instance variables
    private int wattage;
    private double efficiency;
    private int preferredFoodOrDrinkTemperature;
    //constructor with parameters 
    public Microwave(int uno,double dos,int tres){
        wattage=uno;
        efficiency=dos;
        preferredFoodOrDrinkTemperature=tres;
    }
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void print(){
        System.out.println(
            "Your microwave:\n"+
            "Wattage: "+wattage+" watts\n"+
            "Efficiency: "+efficiency+"%\n"+
            "Your preferred temperature: "+preferredFoodOrDrinkTemperature+"°F"
        );
    }
    // 4. Create accessor (get) methods for each of the instance variables.
    public int getWattage(){
        return wattage;
    }
    public double getEfficiency(){
        return efficiency;
    }
    public int getTemp(){
        return preferredFoodOrDrinkTemperature;
    }
    // 5. Create mutator (set) methods for each of the instance variables.
    public void setWattage(int t){
        wattage=t;
    }
    public void setEfficiency(double t){
        efficiency=t;
    }
    public void setTemp(int t){
        preferredFoodOrDrinkTemperature=t;
    }
    // 6. Create a toString() method that returns all the information in the instance variables.
    public String toString(){return wattage+" "+String.valueOf(efficiency)+" "+String.valueOf(preferredFoodOrDrinkTemperature);}
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).
    public void table(String customEntry, int customMass, int customThermodynamics){
        int deltaTempC=((preferredFoodOrDrinkTemperature-32)*5/9)-20;
        List<String> entries = new ArrayList<>();
        entries.add("Tea");
        entries.add(customEntry);
        List<Integer> massesG = new ArrayList<>();
        massesG.add(550);
        massesG.add(customMass);
        List<Integer> inThisHouseholdWeObeyTheLawsOfThermodynamics = new ArrayList<>();
        inThisHouseholdWeObeyTheLawsOfThermodynamics.add(4186);
        inThisHouseholdWeObeyTheLawsOfThermodynamics.add(customThermodynamics);
        System.out.println("thing|tim|watthours  ");
        System.out.println(" ____________________");
        for(int x=0;x<entries.size();x++){
        int temp=4-(entries.get(x)).length();
            String tempstr = "";
            for(int y=temp;y>0;y--){
                tempstr += " ";
            }
            int predsecs=(int)(((massesG.get(x)/1000.0)*inThisHouseholdWeObeyTheLawsOfThermodynamics.get(x)*deltaTempC)/wattage*efficiency);
            String StringvalueOfwattagepredsecs3600 = String.valueOf(wattage*(predsecs/3600.0));
            System.out.println("|"+entries.get(x)+tempstr+"|"+(predsecs/60)+":"+(predsecs%60)+"|"+StringvalueOfwattagepredsecs3600.substring(0,Math.min(StringvalueOfwattagepredsecs3600.length(),10))+"|");
            if(x!=entries.size()-1){System.out.println(" ————————————————————");}
        }
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }}
    // 8. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls all of the methods that you created above to test them.
    