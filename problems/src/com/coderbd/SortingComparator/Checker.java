package com.coderbd.SortingComparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    // complete this method

    public int compare(Player a, Player b) {
        Player p1 = (Player) a;
        Player p2 = (Player) b;
        if (p1.score > p2.score) {
            return 1;
        } else if (p1.score == p2.score) {

            return p1.name.compareTo(p2.name);
        } else {
            return -1;
        }

    }
}
