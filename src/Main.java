public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Количесвто бонусных милей за перелет: " + miles);
    }
}
