package Laba_5;

public class File {
    String name;
    String type;
    float size;

    public File(String name, String type, float size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                name  +
                "." + type +
                ", " + size + " mb" +
                '}';
    }
}
