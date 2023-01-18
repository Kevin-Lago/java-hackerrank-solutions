package vanilla_java.advanced.covariant_return_types;

class WestBengal extends Region {
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}
