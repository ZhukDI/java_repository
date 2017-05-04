package Laba_5;

import java.util.ArrayList;

public class Subdirectory {
    String name;
    ArrayList<File> files;

    public Subdirectory(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    @Override
    public String toString() {
        return "Subdirectory{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }
}
