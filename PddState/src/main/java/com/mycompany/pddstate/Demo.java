package com.mycompany.pddstate;

/**
 *
 * @author Bryan
 */

import ui.Player;
import ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
