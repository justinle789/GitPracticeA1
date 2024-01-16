public class Cat extends Animal implements Stand{

    // if cat has a stand
    String standName;
    int range;

    public Cat(Integer age, String name){
        this.age = age;
        this.name = name;
    }


    // -----------------------------------------------------
    // Abstract Methods
    @Override
    public void makeNoise() { System.out.println("Hiss"); }


    //------------------------------------------------------
    // Interface Methods
    @Override
    public void StandProfile(String standName, Integer range){
        this.standName = standName;
        this.range = range;
        // Measured in metres.
    }
    @Override
    public void PrintStandStats(){
        System.out.println("Stand name: " + this.standName);
        System.out.println("Range: " + this.range + "m");
    }
}
