import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Приветик!\nКак тебя зовут?");
        String name = in.nextLine();
        switch (name) {
            case "Не скажу":
                System.out.println("Почему не скажешь? :с\n" +
                        "Ну ладно, буду звать тебя Безымяшкой :3\n" +
                        "А меня кстати все зовут Программой ( ͡° ͜ʖ ͡°)\n");
                name = "Безымяшка";
                break;
            case "Нет":
                System.out.println("Что значит нет? :с\nУф, ладно, " +
                        "как хочешь, но я буду звать тебя Безымяшкой :3\n" +
                        "А меня кстати все зовут Программой ( ͡° ͜ʖ ͡°)\n");
                name = "Безымяшка";
                break;
            default:
                System.out.println("Очень приятно, " + name +
                        ", а меня зовут Программа ( ͡° ͜ʖ ͡°)\n");
                break;
        }

        String[] astroSign = {"Овен", "Телец", "Близнецы", "Рак",
                "Лев","Дева","Весы","Скорпион","Стрелец","Козерог","Водолей","Рыбы"};
        Random rand = new Random();
        int i = rand.nextInt(astroSign.length);
        System.out.println("Кто ты по знаку зодиака, " + name + "?");
        String sign = in.nextLine();
        if(sign.equals(astroSign[i])) System.out.println("Ого, я тоже "+astroSign[i]+"!\n");
        else System.out.println("Здорово! А я "+astroSign[i]+"^_^\n");

        String[] favFood = {"Чипсы","Сладкое","Шоколадки","Карамельки",
                "Мамину еду","Мясо","Тортики","Булочки","Пиццу","Рыбу",
                "Курочку","Бургеры","Мороженное","Стейк"};
        i = rand.nextInt(favFood.length);
        System.out.println("А что ты, "+name+", любишь поесть?");
        String food = in.nextLine();
        if(food.equals(favFood[i])) System.out.println("Ого, я тоже!");
        else {
            switch (food) {
                case "Ничего":
                    System.out.println("Совсем-совсем ничего? Это грустно, а мне нравится " + favFood[i]);
                    break;
                case "Всё":
                    System.out.println("Прям всё ешь? А ты не толстый? Сколько весишь?");
                    int weight = Integer.parseInt(in.nextLine());
                    if (weight > 90) System.out.println("А ты пухляш, " + name + ":)");
                    else
                        System.out.println("Ты точно прямо всё ешь? Наверное ты ешь немного, но всё, да, " + name + "?:)");
                    break;
                case "Все":
                    System.out.println("Прям всё ешь? А ты не толстый? Сколько весишь, пухляш?");
                    weight = Integer.parseInt(in.nextLine());
                    if (weight > 90) System.out.println("А ты толстячок, " + name + ":)");
                    else
                        System.out.println("Ты точно прямо всё ешь? Наверное ты ешь немного, но всё, да, " + name + "?:)");
                    break;
                default:
                    System.out.println("Ммммм, наверное, вкусно, а мне больше всего нравится...\nА не скажу! Угадай!");
                    int flag = 0;
                    String favoritfood;
                    while (flag < 2) {
                        favoritfood = in.nextLine();
                        if(favoritfood.equals("Сдаюсь")||favoritfood.equals("Не знаю")||favoritfood.equals("Хз")){
                            flag=2;
                            break;
                        }
                        else if (favoritfood.equals(favFood[i])) {
                            System.out.println("Ого, ты угадал!\nИли ты следишь за мной?-.-");
                            break;
                        } else if(flag==0)System.out.println("Не-а, не угадал! Давай ещё разочек");
                        flag++;
                    }
                    if (flag==2)System.out.println("Ха-ха! Так и не угадал, а мне на самом я люблю "+favFood[i]+"!:D");
                    break;
            }
        }

        System.out.println("\nНе надоело ещё?");
        String boring = in.nextLine();
        switch (boring){
            case "Да":
            case "Нет":
                System.out.println("\""+boring+", надоело\" или \""+boring+", не надоело\"?");
                boring = in.nextLine();
                switch (boring){
                    case "Да":
                    case "Нет":
                        System.out.println("Да ты издеваешься!");
                        boring = in.nextLine();
                        if(boring.equals("Ага")||boring.equals("Да")||boring.equals("Конечно")){
                            System.out.println("Ой, всё");
                            System.out.println("\nProcess finished wit error code \"Обидка\"");
                            System.out.println("\nПохоже Программа на Вас обиделась. Попробуйте попозже, когда она остынет.");
                            return;
                        }
                        else System.out.println("Смотри мне-.-\nТогда мы продолжаем!");
                        break;
                    case "Надоело":
                        System.out.println("Что же, пока! Надеюсь, потом ты пройдёшь мою анкету полностью!");
                        return;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        System.out.println("На этом пока что всё.¯\\_(ツ)_/¯");
    }
}