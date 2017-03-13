
import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Animal harry = new Animal(3, "feline", "tabby");
    Animal fred = new Animal(13, "dog", "Newfoundland");
    Animal walter = new Animal(2, "ferret", "black-footed");
    Animal shep = new Animal(3, "dog", "Australian shepherd");
    Animal gus = new Animal(34, "feline", "tabby");

    Console myConsole = System.console();

    System.out.println("Welcome to the virtual pet rescue. Please type which option you would like: add an animal, see all animals, see animals below an age, exit.");
    String userSelection = myConsole.readLine();

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(harry);
    allAnimals.add(fred);
    allAnimals.add(walter);
    allAnimals.add(shep);
    allAnimals.add(gus);

    Boolean doneStatus = false;
    while(!doneStatus){
      if(userSelection.equals("add an animal")){
        System.out.println("Age of animal?");
        int animalAge = Integer.parseInt(myConsole.readLine());
        System.out.println("Species of animal?");
        String animalSpecies = myConsole.readLine();
        System.out.println("Breed of animal?");
        String animalBreed = myConsole.readLine();
        Animal newAnimal = new Animal(animalAge, animalSpecies, animalBreed);
        allAnimals.add(newAnimal);
      } else if (userSelection.equals("see all animals")){
        printTheAnimalsOverload(allAnimals);
      } else if (userSelection.equals("see animals below an age")){
        System.out.println("How old is too old?");
        String stringuserMaxAge = myConsole.readLine();
        int userMaxAge = Integer.parseInt(stringuserMaxAge);
        printTheAnimals(userMaxAge, allAnimals);
      } else if (userSelection.equals("exit")){
        doneStatus = true;
      }
      else{
        System.out.println("Input not recognized");
      }
      System.out.println("Welcome to the virtual pet rescue. Please type which option you would like: add an animal, see all animals, see animals below an age, exit.");
      userSelection = myConsole.readLine();
    }
    // System.out.println("All Animals: ");
    // gus.adopt();
  }

  public static void printTheAnimalsOverload(List<Animal> allAnimals){
    printTheAnimals(50, allAnimals);
  }

  public static void printTheAnimals(int ageLimit, List<Animal> allAnimals){
    for ( Animal eachAnimal : allAnimals ) {
      if(eachAnimal.isYoung(ageLimit)){
        System.out.println("--------------");
        System.out.println( eachAnimal.mAge );
        System.out.println( eachAnimal.mSpecies );
        System.out.println( eachAnimal.mBreed );
        System.out.println(eachAnimal.mAdopted);
      }
    }
  }
}
