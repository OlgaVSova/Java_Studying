import java.util.Scanner;

//Lesson 2: if, cycles
public class Task2 {                    //программа для кипятильника
    Thermometer thermometer = ...       //создание переменных в классах термометр и переключение
    Switch switch = ...
    Switch cancelled = ...

    public void brewJug(){
        while(thermometer.probe()<95 && !cancelled.pressed()){
            switch.on();
            if(cancelled.pressed()){
                break; //выход из ближайшего цикла
            }
        }
    switch.off();
    }

    public boolean notReady(){
        return thermometer.probe()<95 //return позволяет вернуть значение, если заявлени тип не void
    }
}
//&& == and, && !statement == not
// || == or

public class FindW{
    public Woman loookup{
        Woman theBestSoFar = next();

        do{
            Woman candidate = next();
            if(candidate.salary() > mySalary()){
                continue;
            }
            if(candidate.weight() < theBestSoFar){
                theBestSoFar = candidate;
            }
        }while(!tooLate());
        return theBestSoFar;
    }
}

public class FindW{    //поиск минимума
    public Woman loookup(int max){
        Woman theBestSoFar = next();

        for(int attempt=1; attempt<max; attempt++){ //счётчик ++ == +1
            Woman candidate = next();
            if(candidate.salary() > mySalary()){
                continue;
            }
            if(candidate.weight() < theBestSoFar){
                theBestSoFar = candidate;
            }
        }while(!tooLate());
        return theBestSoFar;
    }
}

