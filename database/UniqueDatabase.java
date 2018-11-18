package database;

import store.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueDatabase {
    private static UniqueDatabase ourInstance;
    private FileWriter file;
    private String FileName;
    private ArrayList<Order> OrderList = new ArrayList<Order>();

    public static UniqueDatabase getInstance(String fileName) throws IOException {
        if (ourInstance == null){
            ourInstance = new UniqueDatabase(fileName);
        }
        return ourInstance;
    }

    private UniqueDatabase(String fileName) throws IOException {
        FileName = fileName;
        file = new FileWriter(fileName);
    }

    public void add(Order order) throws IOException {
        OrderList.add(order);
    }

    public void commit() throws IOException {
        if(file == null){
            file = new FileWriter(FileName);
        }

        for(Order o: OrderList)
            file.append(o.toString());

        file.close();
        file = null;
        OrderList.clear();
    }
}
