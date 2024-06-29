package annnotationExample;

import java.lang.annotation.*;
import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        Fish[] fish = new Fish[3];
        fish[0] = new Pike();
        fish[1] = new CatFish();
        fish[2] = new Salmon();

        System.out.println("Запрет на вылов рыб: ");
        Arrays.stream(fish).forEach(fish1 -> {
            Class<?> fishClass = fish1.getClass(); //получаем класс нашей рыбы
            FishingBan annotation = fishClass.getAnnotation(FishingBan.class); // берем аннотации от определенной рыбы
            if(annotation != null){
                System.out.print(fishClass.getSimpleName() + ": ");
                Arrays.stream(annotation.months()).forEach(System.out::print);
                System.out.println();
            }
        });
    }
}
public class Fish {
    public void toSwim(){

    }
}
@FishingBan(months = {Month.JANUARY})
class Pike extends Fish{ }

@FishingBan(months = {Month.SEPTEMBER})
class CatFish extends Fish{ }

@FishingBan(months = {Month.MAY, Month.JUNE})
class Salmon extends Fish{ }

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface FishingBan{
    Month[] months();
}

enum Month{
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST
}