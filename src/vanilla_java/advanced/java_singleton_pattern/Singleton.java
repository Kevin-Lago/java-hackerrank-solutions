package vanilla_java.advanced.java_singleton_pattern;

class Singleton {
    static Singleton instance = null;
    public String str;

    private Singleton() {

    }

    static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
