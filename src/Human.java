public class Human extends Animal implements Stand{

    String standName;
    int range;
    public Human(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    // -----------------------------------------------------
    // Abstract methods
    public void makeNoise(){

        if (this.standName != null) { System.out.println(this.standName + "!"); }
        else                        { return;}
    };


    // -----------------------------------------------------
    // Interface methods
    @Override
    public void StandProfile(String standName, Integer range){
        this.standName = standName;
        this.range = range;
    }
    @Override
    public void PrintStandStats(){
        System.out.println("Stand name: " + this.standName);
        System.out.println("Range: " + this.range + "m");
    }

}
