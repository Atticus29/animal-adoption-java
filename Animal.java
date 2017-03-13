
class Animal {
  public int mAge;
  public String mSpecies;
  public String mBreed;
  public Boolean mAdopted;

  public Animal (int age, String species, String breed){
    mAge = age;
    mSpecies = species;
    mBreed = breed;
    mAdopted = false;
  }

  public void adopt(){
    mAdopted = true;
  }
  
  public boolean isYoung(int maxAge){
    return (mAge < maxAge);
  }
}
