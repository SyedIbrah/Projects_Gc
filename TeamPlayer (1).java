// SYED MOHAMMAD IBRAHIM ID: SI4970
// this is implementation of the TeamPlayer class with private attributes
// this has multiple constructors,accessors and mutators 

 


public class TeamPlayer {
    
    private String name; 

    private double weight; 

    private double height; 

    // the constants will be used for BMI calculation

    private double Hconstant = 0.025;
    private double Wconstant = 0.45;

    // here I create the default constructor 

    public TeamPlayer(){
        name = "Unknown";
        weight = 0.0;
        height = 0.0;
    }

    // here I create the parameterized constructor

    public TeamPlayer(String name,double weight,double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    
    public void setName(String name){ // mutator for making changes to the name attribute
        this.name = name;
    }

    public void setWeight(double weight){ // mutator for making changes to the weight attribute
        this.weight = weight;
    }

    public void setHeight(double height){ // mutator for making changes to the height attribute
        this.height = height;

    }

    
    public String getName(){ // Accessor for getting the private name attribute
        return name;
    }

    public double getWeight(){ // Accessor for getting the private weight attribute
        return weight;
    }
    public double getHeight(){ // Accessor for getting the private height attribute
        return height;
    }

    public double getBMI(){ // Accessor for getting the private object BMI attribute
        double BMI;
        double temp;

        if(height == 0){
            return -999.0;
        }
        else{
            temp = height * Hconstant;
            BMI = (weight*Wconstant) / (temp*temp);
            return BMI;
        }

        
    }
}
