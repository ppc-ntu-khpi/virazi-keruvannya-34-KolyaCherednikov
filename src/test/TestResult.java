package test;
import domain.Exercise;
/**
 * Содержит реализацию метода
 * @author Коля
 */
public class TestResult {

    /**
     * Вывод на экран подсчёта количества техники сколько надо списать
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Кол-во списаной техники: "+ Exercise.Calculate());
    }
    
}
