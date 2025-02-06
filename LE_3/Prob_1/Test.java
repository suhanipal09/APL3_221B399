public class Test {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun");
        Pandav bheem = new Pandav("Bheem");
        Kaurav duryodhan = new Kaurav("Duryodhan");
        Vikarn vikarn = new Vikarn("Vikarn");

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}