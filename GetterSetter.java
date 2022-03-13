// Demonstrate getter and setter in java

public class GetterSetter {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setName("John");
        gs.setAge(20);
        System.out.println("Name: " + gs.getName());
        System.out.println("Age: " + gs.getAge());
    }
}
