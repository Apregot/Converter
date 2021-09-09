import ru.stud.converter.Converter;
import ru.stud.converter.ConverterCreator;
import ru.stud.converter.ConverterCreatorCelsiusToKelvin;
import ru.stud.converter.ConverterCreatorCelsiusToFahrenheit;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    static ConverterCreator converterCreator;

    static void init() {
        Locale locale = Locale.getDefault(); //Выясняем локаль компьютера
        if(locale.getCountry().equals("US")) { //если локаль США - создаем конвертер в фаренгейты
            System.out.println("Создан конвертер из Цельсиев в Фаренгейты.");
            converterCreator = new ConverterCreatorCelsiusToFahrenheit();
        }
        else { //иначе создаем конвертер в кельвины
            System.out.println("Создан конвертер из Цельсиев в Кельвины.");
            converterCreator = new ConverterCreatorCelsiusToKelvin();
        }

    }

    public static void main(String[] args) {
        init();//Инициализация converterCreator'a
        Converter converter = converterCreator.create();//Инициализация конвертера
        System.out.print("Введите количество градусов Цельсия ");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        System.out.println(converter.getResult(converter.convert(amount)));

    }
}
