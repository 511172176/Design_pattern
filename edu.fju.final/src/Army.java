//Command模式實現
// Army class to be used with commands
class Army {
    public void attack() {
        System.out.println("Army is attacking!");
    }

    public void defend() {
        System.out.println("Army is defending!");
    }

    public void retreat() {
        System.out.println("Army is retreating!");
    }
}