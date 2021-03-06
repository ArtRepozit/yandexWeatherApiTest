package forPegaApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//http://megagenerator.ru/namefio/ - генератор имён
//https://randomall.ru/fantasy_town/ - генератор названий городов фентези
public class NameGenerators {
    public static void main(String[] args) {
        List<String> firstNames = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/artemdolbysev/IdeaProjects/yandexWeatherApiTest/src/main/resources/CompanyNameData.txt"));
            String line = reader.readLine().trim();
            while (!line.equals("end")) {
                if (!line.isEmpty()) {
                    firstNames.add("\"" + line + "\"");
                }
                line = reader.readLine().trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(firstNames);
    }
        String[] maleNames = {"Артемий", "Адриан", "Феоктист", "Серафим", "Федот", "Ефрем", "Артур", "Сократ", "Тимофей", "Вадим", "Федосий", "Никанор", "Игнат", "Валентин", "Харитон", "Лаврентий", "Эрнст", "Семен", "Ипполит", "Макар", "Модест", "Владимир", "Руслан", "Валерий", "Максим", "Иннокентий", "Мир", "Антип", "Эммануил", "Юлий", "Андрон", "Святослав", "Олег", "Лукьян", "Егор", "Рюрик", "Никифор", "Семён", "Елисей", "Эдуард", "Зиновий", "Евсей", "Якуб", "Герасим", "Яков", "Родион", "Прокл", "Евгений", "Игнатий", "Евстигней"};
        String[] maleLastNames = {"Рыжиков", "Вергунов", "Кондучалов", "Гавриков", "Сеченов", "Кривчиков", "Рожков", "Пелёвин", "Раскатов", "Сапогов", "Абакумов", "Колпаков", "Яшков", "Цицианов", "Зайцев", "Хигир", "Яковец", "Чендев", "Образцов", "Низовкин", "Брежнев", "Петров", "Барсов", "Сильвестров", "Адоратский", "Беляков", "Оропай", "Низовцов", "Батрутдинов", "Немцов", "Полотенцев", "Прохоров", "Тучков", "Ледовской", "Логутенко", "Гриневец", "Абоймов", "Вастьянов", "Курбанов", "Ключников", "Расторгуев", "Лебедков", "Жеглов", "Маматов", "Казарезов", "Геремеш", "Лобачёв", "Куделькин", "Ивазов", "Михалицин"};
        String[] maleMiddleNames = {"Сергеевич", "Несторович", "Матвеевич", "Панкратиевич", "Ильевич", "Всеволодович", "Ипатович", "Давыдович", "Филиппович", "Моисеевич", "Прокофиевич", "Агапович", "Самсонович", "Афанасиевич", "Никонович", "Эрнстович", "Андроникович", "Денисович", "Касьянович", "Евграфович", "Аникитевич", "Капитонович", "Еремеевич", "Федотович", "Леонович", "Модестович", "Маркович", "Самуилович", "Иванович", "Владиславович", "Ульянович", "Платонович", "Георгиевич", "Яковович", "Вячеславович", "Григориевич", "Сидорович", "Валерьянович", "Остапович", "Ираклиевич", "Куприянович", "Титович", "Ипполитович", "Фролович", "Никанорович", "Михаилович", "Адрианович", "Тихонович", "Эдуардович", "Брониславович"};

        String[] femaleNames = {"Инесса", "Христина", "Александра", "Розалия", "Нина", "Мария", "Валерия", "Софья", "Марина", "Жанна", "Зинаида", "Лилия", "Кристина", "Элеонора", "Анастасия", "Лариса", "Наталия", "Лада", "Берта", "Всеслава", "Евдокия", "Ефросинья", "Бронислава", "Валентина", "Марфа", "Агафья", "Дина", "Виктория", "Эльвира", "Евгения", "Ольга", "Варвара", "Марта", "Ева", "Владлена", "Стела", "Наталья", "Владислава", "Марианна", "Фаина", "Анфиса", "Нона", "Татьяна", "Рада", "Ульяна", "Эвелина", "Инна", "Раиса", "Любава", "Вероника"};
        String[] femaleLastNames = {"Филатова", "Дрёмова", "Ярмоленко", "Кондратенко", "Каганович", "Сучкова", "Кярбер", "Францева", "Сивакова", "Яшкова", "Оскорбина", "Журавлёва", "Цыганова", "Блинова", "Латушкина", "Яценковская", "Абросимова", "Яминская", "Варенникова", "Вастьянова", "Конака", "Лаер", "Кравец", "Браславец", "Арданкина", "Летова", "Кондрат", "Лунькова", "Белорусова", "Гудкова", "Сарайкина", "Гурьева", "Бабина", "Яблонева", "Кубланова", "Митина", "Краева", "Новичкова", "Кокорина", "Антонович", "Былинкина", "Кузнецова", "Бессуднова", "Янгосярова", "Брынскиха", "Урусова", "Квартина", "Михайлова", "Уманова", "Кулакова"};
        String[] femaleMiddleNames = {"Захаровна", "Александровна", "Моисеевна", "Остаповна", "Данилевна", "Ипполитовна", "Ульяновна", "Мечиславовна", "Сидоровна", "Андрияновна", "Вадимовна", "Аристарховна", "Владимировна", "Виссарионовна", "Романовна", "Федоровна", "Тимофеевна", "Вениаминовна", "Тихоновна", "Матвеевна", "Евстигнеевна", "Фомевна", "Казимировна", "Сократовна", "Радионовна", "Борисовна", "Леонидовна", "Аркадиевна", "Кузьмевна", "Аскольдовна", "Измаиловна", "Глебовна", "Германовна", "Ростиславовна", "Эрнестовна", "Владленовна", "Авдеевна", "Савелиевна", "Арсентиевна", "Филимоновна", "Всеволодовна", "Варфоломеевна", "Иннокентиевна", "Максимовна", "Капитоновна", "Кондратьевна", "Ираклиевна", "Игнатиевна", "Никитевна", "Феликсовна"};

        String[] cities = {"Циашэнси", "Глуисстин", "Джиушелеу", "Неамфорд", "Осипгоу", "Шиалас", "Чорд", "Плоус", "Вандо", "Еноегейт", "Еглаксфис", "Зеледо", "Гранд", "Зланбу", "Усеит", "Хеоссэт", "Злуахэнто", "Чиокранта", "Ублиаберт", "Уруоксвер", "Икуридж", "Фруакследо", "Река", "Блех", "Жаксденс", "Ифлуловер", "Ипервер", "Грецестер", "Глуклэит", "Шеим", "Бедон", "Танта", "Иусаукспорт", "Триерасо", "Усиксхул", "Суакредо", "Друритх", "Злало", "Страка", "Фраухам", "Оакиефгэнд", "Флатол", "Шаеган", "Еупиппорт", "Леубронт", "Зорк", "Чэим", "Дрэит", "Ксиостул", "Деохам"};
        String[] companyName = {"Строганина Лохматого Орка","Любимая с привкусом солёной карамели", "Возлюбленная темного герцога", "Моя триумфальная эра", "Вечность правдивой веры", "Грязная вода", "Кровожадная сталь", "Разукрась мои воспоминания", "Ладони внутри теплоты", "Училище темных воителей", "Дом на третьей улице", "Ромашковый чай", "Звенящая Одиссея Тюленя", "Первый город", "Откровения Нада", "Море жизни", "Институт проклятых попаданцев", "Зеркала чистой любви", "Служанка надменного хранителя", "Сломанная стена", "Страницы в глубине эйфории", "Скрытая площадь", "Зеленые алмазы", "Жена жесткого барона", "Разукрась мои воспоминания", "Душа призрака", "Каноны механики", "Прекрасный спор", "Одинокий путь", "Возврата нет", "Солнце убитой ненависти", "Великолепное наказание", "Душа мятежного герцога", "Тени забытого городка", "Там где я тебя нашёл", "Школа мятежных магов", "Колледж черных стражей", "Когда цветы заговорят", "Мысли дракона", "Одноглазый поцелуй", "Фиолетовый туман", "Кровожадная сталь", "Постоянная эра", "Спасти мир за девять жизней", "Рожденные мечтать", "Гимназия безнадежных стражей", "Дождь изнутри боли", "Лесной Сан-Фиеро", "Милое кладбище", "Секретарь ледяного демона", "Осколки падающих звезд", "Нити забытой храбрости", "Моё личное путешествие", "Звёзды только ночью", "Мой красивый исход", "Забыть всё", "Твоя правда", "Красная миля", "Девятая площадь", "Жена всемогущего чудовища", "Секретарь ледяного диктатора", "Красивая осень", "Секретный показатель", "Иллюзия счастья", "Мёртвое окно", "Пламя ночи", "Проект 019", "Шёпот в темноте", "Киборг", "Бесконечная история", "Секретарь ненавистного оборотня", "Ложь нашей пустоты", "Игра королей", "Королева тайн", "Тысяча и одна жизнь", "Красная миля", "Солнце последней красоты", "Туман нашей памяти", "Мой красивый поиск", "Талантливая одиссея", "Завтра начнётся Апокалипсис", "Почерк правдивой души", "Мой прекрасный поиск", "Лето в кружке", "Институт черных астрологов", "Войнушка в коридоре", "Океан после веры", "Тайные руны", "Ангел растерзанной мечты", "Девятый выстрел", "Рассвет чужой лёгкости", "От пяти до десяти", "Железный путь", "Ржавый лёд", "Мёртвая почва", "Думаю, ты прав", "Города жизни", "Мой окончательный период", "Девятая станция", "Клыкастые опасности северных областей"};



}
