
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MultipleInheritanceWithInterface implements Printable, Showable {

    public void print() {
        System.out.println("Printable");
    }

    public void show() {
        System.out.println("Showable");
    }

    public static void main(String[] args) {

        MultipleInheritanceWithInterface multipleInheritanceWithInterface = new MultipleInheritanceWithInterface();
        multipleInheritanceWithInterface.print();
        multipleInheritanceWithInterface.show();
    }
}