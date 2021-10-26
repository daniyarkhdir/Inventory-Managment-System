package Controller;
import Models.Items;
import java.util.*;

public class Item {
    public static LinkedList<Items> items =new LinkedList<>();
    public static void addItem(Items item){
        int itemIndex = findItem(item.getItemId());
        if (itemIndex > -1) {
            System.out.println("Item with  id [ "+item.getItemId()+" ] is already exist , cannot add");
        }
        else{
        items.add(item);
        System.out.println("Item with id [ "+item.getItemId()+" ] added");
        }
        
    }
    public static void deleteItem(int itemId) {
        int itemIndex = findItem(itemId);
        if (itemIndex == -1) {
            System.out.println("no Item with Id  : " + itemId + " is available.\ndeleting Item failed.");
        }
        else{
        System.out.println("Item with Id : " + itemId + " was successfully deleted.");
        items.remove(itemIndex);
        }

    }
    public static Items updateItem(Items itm){
        return items.set(findItem(itm.getItemId()), itm);
    }
    public static int findItem(int itemId){
        for (int i = 0; i < items.size(); i++) {
            Items item=items.get(i);
            if (item.getItemId()==itemId) {
               return i; 
            }
        }
            return -1;
        }
    
}