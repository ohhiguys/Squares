import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println("Количество квадратов чисел от 10 до 99 в указанном диапазоне:");
        System.out.println(service.sqrsInBorders(300, 400));
        }
    }
