public class Monkey extends RescueAnimal{

    // Instance variables specific to Monky
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    // Constructor
    public Monkey() {
        super();
    }

    // Accessor and Mutator methods for Monkey-specific attributes
    public Monkey ( String name, String gender, String age, String weight, String acquisitionDate,
                    String acquisitionCountry, String trainingStatus, boolean reserved,
                    String inServiceCountry, String species, double tailLength,
                    double height, double bodyLength) {
        
        // Initialize inherited attributes using superclass constructor
        setName(name);
        setAnimalType("Monkey");
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // Initialize Monkey-specific attributes
        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Getters and Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
    
}
