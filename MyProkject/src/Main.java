//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student chaitanya = new Student();
        chaitanya.setName("chaitanya");
        chaitanya.setCourse("btech");
        chaitanya.setRollNumber(256);

        Student anushka = new Student();
        anushka.setName("Anushka");
        anushka.setCourse("BBA");
        anushka.setRollNumber(567);

        System.out.println(chaitanya.getName());
        System.out.println(chaitanya);
        System.out.println(chaitanya.getRollNumber());
        System.out.println(anushka.getRollNumber());
    }
}