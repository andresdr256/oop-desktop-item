package oop.desktopitem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends DesktopItem implements Group{

    List<DesktopItem> items = new ArrayList<DesktopItem>();

    @Override
    public boolean add(DesktopItem item) {
        return false;
    }

    public void Folder(String name){

    }

    public void open(){

    }

    public int size(){

        return 0;
    }
}
