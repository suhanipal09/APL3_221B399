public class Pandav extends Bharatvanshi {
    private String name;

    public Pandav(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting.");
    }

    @Override
    public void obey() {
        System.out.println(name + " is obedient.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind.");
    }
}