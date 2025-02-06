abstract class AbsTest implements Testable {
  
}


class ConcreteTest extends AbsTest {
    public void display() {
        System.out.println("Display method in ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();
    }
}