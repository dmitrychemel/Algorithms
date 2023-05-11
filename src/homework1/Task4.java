package homework1;

public class Task4 {
    public static void main(String[] args) {
        double budget = 1000;
        int costPizza = 230;
        int costGum = 26;
        double costCandy = 2.5;

        int quantityPizza = 0;
        while(budget>costPizza){
            budget = budget - costPizza;
            quantityPizza++;
        }

        int quantityGum = 0;
        while(budget>costGum){
            budget = budget - costGum;
            quantityGum++;
        }

        int quantityCandy = 0;
        while(budget>costCandy){
            budget = budget - costCandy;
            quantityCandy++;
        }

        System.out.println("На эту сумму мы можем купить:" +
                "\n" + quantityPizza + " Пиццы" +
                "\n" + quantityGum + " Жевачки" +
                "\n" + quantityCandy + " Конфеты"+
                "\n" + "Сдача осталось: " + budget);
    }
}
