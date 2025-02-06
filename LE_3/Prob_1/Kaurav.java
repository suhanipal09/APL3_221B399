public class Kaurav extends Bharatvanshi {
    private String name;

    public Kaurav(String name) {
        this.name = name;
    }
       public String getName() {
        return name;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting.");
    }

    @Override
    public void obey() {
        System.out.println(name + " disobeys.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is cruel.");
    }
}