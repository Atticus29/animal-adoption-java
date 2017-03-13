
class Animal {
  public int mAge;
  public String mSpecies;
  public String mBreed;

  public Animal (int age, String species, String breed){
    mAge = age;
    mSpecies = species;
    mBreed = breed;
  }

  public boolean isYoung(int maxAge){
    return (mAge < maxAge);
  }
}
