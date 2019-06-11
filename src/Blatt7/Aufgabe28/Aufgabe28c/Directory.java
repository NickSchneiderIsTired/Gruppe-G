package Blatt7.Aufgabe28.Aufgabe28c;

import java.util.ArrayList;

public class Directory extends AbstractFile {

    private ArrayList<Directory> elements;

    public Directory(String name) throws IllegalArgumentException {
        super(name);
        elements = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

}
