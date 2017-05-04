package Laba_5;

import java.util.ArrayList;

public class BluRayDisc {
    int capacity;
    int yearOfIssue;
    ArrayList<Directory> directories;

    public BluRayDisc(int capacity, int yearOfIssue, ArrayList<Directory> directories) {
        this.capacity = capacity;
        this.yearOfIssue = yearOfIssue;
        this.directories = directories;
    }

    @Override
    public String toString() {
        return "BluRayDisc{" +
                "capacity=" + capacity +
                ", yearOfIssue=" + yearOfIssue +
                ", directories=" + directories +
                '}';
    }

    // внутренний класс
    static class Directory {
        String name;
        ArrayList<Subdirectory> subdirectories;

        public Directory(String name, ArrayList<Subdirectory> subdirectories) {
            this.name = name;
            this.subdirectories = subdirectories;
        }

        @Override
        public String toString() {
            return "Directory{" +
                    "name='" + name + '\'' +
                    ", subdirectories=" + subdirectories +
                    '}';
        }
    }
}
