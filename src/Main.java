// Konstantin Terskikh, kostus.online@gmail.com, 2024
// SkyPro, Java Developer
// Variables, Lesson #2
import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        var divider = "-------------------------------------";

        System.out.println(divider);
        System.out.println("Задача #1");
        int iValue = 1;
        System.out.println("Значение переменной iValue с типом int равно " + iValue);
        byte bValue = 2;
        System.out.println("Значение переменной bValue с типом byte равно " + bValue);
        short sValue = 3;
        System.out.println("Значение переменной sValue с типом short равно " + sValue);
        long longValue = 4;
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        float fValue = 5.6f;
        System.out.println("Значение переменной fValue с типом float равно " + fValue);
        double dValue = 7.890;
        System.out.println("Значение переменной dValue с типом double равно " + dValue);

        System.out.println(divider);
        System.out.println("Задача #2");
        float f = 27.12f;
        long longValue1 = 987678965549L;
        long longValue2 = 987_678_965_549L;
        // возможны два варианта:
        // неверный разделитель и значение всё же число,
        // и значение - не число, но строка
        float f1 = 2.786f;
        String str = "2,786";
        short sPos = 569;
        short sNeg = -159;
        short sBig = 27897;
        byte b = 67;
        System.out.println("Задача #2 не предполагает вывода результатов");

        System.out.println(divider);
        System.out.println("Задача #3");
        // в данном случае byte - достаточный тип
        // для указания количества учеников в каждом классе
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        // сложение byte+byte+... возвращает int по умолчанию, без явного приведения типа,
        // поэтому для суммы учеников отводим не short (чего бы хватило), а int
        int totalStudents = classA + classB + classC;
        short totalPapers = 480; // здесь достаточно short
        // для листов бумаги на ученика достаточно целочисленного деления
        // с округленгием вниз: вряд ли ученику нужен будет кусок листа, а не целый лист;
        // в общем случае, а не в этом конкретном, лучше отвести для результата
        // тип побольше, хотя здесь хватило бы и byte/short
        int papersPerStudent = totalPapers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");

        System.out.println(divider);
        System.out.println("Задача #4");
        byte per1m = 16 / 2; // "performance per 1 minute"
        int minutes = 20;
        int count = per1m * minutes;
        System.out.println("За 20 минут машина произвела " + count + " штук бутылок");
        minutes = 60 * 24; // сутки
        count = per1m * minutes;
        System.out.println("За сутки машина произвела " + count + " штук бутылок");
        minutes *= 3; // 3 дня
        count = per1m * minutes;
        System.out.println("За 3 дня машина произвела " + count + " штук бутылок");
        minutes *= 10; // 30 дней (пусть это месяц)
        count = per1m * minutes;
        System.out.println("За месяц машина произвела " + count + " штук бутылок");

        System.out.println(divider);
        System.out.println("Задача #5");
        byte perClassWhite = 2;
        byte perClassBrown = 4;
        int perClass = perClassWhite + perClassBrown;
        int total = 120;
        int classes = total / perClass;
        int totalWhite = classes * perClassWhite;
        int totalBrown = classes * perClassBrown;
        System.out.println("В школе, где " +
                classes + " классов, нужно " +
                totalWhite + " банок белой краски и " +
                totalBrown + " банок коричневой краски");

        System.out.println(divider);
        System.out.println("Задача #6");
        // удельные веса продуктов на единицу
        float weightBanana = 80f;
        float weightMilk1ml = 105f / 100f;
        float weightIceCream = 100f;
        float weightEgg = 70f;
        // количества единиц продуктов в рецепте
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        // рассчитываем вес готового продукта по рецепту
        // скобки - для читаемости
        float weightGrams = (bananas * weightBanana) +
                (milk * weightMilk1ml) +
                (iceCream * weightIceCream) +
                (eggs * weightEgg);
        float weightKg = weightGrams / 1000f;
        System.out.println("Вес \"спортзавтрака\" составил " + weightGrams + " г (" + weightKg +" кг)");

        System.out.println(divider);
        System.out.println("Задача #7");
        float needToLoseKg = 7f; // кг
        float needToLose = needToLoseKg * 1000; // г
        String losePrefix = "Спортсмен может сбросить " + needToLoseKg + " кг";
        float losePerDayMin = 250f; // г
        float losePerDayMax = 500f; // г
        float losePerDayAvg = (losePerDayMin + losePerDayMax) / 2; // г
        System.out.println("В среднем спортсмен может терять " + losePerDayAvg + " граммов веса");
        float daysMin = needToLose / losePerDayMin;
        double daysMinCeil = Math.ceil(daysMin);
        System.out.println(losePrefix + " минимально за " + (int)daysMinCeil  + " дней (точнее, за " + daysMin + ")");
        float daysAvg = needToLose / losePerDayAvg;
        double daysAvgCeil = Math.ceil(daysAvg);
        System.out.println(losePrefix + " в среднем за " + (int)daysAvgCeil + " дней (точнее, за " + daysAvg + ")");
        float daysMax = needToLose / losePerDayMax;
        double daysMaxCeil = Math.ceil(daysMax);
        System.out.println(losePrefix + " в щадящем темпе за " + (int)daysMaxCeil + " дней (точнее, за " + daysMax + ")");

        System.out.println(divider);
        System.out.println("Задача #8");

        float salaryMasha = 67_760f;
        float incomeMasha = salaryMasha * 12f;
        float salaryMashaNew = salaryMasha * 1.1f;
        float incomeMashaNew = salaryMashaNew * 12f;
        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей в месяц. Годовой доход вырос на " +
                (incomeMashaNew - incomeMasha) + " рублей");

        float salaryDenis = 83_690f;    // рублей в месяц
        float incomeDenis = salaryDenis * 12f;
        float salaryDenisNew = salaryDenis * 1.1f;
        float incomeDenisNew = salaryDenisNew * 12f;
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей в месяц. Годовой доход вырос на " +
                (incomeDenisNew - incomeDenis) + " рублей");

        float salaryKristina = 76_230f; // рублей в месяц
        float incomeKristina = salaryKristina * 12f;
        float salaryKristinaNew = salaryKristina * 1.1f;
        float incomeKristinaNew = salaryKristinaNew * 12f;
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей в месяц. Годовой доход вырос на " +
                (incomeKristinaNew - incomeKristina) + " рублей");
    }
}