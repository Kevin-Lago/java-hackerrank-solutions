package vanilla_java.advanced.covariant_return_types;

class AndhraPradesh extends Region {
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}
