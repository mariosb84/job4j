package ru.job4j.oop;

public final class LiquidationProduct  {
    private Product product;
    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
      //  super(name, price);
    }

   /* @Override
    public int discount() {
        return 90;
    }

    @Override
    public String label() {
        return name + " " + price();*/

        public String label() {
            return product.label();
        }
    }

