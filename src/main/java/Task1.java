public class Task1 {
    //Ключове слово main() – основний метод, з якого починається виконання програми.

    static String st = "STEP IT Academy";
    public static  void main(String[] a ) {

        String n = "Vlad";
        int age = 19;
        String city = "Tallin";
        char pl = '+';
        long phone = 37258053769L;
        String s = "Java";
        double y = 6.5;
        boolean hp = false;
        String lear = "A0";

        System.out.print("Мене звати " + n + " мені " + age + " років. ");
        System.out.println("Живу в " + city + "i");
        System.out.printf("Телефон:" + pl + "%d\n", phone);
        System.out.println("Навчаюсь в " + st + " на спеціальності " + s);
        System.out.println("Термін навчання: " + y);
        System.out.println("Доствід роботи: " + hp);
        System.out.printf("Рівень володіння Англійської: %s ", lear);
    }
}
