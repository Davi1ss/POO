package unidad_4_2;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<String> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}
