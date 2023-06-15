package task3.domain;

public class Pet {
    private String name;
    private int age;
  
    public Pet(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    // Геттеры и сеттеры для полей
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
}
  
  