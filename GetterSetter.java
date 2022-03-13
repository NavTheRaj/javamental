// Demonstrate getter and setter in java

public class GetterSetter {
    private String name;
    private int age;

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

    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setName("John");
        gs.setAge(20);
        System.out.println("Name: " + gs.getName());
        System.out.println("Age: " + gs.getAge());
    }
}
