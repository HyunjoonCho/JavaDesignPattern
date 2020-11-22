package org.hyunjoon.designpattern.decorator;

import java.util.Objects;

public class StringDisplay extends Display {
    private final String string;

    public StringDisplay(String string) {
        this.string = Objects.requireNonNull(string, "string");
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return null;
    }
}
