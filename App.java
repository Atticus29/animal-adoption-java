
import java.io.Console;

public class App {
  public static void main(String[] args) {

    Animal Harry = new Animal(3, "feline", "tabby");

    Animal Fred = new Animal(13, "dog", "Newfoundland");

    Animal Walter = new Animal(2, "ferret", "black-footed");

    Animal Shep = new Animal(3, "dog", "Australian Shepherd");

    Animal Gus = new Animal(34, "feline", "tabby");

    Animal[] allAnimals = {Harry, Fred, Walter, Shep, Gus};

    Console myConsole = System.console();
    System.out.println("How old is too old?");
    String stringUserMaxAge = myConsole.readLine();
    int userMaxAge = Integer.parseInt(stringUserMaxAge);

    System.out.println("All Animals: ");

    for ( Animal eachAnimal : allAnimals ) {
      if(eachAnimal.isYoung(userMaxAge)){
        System.out.println("--------------");
        System.out.println( eachAnimal.mAge );
        System.out.println( eachAnimal.mSpecies );
        System.out.println( eachAnimal.mBreed );
      }
    }
  }
}
