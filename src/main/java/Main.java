import ru.netology.sqr.DZ5.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println("Сумма итераций полного цикла: " + (service.squareRoot (200, 300)));

    }
}