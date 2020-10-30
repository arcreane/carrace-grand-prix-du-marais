
package com.company;

import org.fusesource.jansi.Ansi;
public class Color {
    public Color() {
        System.out.println("Please select the car color you want");
        for (final Ansi.Color item : Ansi.Color.values()) {
            System.out.print(Ansi.ansi().fg(item).a(Ansi.Attribute.INTENSITY_BOLD));
            System.out.println(item);
        }
    }

}
