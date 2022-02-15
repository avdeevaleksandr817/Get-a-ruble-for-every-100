public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 4900;
        int limit = 100;
        int bonus = replenishment/limit;
        int total= check+replenishment+bonus;
        System.out.println((bonus) + "  Сумма бонусов");
        System.out.println((total) + "  Общая сумма");
    }
}
