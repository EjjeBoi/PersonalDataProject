import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
        public int getAge () {
            return age;
        }
        public String getName () {
            return name;
        }
        public String toString(){
        return "name: " + name + ", " + "age: " + age + ";";
        }
    }
