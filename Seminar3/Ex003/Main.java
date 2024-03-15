package Seminar3.Ex003;

public class Main {

    // Создайте класс Счетчик, у которого есть метод add(), увеличивающий
    // значение внутреннейint переменнойна 1.Сделайте так, чтобы с объектом
    // такого типа можно было работать в блоке try-with-resources. Нужно бросить
    // исключение, еслиработа с объектом типа счетчикбылане в ресурсномtry
    // и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
    // лучше всего.

    public static void main(String[] args) {
        try (CountTask2 ct = new CountTask2()) {
            ct.add();
            ct.add();
            System.out.println(ct.getValue());
            ct.close();
            ct.add();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
