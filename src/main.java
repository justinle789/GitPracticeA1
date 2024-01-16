import java.util.*;
import java.util.HashSet;


public class main {
    public static void main(String[] args){
        Cat Cat1 = new Cat(4, "Stray-O-Cat");
        Cat1.StandProfile("Stray Cat", 25);

        Cat1.makeNoise();
        Cat1.PrintStandStats();


        Human JustinLe = new Human("Justin Le",  22);
        JustinLe.StandProfile("Absolute Virtue", 2);

        Human JohnDoe = new Human("John Doe", 28);
        JohnDoe.StandProfile("Kagetokage", 25);

        Human JaneDoe = new Human("Jane Doe", 23);
        JaneDoe.StandProfile("Cyber Dragon Infinity", 100);

        Set<Object> listOfStandUsers = new HashSet<>();
        listOfStandUsers.add(JustinLe);
        listOfStandUsers.add(JohnDoe);
        listOfStandUsers.add(JaneDoe);


        LinkedList<Object> standUserList = new LinkedList<>();
        standUserList.add(JustinLe);
        standUserList.add(JohnDoe);
        standUserList.add(JaneDoe);
        

        Stack<String> stackYo = new Stack<String>();
        stackYo.push("Dirty");
        stackYo.push("Deeds");
        stackYo.push("Done");
        stackYo.push("Cheap");
        stackYo.push("D4C!");


        System.out.println("The stack is: " + stackYo);
        System.out.println("Is stack empty: " + stackYo.empty());
        stackYo.pop();

        System.out.println("\r");
        System.out.println("The stack after pop: " + stackYo);
        System.out.println("\r");

        stackYo.removeAll(stackYo);
        System.out.println("Is stack empty: " + stackYo.empty());
        System.out.println("The stack after removal: " + stackYo);




    }
}
