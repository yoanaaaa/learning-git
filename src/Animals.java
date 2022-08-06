public abstract class Animals {


    //implements AnimalsI {

    private String name;
    private String eats;
    private boolean vegetarian;
    private int noOfLegs;

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    Animals(String eats, boolean vegetarian, int noOfLegs) {
        this.eats = eats;
        this.vegetarian = vegetarian;
        this.noOfLegs = noOfLegs;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", eats='" + eats + '\'' +
                ", vegetarian=" + vegetarian +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
