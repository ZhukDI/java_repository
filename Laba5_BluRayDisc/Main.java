package Laba_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Уравнения", "doc", 5);
        File file2 = new File("Логарифмы", "doc", 7.3f);
        System.out.println(file1);
        System.out.println(file2);

        ArrayList<File> files  = new ArrayList<>();
        files.add(file1);
        files.add(file2);
        Subdirectory subdirectory1 = new Subdirectory("Математика", files);
        System.out.println(subdirectory1);

        ArrayList<Subdirectory> subdirectories = new ArrayList<>();
        subdirectories.add(subdirectory1);
        BluRayDisc.Directory directory1 = new BluRayDisc.Directory("Школа", subdirectories);
        System.out.println(directory1);

        ArrayList<BluRayDisc.Directory> directories = new ArrayList<>();
        directories.add(directory1);
        BluRayDisc bluRayDisc = new BluRayDisc(25, 2006, directories);
        System.out.println(bluRayDisc);
    }
}
