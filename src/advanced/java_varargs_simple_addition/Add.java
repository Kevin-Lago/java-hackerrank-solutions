package advanced.java_varargs_simple_addition;

class Add {

    public void add(int ...n) {
        String output = "";
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            output += n[i];
            sum += n[i];

            if (i < n.length - 1) {
                output += "+";
            }
        }

        System.out.println(output + "=" + sum);
    }

}
