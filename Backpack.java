package lesson5.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Backpack
{
    private final ArrayList<Item> items;
    private final int maxWeight;

    private ArrayList<Item> optimalList = null;
    private int optimalPrice = 0;

    public Backpack(ArrayList<Item> items, int maxWeight)
    {
        if (items == null)
            throw new IllegalArgumentException("items: " + items);

        this.items = items;
        this.maxWeight = maxWeight;
    }

    public void Resolve()
    {
        checkItems(items);
    }

    public List<Item> getOptimalList()
    {
        return optimalList;
    }

    private int itemsWeight(ArrayList<Item> items)
    {
        int sum = 0;

        for (Item item : items) {
            sum += item.getWeight();
        }

        return sum;
    }

    private int itemsPrice(ArrayList<Item> items)
    {
        int sum = 0;

        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    private void checkOptimalItems(ArrayList<Item> items)
    {
        int itemsWeight = itemsWeight(items);
        int itemsPrice = itemsPrice(items);

        if (itemsWeight <= maxWeight && itemsPrice > optimalPrice)
        {
            optimalPrice = itemsPrice;
            optimalList = items;
        }
    }

    private void checkItems(ArrayList<Item> items)
    {
        if (items.size() > 0)
            checkOptimalItems(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newList = new ArrayList<>(items);

            newList.remove(i);

            checkItems(newList);
        }

    }
}