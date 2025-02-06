public class Vikarn extends Kaurav {
    public Vikarn(String name) {
        super(name);
    }

    @Override
    public void obey() {
        System.out.println(getName() + " is obedient.");
    }

    @Override
    public void kind() {
        System.out.println(getName() + " is kind.");
    }
}