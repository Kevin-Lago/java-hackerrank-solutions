package vanilla_java.data_structures.java_comparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score > p2.score) {
            return -1;
        } else if (p1.score < p2.score) {
            return 1;
        }
        return p1.name.compareToIgnoreCase(p2.name);
    }
}
