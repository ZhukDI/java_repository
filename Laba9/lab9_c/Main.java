package lab9_c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original = "";
        try{
            Scanner sc = new Scanner(new File("src/test/text.txt"));

            while(sc.hasNext()) {
                original+=sc.nextLine();
                original+='\n';
            }

            sc.close();
        }catch(FileNotFoundException e){e.printStackTrace();}
        System.out.println(original);

        String clean = original.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "" );
        System.out.println("Программа без комментариев:");
        System.out.println(clean);
    }
}
