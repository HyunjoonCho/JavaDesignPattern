package org.hyunjoon.designpattern.bridge.impl;

import org.hyunjoon.designpattern.bridge.impl.DisplayImpl;

public class StringDisplayImpl extends DisplayImpl {
    private final String string;
    private final int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");

        for(int i = 0; i < width; i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}
