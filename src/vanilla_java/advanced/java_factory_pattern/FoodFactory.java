package vanilla_java.advanced.java_factory_pattern;

class FoodFactory {

    public Food getFood(String order) {
        if (order.equals("pizza")) {
            return new Pizza();
        }

        return new Cake();
    }

}
