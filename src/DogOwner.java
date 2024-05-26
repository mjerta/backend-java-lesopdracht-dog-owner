public class DogOwner {

  String name;
  String sex;
  Dog dog;

  public DogOwner(String name, String sex, Dog dog) {
    this.name = name;
    this.sex = sex;
    this.dog = dog;

  }

  public void setName(String name) {
    this.dog.name = name;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public void increaseDogAgeWithOne() {
    this.dog.ageInYears += 1;
  }

  public String toString() {
    return this.name + " heeft een " + dog.sex + ",deze is " + dog.ageInYears + " jaar oud en is van het ras " + dog.species + " en heet " +
        dog.name + ".";
  }

}
