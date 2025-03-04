/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author tungi
 */
public class ItemList {

    private Item[] list;
    private int numberOfItems;
    private int MAX = 100;

    public ItemList() {
        this.list = new Item[MAX];
        numberOfItems = 0;
    }

    public boolean addItem(Item item) {
        if (item == null || numberOfItems >= MAX) {
            return false;
        }
        list[numberOfItems] = item;
        numberOfItems++;
        return true;
    }

    public void displayAll() {
        if (numberOfItems == 0) {
            System.out.println("The list is emplty!");
        } else {
            for (int i = 0; i < numberOfItems; i++) {
                System.out.println(list[i]);
            }
        }
    }

    public Item findItem(String creator) {
        for (Item item : list) {
            if (item.getCreator().equals(creator)) {
                return item;
            }
        }
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < 10; i++) {
            Item item = list[i];
            if (item.getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            list[index].input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            for (int j = index; j < numberOfItems; j++) {
                list[j] = list[j + 1];
            }
            numberOfItems--;
            return true;
        }
        return false;
    }

    public void displayItemsByType(String type) {
        // type: "Vase" , "Painting", "Statue"
        // instanceof
        for (Item item : list) {
//            if (type.equals("Vase") && item instanceof Vase) {
//                System.out.println(item);
//            }
//            if (type.equals("Painting") && item instanceof Painting) {
//                System.out.println(item);
//            }
//            if (type.equals("Statue") && item instanceof Statue) {
//                System.out.println(item);
//            }

            if (type.equals("Vase")) {
                for (int i = 0; i < numberOfItems; i++) {
                    if (list[i] instanceof Vase) {
                        System.out.println(list[i]);
                    }
                }
            } else if (type.equals("Statue")) {
                for (int i = 0; i < numberOfItems; i++) {
                    if (list[i] instanceof Statue) {
                        System.out.println(list[i]);
                    }
                }
            } else {
                for (int i = 0; i < numberOfItems; i++) {
                    if (list[i] instanceof Painting) {
                        System.out.println(list[i]);
                    }
                }
            }

        }
    }

    public void sortItems() {
        for (int i = 0; i < numberOfItems; i++) {
            for (int j = numberOfItems - 1; j > i; j--) {
                if (list[i].getValue() < list[j - 1].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

}
