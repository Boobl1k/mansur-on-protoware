package org.example.module9.gof_patterns.task2;

public class CoffeeDecoratorExample {
    interface Coffee {
        double getCost();
    }

    static class SimpleCoffee implements Coffee {
        public double getCost() {
            return 1.0;
        }
    }

    abstract static class CoffeeDecorator implements Coffee {
        protected Coffee decoratedCoffee;

        public CoffeeDecorator(Coffee decoratedCoffee) {
            this.decoratedCoffee = decoratedCoffee;
        }

        public double getCost() {
            return decoratedCoffee.getCost();
        }
    }

    static class MilkCoffeeDecorator extends CoffeeDecorator {
        public MilkCoffeeDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        public double getCost() {
            return super.getCost() + 0.5;
        }
    }

    static class SugarCoffeeDecorator extends CoffeeDecorator {
        public SugarCoffeeDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        public double getCost() {
            return super.getCost() + 0.2;
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: $" + coffee.getCost());

        Coffee milkCoffee = new MilkCoffeeDecorator(coffee);
        System.out.println("Cost of Coffee with Milk: $" + milkCoffee.getCost());

        Coffee sugarMilkCoffee = new SugarCoffeeDecorator(milkCoffee);
        System.out.println("Cost of Coffee with Milk and Sugar: $" + sugarMilkCoffee.getCost());
    }
}
