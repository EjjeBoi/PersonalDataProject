import java.io.*;

public class ReadObj {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            ois.close();
            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException | ClassNotFoundException ex) {
            throw new IllegalArgumentException();
        }
    }
}
