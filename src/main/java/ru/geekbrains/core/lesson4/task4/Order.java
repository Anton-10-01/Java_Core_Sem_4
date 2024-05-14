package ru.geekbrains.core.lesson4.task4;

public class Order {
    Customer customer;
    Item item;
    /**
     * Кол-во товаров
     */
    int count;

    public Order(Customer customer, Item item, int count) {
        this.customer = customer;
        this.item = item;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Заказ{\n" +
                "\tПокупатель: " + customer +
                "\n\tТовар: " + item +
                "\n\tКол-во: " + count +
                "\n}";
    }
}
